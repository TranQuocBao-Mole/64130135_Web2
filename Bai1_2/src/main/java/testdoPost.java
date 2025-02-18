import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/testdoPost")
public class testdoPost extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public testdoPost() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter traVe = response.getWriter();
        traVe.append("Bạn vừa gửi yêu cầu dạng GET, đây là đáp ứng của tôi");

        String HTML = "<form method='POST' action='" + request.getContextPath() + "/testdoPost'>"
                + "<label> Họ: </label>"
                + "<input type='text' name='ho'><br>"
                + "<label> Tên: </label>"
                + "<input type='text' name='ten'><br>"
                + "<input type='submit' value='Gửi đi'>"
                + "</form>";
        traVe.append(HTML);
        traVe.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        String value1 = request.getParameter("ho");
        String value2 = request.getParameter("ten");

        if (value1 == null) value1 = "Không có họ";
        if (value2 == null) value2 = "Không có tên";

        PrintWriter traVe = response.getWriter();
        traVe.append("Bạn vừa gửi yêu cầu dạng POST, đây là đáp ứng của tôi");
        traVe.append("<br>Họ: " + value1);
        traVe.append("<br>Tên: " + value2);
        traVe.close();
    }
}