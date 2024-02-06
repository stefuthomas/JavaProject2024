package Tehtavat4;
import java.io.*;

class Student implements Serializable {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}

class Course implements Serializable {
    private String courseName;
    private String courseCode;
    private String instructor;

    public Course(String courseName, String courseCode, String instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getInstructor() {
        return instructor;
    }
}

class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }
}

public class Main {
    private final static String FILENAME = "enrollment.ser";
    public static void main(String[] args) {
        // Create instances of Student, Course, and Enrollment
        Student student = new Student(1, "Jartsa", 20);
        Course course = new Course("Ohjelmointi 1", "OHJ1", "Reijo");
        Enrollment enrollment = new Enrollment(student, course, "2021-01-01");
        // Serialize and save the Enrollment instance
            try (
                    FileInputStream inputStream = new FileInputStream(FILENAME);
                    ObjectInputStream objects = new ObjectInputStream(inputStream);
                    ) {
                student = (Student) objects.readObject();
                course = (Course) objects.readObject();
                enrollment = (Enrollment) objects.readObject();

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        // Deserialize and print the Enrollment instance
        try (
                FileOutputStream outputStream = new FileOutputStream(FILENAME);
                ObjectOutputStream objects = new ObjectOutputStream(outputStream);
                ) {
            objects.writeObject(student);
            objects.writeObject(course);
            objects.writeObject(enrollment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}