class Mythread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadClass {
    public static void main(String[] args) {
        //start()
        //run()
        // getName()
        //setName()
        //setPriority()
        System.out.println(Thread.currentThread().getName());
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        Mythread1 t1=new Mythread1();
        t1.setName("thrad of Mythread1");
        t1.start();

    }
}
