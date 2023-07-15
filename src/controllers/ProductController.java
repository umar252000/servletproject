package controllers;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CouponDao;
import dao.ProductDao;
import models.Coupon;
import models.Product;


@WebServlet("/products")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
CouponDao couponDao = new CouponDao();
ProductDao productDao = new ProductDao();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("done");
		String name = request.getParameter("name");
		String discription = request.getParameter("discription");
		String price = request.getParameter("price");
		String couponCode = request.getParameter("couponCode");
		Coupon coupon = couponDao.findByCode(couponCode);
		Product product = new Product();
		product.setName(name);
		product.setDescription(discription);
		product.setPrice(new BigDecimal(price).subtract(coupon.getDiscount()));
		productDao.save(product);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<b>Produc Created</b>");
		out.print("<br/><a href='/candpapp'>Home</a>");
	}

}
