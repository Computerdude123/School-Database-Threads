import java.util.LinkedList;
import java.util.Scanner;

class User {
    private String name;
    public User(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class Student extends User implements Runnable{
    private int grade;
    private float average;
    public Student(String name, int grade, float average) {
        super(name);
        this.grade = grade;
        this.average = average;
    }
    public int getGrade(){
        return grade;
    }
    public float getAverage() {
        return average;
    }
    private LinkedList<Student> students = new LinkedList<>();

    public LinkedList<Student> getStudents() {
        return students;
    }
    public void run(){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
            try{
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Teacher extends User implements Runnable{
    private String subject;
    private float salary;
    public Teacher(String name, String subject, float salary){
        super(name);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public float getSalary() {
        return salary;
    }
    private LinkedList<Teacher> teachers = new LinkedList<>();

    public LinkedList<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public void run() {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i));
            try{
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}