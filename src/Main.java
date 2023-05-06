import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Scanner scan2 = new Scanner(System.in);
    public static void main(String[] args) {
        Teacher t = new Teacher("", "", 0);
        Student s = new Student("", 0, 0);
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(s);
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
                    add();
                    break;
                case 2:
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
                float average = scan.nextFloat();
                Student s = new Student(name, grade, average);
                s.getStudents().add(s);
                break;
            case 2:
                System.out.println("Name:");
                name = scan2.nextLine();
                System.out.println("Subject:");
                String subject = scan2.nextLine();
                System.out.println("Salary:");
                float salary = scan.nextFloat();
                Teacher t = new Teacher(name, subject, salary);
                t.getTeachers().add(t);
                break;
        }
    }
}