import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class Echo extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException
    {

        PrintWriter out = response.getWriter();
        // url path
        out.println("req ContextPath: " + request.getContextPath());

        // get http method, in this method, it always GET
        out.println("req Method: " + request.getMethod());

        // get query string
        out.println("req QueryString: " + request.getQueryString());

        out.println();

        // get headers
        out.println("Headers: ");
        Enumeration<String> headers = request.getHeaderNames();
        while(headers.hasMoreElements()){
            String header = headers.nextElement();
            out.println(header +": " + request.getHeader(header));
        }
    }
}