
class Z {}
class C extends Z implements Runnable {
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


class D implements Runnable{
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


public class test {
    public static void main(String[] args) {
        Runnable obj1 = new C();
        Runnable obj2 = new D();


        Thread T1 = new Thread(obj1);
        Thread T2 = new Thread(obj2);

        T1.start();
        T2.start();

    }

}