
CREATE VIEW [Number of students per course per institution] AS
SELECT institution.name AS [INSTITUTION NAME], course.name AS [COURSE NAME], 
COUNT(students) ASC AS [NUMBER OF STUDENTS] FROM students
INNER JOIN institution ON institution.institutionid = course.institution
INNER JOIN course ON student.course = course.course;

SELECT * FROM [Number of students per course per institution];

