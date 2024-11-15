CREATE TABLE votes (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL UNIQUE,
    vote INT DEFAULT 0
);
INSERT INTO votes(name, vote) VALUES ('vote1', 0);
INSERT INTO votes(name, vote) VALUES ('vote2', 0);
