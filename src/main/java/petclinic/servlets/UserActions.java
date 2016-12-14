package petclinic.servlets;

import com.google.common.base.Joiner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**.
 * Servlet for receive ang response
 * http request.
 */
public class UserActions extends HttpServlet {
    /**
     *
     * @param req - http request from browser
     * @param resp - http response from browser
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = new PrintWriter(resp.getOutputStream());

        /**
         * Use local variable login
         * for test input pa
         */
        String login = req.getParameter("login");
        out.append(String.format("Hello, %s", login));
        out.append(
                Joiner.on("")
                .join("<!DOCTYPE html>",
                        "<html lang = \"en\">\n",
                        "<head>\n",
                        "   <meta charset=\"UTF-8\">\n",
                        "   <title></title>\n",
                        "</head>",
                        "<body>\n",
                        "<form action=\"\" method=\"GET\">\n",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",


                )
        );
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doGet(req, resp);
    }

    protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doGet(req, resp);
    }

    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
