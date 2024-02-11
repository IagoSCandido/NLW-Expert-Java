// package com.iagoscandido.seed;

// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;

// import javax.sql.DataSource;

// import
// org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Env;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.jdbc.datasource.DriverManagerDataSource;

// import lombok.RequiredArgsConstructor;

// public class CreateSeed {
// private final JdbcTemplate jdbcTemplate;

// public CreateSeed(DataSource dataSource) {
// this.jdbcTemplate = new JdbcTemplate(dataSource);
// }

// public static void main(String[] args) {
// DriverManagerDataSource dataSource = new DriverManagerDataSource();
// dataSource.setDriverClassName("org.postgresql.Driver");
// dataSource.setUrl("jdbc:postgresql://localhost:5432/pg_nlw");
// dataSource.setUsername("admin");
// dataSource.setPassword("admin");

// CreateSeed createSeed = new CreateSeed(dataSource);
// createSeed.run(args);

// }

// public void run(String... args) {
// executeSQLFile("src/main/resources/sql/03-insert-info.sql");
// }

// public void executeSQLFile(String filePath) {
// try {
// String sqlScript = new String(Files.readAllBytes(Paths.get(filePath)));

// jdbcTemplate.execute(sqlScript);
// System.out.println("Seed realizado com sucesso");
// } catch (IOException e) {
// System.err.println("Erro ao executar o arquivo" + e.getMessage());
// }
// }

// }
