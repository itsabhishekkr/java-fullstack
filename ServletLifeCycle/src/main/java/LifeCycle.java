import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LifeCycle extends GenericServlet {
    public void init() {
        System.out.println("init called - servlet initialize");
    }
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service called - servlet service");
        res.setContentType("text/html");   // ✅ Correct object

        PrintWriter out = res.getWriter();
        out.println("<h2>Hello World!</h2>");

    }
    public void destroy() {
        System.out.println("destroy called - servlet destroy");

    }
}
