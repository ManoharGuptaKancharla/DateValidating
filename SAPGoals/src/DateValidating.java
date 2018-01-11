import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DateValidating extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res ) throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter pwriter = res.getWriter();
		String y=req.getParameter("uyear");
		String m=req.getParameter("umonth");		
		String d=req.getParameter("udate");
		int year=0;
		int month=0;
		int date=0;
		try {
			year=Integer.parseInt(y);
			month=Integer.parseInt(m);
			date=Integer.parseInt(d);
		}
		catch(Exception ex) {
			pwriter.println("Please enter a valid number	!!!");
			return;
		}	
		if(year<=0 || month<=0 || date<=0) {
			pwriter.println("Enter a valid date!!!");
			return;
		}
		if(month==2) {
			if(year%100==0) {
				if(year%400==0) {
					if(date<=29) {
						pwriter.println("Valid Date!!!");
						return;
					}
					else {
						pwriter.println("Enter a Valid Date!!!");
						return;
					}
				}
				else {
					if(date<=28) {
						pwriter.println("Valid Date!!!");
						return;
					}
					else {
						pwriter.println("Enter a Valid Date!!!");
						return;
					}
				}
			}
			else {
				if(year%4==0) {
					if(date<=29) {
						pwriter.println("Valid Date!!!");
						return;
					}
					else {
						pwriter.println("Enter a Valid Date!!!");
						return;
					}
				}
				else {
					if(date<=28) {
						pwriter.println("Valid Date!!!");
						return;
					}
					else {
						pwriter.println("Enter a Valid Date!!!");
						return;
					}
				}
			}
		}
		else if(month<8) {
			if(month%2==1) {
				if(date<=31) {
					pwriter.println("Valid Date!!!");
					return;
				}
				else {
					pwriter.println("Enter a Valid Date!!!");
					return;
				}
			}
			else {
				if(date<=30) {
					pwriter.println("Valid Date!!!");
					return;
				}
				else {
					pwriter.println("Enter a Valid Date!!!");
					return;
				}
			}
		}
		else if(month<=12) {
			if(month%2==0) {
				if(date<=31) {
					pwriter.println("Valid Date!!!");
					return;
				}
				else {
					pwriter.println("Enter a Valid Date!!!");
					return;
				}
			}
			else {
				if(date<=30) {
					pwriter.println("Valid Date!!!");
					return;
				}
				else {
					pwriter.println("Enter a Valid Date!!!");
					return;
				}
			}
		}
		else {
			pwriter.println("Enter a Valid Date!!!");
			return;
		}
	}
}
