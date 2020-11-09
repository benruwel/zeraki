CREATE DATABASE education;
use education;

CREATE TABLE student(
    studentid int(11) NOT NULL AUTO_INCREMENT,
    name varchar(250),
    course int(11),
    PRIMARY KEY(studentid),
    FOREIGN KEY(course) REFERENCES course(courseid)
);

CREATE TABLE IF NOT EXISTS course(
    courseid int(11) NOT NULL AUTO_INCREMENT,
    name varchar(250),
    institution int(11),
    PRIMARY KEY(courseid),
    FOREIGN KEY(institution) REFERENCES institution(institutionid)
);

CREATE TABLE institution(
    institutionid int(11) NOT NULL AUTO_INCREMENT,
    name varchar(250),
    PRIMARY KEY(institutionid)
);