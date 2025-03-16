package dio.board;

import java.sql.SQLException;

import dio.board.persistence.migration.MigrationStrategy;

import static dio.board.persistence.config.ConnectionConfig.getConnection;

public class Main {

    public static void main(String[] args) throws SQLException {
        try (var connection = getConnection()) {
            new MigrationStrategy(connection).executeMigration();
        }

    }
}