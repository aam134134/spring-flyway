# Project Overview
Spring Boot App with Flyway DB Impl; Includes Testcontainers tests to exercise scripts against actual Postgres instance

Requires Docker Desktop to be installed on the host build machine/CICD image

# Testing
Run: gradle test

Observe: Flyway logging during Spring Boot startup
- Creating Schema History table "public"."flyway_schema_history" ...
