public class ThrowsException {
    public static void main(String[] args) {
        System.out.println("main start");
        m1();
        System.out.println("main end");
    }
    public static void m1(){
        System.out.println("m1 start");
        m2();
        System.out.println("m1 end");
    }
    public static void m2(){
        System.out.println("m2 start");
        try {
            m3();
        } catch (Exception e) {
           System.out.println(e.toString());
        }
        finally {
            System.out.println("m3 end in m2");
        }
        System.out.println("m2 end");
    }
    public static void m3() throws ArithmeticException {
        System.out.println("m3 start");
        int a = 10/0;
        System.out.println("m3 end");
    }
}
