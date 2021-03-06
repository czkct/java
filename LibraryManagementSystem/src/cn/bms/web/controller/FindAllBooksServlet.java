package cn.bms.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.bms.bean.Book;
import cn.bms.service.impl.BusinessServiceImpl;

public class FindAllBooksServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//将传过来的表单数据编码改为UTF-8
		request.setCharacterEncoding("UTF-8");
				
		BusinessServiceImpl service = new BusinessServiceImpl();
		
		List<Book> bookList=new ArrayList<Book>();
		bookList = service.findAllBooks();
		
		//将数据库的查询结果bookList方法request域中
		request.setAttribute("bookList", bookList);
		
		request.getRequestDispatcher("/WEB-INF/jsp/books_list.jsp").forward(request, response);
	}

}
