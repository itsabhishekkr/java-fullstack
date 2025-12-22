public class ArithmaticDemo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        try{
            int a=10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
        finally{
            System.out.println("Good Bye");
        }
    }
}
