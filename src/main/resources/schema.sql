-- 1. students table
CREATE TABLE students (
                          student_id SERIAL PRIMARY KEY,
                          student_name VARCHAR(100),
                          email VARCHAR(100),
                          phone_number VARCHAR(20)
);

-- 2. instructors table
CREATE TABLE instructors (
                             instructor_id SERIAL PRIMARY KEY,
                             instructor_name VARCHAR(100),
                             email VARCHAR(100)
);

-- 3. courses table
CREATE TABLE courses (
                         course_id SERIAL PRIMARY KEY,
                         course_name VARCHAR(100),
                         description TEXT,
                         instructor_id INT,
                         FOREIGN KEY (instructor_id) REFERENCES instructors(instructor_id)
);

-- 4. student_course (join table)
CREATE TABLE student_course (
                                student_id INT,
                                course_id INT,
                                PRIMARY KEY (student_id, course_id),
                                FOREIGN KEY (student_id) REFERENCES students(student_id),
                                FOREIGN KEY (course_id) REFERENCES courses(course_id)
);
INSERT INTO instructors (instructor_name, email) VALUES
                                                     ('John Doe', 'john@example.com'),
                                                     ('Anna Smith', 'anna@example.com');
INSERT INTO courses (course_name, description, instructor_id) VALUES
                                                                  ('Java Programming', 'Learn Java basics', 1),
                                                                  ('Database Systems', 'Learn PostgreSQL', 2);
INSERT INTO students (student_name, email, phone_number) VALUES
                                                             ('Sarin', 'sarin@gmail.com', '012345678'),
                                                             ('Pojim', 'pojim@gmail.com', '098765432'),
                                                             ('Lymeng', 'lymeng@gmail.com', '011223344');