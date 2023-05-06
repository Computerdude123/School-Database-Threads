import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Scanner scan2 = new Scanner(System.in);
    public static void main(String[] args) {
        Teacher t = new Teacher("", "", 0);
        Student s = new Student("", 0, 0);
        ArrayList<LinkedList> list = new ArrayList<>();
        System.out.println("School Database!!!");
        int o = 0;
        while(o != 3){
            System.out.println("What would you like to do?");
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            o = scan.nextInt();
            switch (o){
                case 1:
                    list = (ArrayList<LinkedList>) addAuto();
                    s.addStudents(list.get(0));
                    t.addTeachers(list.get(1));
                    break;
                case 2:
                    Thread t1 = new Thread(t);
                    Thread t2 = new Thread(s);
                    t1.run();
                    t2.run();
            }
        }
    }
    public static void add(){
        System.out.println("Who would you like to add");
        System.out.println("1. A Student");
        System.out.println("2. A Teacher");
        int o = scan.nextInt();
        String name;
        switch(o){
            case 1:
                System.out.println("Name:");
                name = scan2.nextLine();
                System.out.println("Grade:");
                int grade = scan.nextInt();
                System.out.println("Average");
                double average = scan.nextDouble();
                Student s = new Student(name, grade, average);
                //s.addStudents();
                break;
            case 2:
                System.out.println("Name:");
                name = scan2.nextLine();
                System.out.println("Subject:");
                String subject = scan2.nextLine();
                System.out.println("Salary:");
                double salary = scan.nextDouble();
                Teacher t = new Teacher(name, subject, salary);
               // t.addTeachers();
                break;
        }
    }
    public static List addAuto(){
        LinkedList<Student> students = new LinkedList<Student>();
        LinkedList<Teacher> teachers = new LinkedList<>();
        String[] names = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        int[] grades = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] averages = {1.4, 2.5, 3, 4, 5, 6, 7, 8, 9};

        String[] subjects = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};        String[] names2 = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        double[] salaries = {1.4, 2.5, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < 9; i++) {
            Student s = new Student(names[i], grades[i], averages[i]);
            students.add(s);
            Teacher t = new Teacher(names[i], subjects[i], salaries[i]);
            teachers.add(t);
        }
        List<LinkedList> l = new ArrayList<>();
        l.add(students);
        l.add(teachers);
        return l;
    }
}