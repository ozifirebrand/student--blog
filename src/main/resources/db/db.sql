create database if not exists Student;

-- create user if not exists  'root'@'localhost';
create user if not exists  'studentBlog'@'localhost' identified by 'student111';

grant all privileges on Student.* to 'studentBlog'@'localhost';
flush privileges;