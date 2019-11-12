package me.wook.springbootembeddedservlet;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Application {
	public static void main(String[] args) throws LifecycleException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);

		Context context = tomcat.addContext("/","/");

		HttpServlet servlet = new HttpServlet() {
			@Override
			protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
				PrintWriter writer = resp.getWriter();
				writer.println("<html><head><title>");
				writer.println("Hey, Tomcat");
				writer.println("</head></title>");
				writer.println("<body>Hello Tomcat</body></html>");
			}
		};

		String servletName = "helloServlet";
		tomcat.addServlet("/", servletName, servlet);
		context.addServletMappingDecoded("/hello", servletName);
		context.addServletMappingDecoded("/test", servletName);

		tomcat.start();
		tomcat.getServer().await();
	}
}
