package chapter15;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// beanを使うためのimport文
// ここから
import bean.Product;
// ここまで
import tool.Page;

@WebServlet(urlPatterns={"/chapter15/bean"})
public class Bean extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Page.header(out);

		// ここから
		Product p=new Product();

		p.setId(1);
		p.setName("まぐろ");
		p.setPrice(100);

		out.println(p.getId());
		out.println(" : ");
		out.println(p.getName());
		out.println(" : ");
		out.println(p.getPrice());

		// ここまで

		Page.footer(out);
	}
}
