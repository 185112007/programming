-- INSERT INTO:
INSERT INTO courses (title, length, description)
VALUES('Java 1', 40, 'Java Intro');

SELECT * FROM courses;

-- UPDATE:
UPDATE courses SET length=length*1.2
WHERE id = 8;

-- DELETE:
DELETE FROM courses
where id = 8;