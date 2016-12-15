package petclinic.servlets;

import com.google.common.base.Joiner;
import petclinic.Client;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

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
                        "   <input type=\"text\" name=\"key\">\n",
                        "   <input type=\"submit\" name=\"name\" value=\"Search\">\n",
                        "</form><br>",
                        "<table cellpading=\"0\" cellpading=\"0\" border=\"1\">\n",
                        "   <tr>\n",
                        "       <th>Name</th>\n",
                        "       <th>Active</th>",
                        "       <th>Action</th>",
                        "   </tr>\n",
                        this.buildTable(req.getParameter("key")),
                        "</table><br/>\n",
                        this.buildForm(this.storage.findbyId(req.getParameter("id"))),
                        "</form>",
                        "</body>",
                        "</html>"
                )
        );
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        try {
            Client client = new Client(
                    Integer.valueOf(req.getParameter("id")),
                    req.getParameter("name"),
                    new CopyOnWriteArrayList<>()
            );
        } catch (Exception e) {
            System.out.println("Error!");
        }
        resp.sendRedirect(String.format("%s/users.do", req.getContextPath()));
    }

    protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doGet(req, resp);
    }

    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doGet(req, resp);
    }

    private String buildTable(String key) {
        List<String> rows = new ArrayList<>();
            for (data.clients : client)
    }
}
