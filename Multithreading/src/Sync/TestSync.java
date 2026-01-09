package Sync;

class TablePrintWithMethods{
    int sum=0;
    synchronized public void printTable(){
        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

}
class Mythread6 extends Thread{
    TablePrintWithMethods t;
    Mythread6(TablePrintWithMethods t){
        this.t=t;
    }
    public void run(){
        t.printTable();
    }

}

public class TestSync {
    public static void main(String[] args) {
        TablePrintWithMethods obj = new TablePrintWithMethods();
        Mythread6 t1 = new Mythread6(obj);
        Mythread6 t2 = new Mythread6(obj);
        t1.setName("thread 1");
        t2.setName("thread 2");
        t1.start();
        t2.start();
        // wait for threads to finish
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main end " + obj.sum);
    }
}
