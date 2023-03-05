CREATE DATABASE GAI;

CREATE TABLE Violations
(
    id SERIAL PRIMARY KEY,
    car TEXT NOT NULL,
    violator TEXT NOT NULL,
    officer TEXT NOT NULL,
    date TEXT NOT NULL,
    amount TEXT NOT NULL,
    datePaid TEXT,
    dateToPay TEXT NOT NULL,
    isSubponea BOOLEAN NOT NULL,
    isPaid BOOLEAN NOT NULL
);