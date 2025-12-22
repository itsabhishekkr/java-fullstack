class LowBalance extends Exception {
    public LowBalance(String message) { // this is custoructor of the LowBalance class
        super(message);
    }
}
public class CreateOwnException {
    public static void main(String[] args) {
        customer();
    }
    public static void customer(){
        bank();
    }
    public static void bank(){
        try {
            withdrawal(100,200);
        }
        catch(LowBalance e){
            System.out.println("Low Balance Exception" + e.toString());
        }
    }
    public static void withdrawal(int Totalamount,int withdrawamount) throws LowBalance {
        if (Totalamount < withdrawamount){
            throw new LowBalance("total amount is vary less");
        }
    }
}
