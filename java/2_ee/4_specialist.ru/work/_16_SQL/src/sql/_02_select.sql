				-- SELECT:
-- select all courses:
SELECT * FROM courses;

-- select all courses sorted by title:
SELECT * FROM courses
ORDER BY title;

-- select title and length from courses:
SELECT title, length FROM courses;

-- select title and length from courses where length > 30 and sorted by title:
SELECT title, length FROM courses
WHERE length>30
ORDER BY title;

-- select title and length from courses where title like "...web..." and sorted by title:
SELECT title, length FROM courses
WHERE title like '%web%'
ORDER BY title;

/*
select title and length from courses 
where title like "...web..." and length>30 and sorted by title:
*/
SELECT title, length FROM courses
WHERE title like '%web%' AND length>30
ORDER BY title;

/*
select title, length, descrıbtion from courses 
where title like "...основы..." and length>30 and sorted by title ascending:
*/
SELECT title, length, description FROM courses
WHERE title like '%основы%' AND length>30
ORDER BY title, length ASC;

