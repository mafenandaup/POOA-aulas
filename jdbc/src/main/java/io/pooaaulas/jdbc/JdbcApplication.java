package io.pooaaulas.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.*;

@SpringBootApplication
public class JdbcApplication {

    @Autowired
    private DriverManager driverManager; // Gerencia os drivers e retorna uma Connection para um banco de dados.

    @Autowired
    private Connection con; ////Representa a conexão com o banco.

    @Autowired
    private PreparedStatement preparedStatement; //Permite instruções pré-compiladas com parâmetros:

    @Autowired
    private Statement statement; // Permite enviar instruções SQL ao banco.

    @Autowired
    private ResultSet results; //percorre os resultados retornados por uma query.


    public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

}
