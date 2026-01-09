package Sync;

class TablePrintWithMethod{
    int sum=0;
    public void printTable(){
        synchronized (this) {
            for(int i=0;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+":"+i);
                sum=sum+1;
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){}
            }
        }
    }

}
class Mythread7 extends Thread{
    TablePrintWithMethod t;
    Mythread7(TablePrintWithMethod t){
        this.t=t;
    }
    public void run(){
        t.printTable();
    }

}

public class SyncBlock {
    public static void main(String[] args) {
        TablePrintWithMethod obj = new TablePrintWithMethod();
        Mythread7 t1 = new Mythread7(obj);
        Mythread7 t2 = new Mythread7(obj);
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
