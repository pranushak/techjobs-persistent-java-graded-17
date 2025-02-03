--Part 1
Table : Job
columns:
id : INTEGER
employer: VARCHAR
name : VARCHAR
skills : VARCHAR

--Part 2
SELECT name from EMPLOYER where location = "St. Louis City";

--Part 3
DROP TABLE job;

--Part 4
SELECT * FROM skill LEFT JOIN job_skills ON skill.id = job_skills.skills_id WHERE job_skills.jobs_id IS NOT NULL ORDER BY NAME ASC;
