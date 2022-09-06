package com.aam134134.springflyway;

import org.testcontainers.containers.PostgreSQLContainer;

public class JDBCServerContainer extends PostgreSQLContainer<JDBCServerContainer> {
    private static final String IMAGE_VERSION = "postgres:14.5";
    private static JDBCServerContainer container;

    private JDBCServerContainer() {
        super(IMAGE_VERSION);
    }

    public static JDBCServerContainer getInstance() {
        if (container == null) {
            container = new JDBCServerContainer();
        }

        return container;
    }

    @Override
    public void start() {
        super.start();
        // set env vars that are in the application.yml
        System.setProperty("DB_URL", container.getJdbcUrl());
        System.setProperty("DB_USERNAME", container.getUsername());
        System.setProperty("DB_PASSWORD", container.getPassword());
    }
}
