//zadanie 12
package restOfPackages;

public class Course {
    private String name;
    private Student[] students;
    private int enrolledStudents = 0;
    private static final int maxStudents = 100;
    private static int numberOfCreatedCourses = 0;

    public Course(String name) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Nazwa kursu nie powinna byc pusta.");
        }
        this.name = name;
        this.students = new Student[maxStudents];
        numberOfCreatedCourses++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public static int getNumberOfCreatedCourses() {
        return numberOfCreatedCourses;
    }

    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student musi istniec.");
        }
        if (enrolledStudents >= maxStudents){
            throw new IllegalStateException("Osiagnieto maksymalna liczbe kursantow.");
        }
        this.students[enrolledStudents++] = student;
    }

    public void addStudent(String name, int albumNumber) {
        addStudent(new Student(name, albumNumber));
    }

}
