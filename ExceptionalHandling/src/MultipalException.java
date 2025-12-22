public class MultipalException
{
    public static void main(String[] args)
    {
        try
        {
            String s=null;
            int len=s.length();
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException start");
            System.out.println(e);
        }
        catch (RuntimeException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("Good Bye");
        }
    }
}
