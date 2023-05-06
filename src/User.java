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
    private double average;
    public Student(String name, int grade, double average) {
        super(name);
        this.grade = grade;
        this.average = average;
    }
    public int getGrade(){
        return grade;
    }
    public double getAverage() {
        return average;
    }
    private LinkedList<Student> students = new LinkedList<>();

    public LinkedList<Student> getStudents() {
        return students;
    }
    public void addStudents(LinkedList<Student>s){
        students = (LinkedList<Student>) s.clone();
    }
    public void run(){
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Name: " + students.get(i).getName() + "Grade: " + students.get(i).getGrade() + "Average: " + students.get(i).getAverage());
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
    private double salary;
    public Teacher(String name, String subject, double salary){
        super(name);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }
    private LinkedList<Teacher> teachers = new LinkedList<>();

    public LinkedList<Teacher> getTeachers() {
        return teachers;
    }
    public void addTeachers(LinkedList<Teacher> t){
        teachers = (LinkedList<Teacher>) t.clone();
    }

    @Override
    public void run() {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println("Name: " + teachers.get(i).getName() + "Subject: " + teachers.get(i).getSubject() + "Salary: " + teachers.get(i).getSalary());
            try{
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}