package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import dto.Book;

/**
 * Servlet implementation class RegisterBookServlet
 */
@WebServlet("/RegisterBookServlet")
public class RegisterBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// フォーム入力内容の取得
		String book_name = request.getParameter("book_name");
		String creater_name = request.getParameter("creater_name");
		String publisher = request.getParameter("publisher");
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		
		
		Book book = new  Book(-1,book_name,creater_name,publisher,isbn);
		
		int result = BookDAO.registerBook(book);
		
		String view = "";
		if(result == 1) {
			 view = "WEB-INF/view/success.jsp";
		} else {
			 view = "WEB-INF/view/fail.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
