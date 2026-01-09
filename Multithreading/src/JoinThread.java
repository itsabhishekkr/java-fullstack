class MyThread5 extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread5 t1 = new MyThread5();
        MyThread5 t2 = new MyThread5();
        MyThread5 t3 = new MyThread5();

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        System.out.println("t1 start");
        t1.start();
        System.out.println("thread start join t1");
        t1.join();   // main waits for t1 to finish
        System.out.println("t2 start");
        t2.start();
        System.out.println("thread start join t2");
        t2.join();
        System.out.println("thread end Last");
    }
}

