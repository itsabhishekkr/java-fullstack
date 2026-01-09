class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread start");
    }
}


public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
