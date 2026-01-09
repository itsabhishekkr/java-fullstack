class Even extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=10;i=i+2){
            System.out.println("even"+i);
        }
    }
}
class Odd extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=10;i=i+2){
            System.out.println("odd"+i);
        }
    }
}

public class PrintEvenOdd {
    public static void main(String[] args) {
        Even even=new Even();
        even.start();
        Odd odd=new Odd();
        odd.start();
    }
}
