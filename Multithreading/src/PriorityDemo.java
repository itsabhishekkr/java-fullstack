class Mythread2 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        Mythread2 t1=new Mythread2();
        t1.setName("thrad of Mythread2");
        t1.setPriority(Thread.MIN_PRIORITY);


        Mythread2 t2=new Mythread2();
        t2.setName("thrad of Mythread2 t2 second times");
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
