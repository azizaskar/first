# Student Management System

This is a Java program for managing students and courses. It uses object-oriented programming with classes, encapsulation, and arrays of objects.

## Project Overview

The program creates `Student` objects with a name, ID, major, GPA, and credits. It also uses a `Course` class that stores an array of students and calculates statistics such as average GPA and the student with the highest number of credits.  
The main program (`Main` class) demonstrates all features with five students, showing how the classes work together.

Main goals:
- Use private fields and getters/setters for encapsulation
- Work with arrays of `Student` objects
- Calculate basic student statistics (average GPA, honors count, total credits, top GPA)
- Show composition where a `Course` contains multiple `Student` objects

## Class Descriptions

### Student Class

The `Student` class represents one student in the system.

**Private fields:**
- `name` (String) – full student name
- `id` (String) – student ID
- `major` (String) – academic program
- `gpa` (double) – current GPA
- `credits` (int) – total earned credits

**Constructor**

Student(String name, String id, String major)


The constructor sets the `name`, `id`, and `major`, and initializes `gpa` to `0.0` and `credits` to `0`.

**Key methods**
- `addCredits(int c)` – adds credits to the student if `c > 0`
- `updateGPA(double newGPA)` – updates the GPA value
- `isHonors()` – returns `true` if GPA is greater than or equal to `3.5`
- Getters and setters for all fields – provide controlled access to private data
- `toString()` – returns a formatted text description of the student

### Course Class

The `Course` class represents a course that contains multiple students.

**Private fields:**
- `courseName` (String) – name of the course
- `instructor` (String) – instructor name
- `students` (Student[]) – array of `Student` objects

**Constructor**

Course(String courseName, String instructor, int size)


The constructor sets the course name and instructor and creates an array of students with the given size.

**Key methods**
- `addStudent(Student s, int index)` – adds a student to the given position in the array (if the index is valid)
- `courseAverageGPA()` – calculates and returns the average GPA of all non-null students in the array
- `highestCreditStudent()` – returns the student with the highest number of credits in the array
- `toString()` – returns a summary of the course and the list of students in it

### Main Class

The `Main` class contains the `main` method and shows how the system works.

Main actions:
- Creates five `Student` objects with different names, IDs, majors, GPAs, and credits
- Prints each student using `toString()`
- Creates one `Course` object and adds the students into the course array
- Prints the course summary, the student with the highest number of credits, and the average GPA in the course
- Uses separate static methods to process an array of students:
    - `getTopStudent(Student[] arr)` – returns the student with the highest GPA
    - `countHonors(Student[] arr)` – returns how many students are honors students
    - `totalCredits(Student[] arr)` – returns the total number of credits of all students

## Instructions to Compile and Run

1. Open a terminal in the `src/` folder of the project.
2. Compile all Java files:

javac *.java


3. Run the program:

java Main


The program will print information about the five students, the top GPA student, the number of honors students, the total credits, and details about the course.

## Screenshots

- `docs/screenshots/output.png` – screenshot of the program output

## Reflection

In this assignment, I practiced basic Java programming with classes, objects, and arrays. I learned how to use private fields with public getters and setters to apply encapsulation and protect data.

The most difficult part was working with arrays of objects and finding maximum values such as GPA and credits. I also had to fix errors related to indexes and method placement inside the `Main` class, which helped me understand Java syntax better.

Object-oriented programming made the code more organized and reusable. The `Student` class can be used in other programs, and the `Course` class shows how one class can contain many objects of another class through composition.

Overall, this project helped me understand Java classes, loops, conditions, and how to structure a small project using separate files and a clear design.