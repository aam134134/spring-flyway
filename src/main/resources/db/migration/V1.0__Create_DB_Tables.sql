CREATE TABLE lunches (
	lunch_id VARCHAR ( 50 ) PRIMARY KEY,
	lunch_served VARCHAR ( 50 ) UNIQUE NOT NULL,
	made_on TIMESTAMP NOT NULL
);