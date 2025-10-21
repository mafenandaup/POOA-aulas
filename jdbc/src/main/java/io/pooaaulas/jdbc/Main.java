package io.pooaaulas.jdbc;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;

public class Main {

    @Autowired
    private PreparedStatement preparedStatement; //Permite instruções pré-compiladas com parâmetros:

    @Autowired
    private Statement statement; // Permite enviar instruções SQL ao banco.

    @Autowired
    private ResultSet results; //percorre os resultados retornados por uma query.

    @Getter
    @Autowired
    private Connection con; //Representa a conexão com o banco.

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:hsqldb:mem:escola" , "admin", "admin123");

            // Criação da tabela
            Statement stmt = con.createStatement();
            stmt.executeUpdate("CREATE TABLE  IF NOT EXISTS ALUNOS (id INT PRIMARY KEY, nome VARCHAR(100), matricula VARCHAR(20))");

            String sql = "INSERT INTO ALUNOS (id, nome, matricula) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, 123459);
            pstmt.setString(2, "Noodle");
            pstmt.setString(3, "2025001");
            pstmt.executeUpdate();

            pstmt.setInt(1, 2396932);
            pstmt.setString(2, "Stuart");
            pstmt.setString(3, "2025002");
            pstmt.executeUpdate();

            pstmt.setInt(1, 4556305);
            pstmt.setString(2, "Russel");
            pstmt.setString(3, "2025003");
            pstmt.executeUpdate();

            pstmt.setInt(1, 6666666);
            pstmt.setString(2, "Murdoc");
            pstmt.setString(3, "2025004");
            pstmt.executeUpdate();

            ResultSet rs = stmt.executeQuery("SELECT id, nome, matricula FROM alunos");
            System.out.println("\n--- Lista de Alunos ---");
            while (rs.next()) {
                System.out.printf("%d - %s (%s)%n",
                        rs.getInt("id"), rs.getString("nome"), rs.getString("matricula"));
            }

            ResultSet rsConstraint = stmt.executeQuery("SELECT nome FROM alunos WHERE nome LIKE '%u%'");
                System.out.println("\n--- APENAS NOMES COM U ---");
                while (rsConstraint.next()) {
                    System.out.printf("%s%n", rsConstraint.getString("nome"));
}

                    ResultSet rsExample = stmt.executeQuery("SELECT  id, nome, matricula FROM alunos WHERE id <= 4556305 ");
                    System.out.println("\n--- SÓ ID menores ou iguais a  4556305 ---");
            while (rsExample.next()) {
                System.out.printf("%d - %s (%s)%n",
                        rsExample.getInt("id"), rsExample.getString("nome"), rsExample.getString("matricula"));
            }
            }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Conectado!");
    }


}
