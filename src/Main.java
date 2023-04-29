

class A extends Thread {
    public void run(){
        for (int i=0; i<100;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class B extends  Thread{
    public void run(){
        for (int i=0; i<100;i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();


//        priority start form 0 to 10 (lowest highest)
        System.out.println(obj1.getPriority());
        obj1.setPriority(10);
        obj1.start();
        obj2.start();

    }

}