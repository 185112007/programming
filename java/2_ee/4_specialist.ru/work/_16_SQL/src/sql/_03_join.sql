-- SELECT JOIN:
SELECT * FROM lessons;

-- INNER JOIN
SELECT title, room, lesson_date 
FROM lessons 
INNER JOIN courses 
ON lessons.course=courses.id
ORDER BY lesson_date, title;

SELECT title, room, name, lesson_date 
FROM lessons 
INNER JOIN courses ON lessons.course=courses.id
INNER JOIN teachers ON lessons.teacher=teachers.id 
ORDER BY lesson_date, title;

-- LEFT JOIN:
SELECT title, room, name, lesson_date 
FROM lessons 
LEFT JOIN courses ON lessons.course=courses.id
INNER JOIN teachers ON lessons.teacher=teachers.id 
ORDER BY lesson_date, title;

-- RIGHT JOIN:
SELECT title, room, name, lesson_date 
FROM lessons 
RIGHT JOIN courses ON lessons.course=courses.id
INNER JOIN teachers ON lessons.teacher=teachers.id 
ORDER BY lesson_date, title;

-- select name where courses.description like '%основы%':
SELECT DISTINCT name FROM teachers
INNER JOIN lessons ON lessons.teacher = teachers.id
INNER JOIN courses ON lessons.course = courses.id
WHERE title LIKE '%основы%'
ORDER BY name;