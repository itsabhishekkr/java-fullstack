class MyThread4 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(1000); // 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class SleepThread {
    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4();
        t1.setName("Sleep-Thread");
        MyThread4 t2 = new MyThread4();
        t2.setName("Sleep-Thread-2");
        t1.start();
        t2.start();
    }
}
