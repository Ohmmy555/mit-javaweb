package Lec05.Lab05;

public class ServletProduct {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		String brand = request.getParameter("brand");
		String sizes[] = request.getParameterValues("sizes");
		int summ =0;
		int avg =0;
		int count =0;
		out.println("<br>brand: " + brand);
		
		for(int x=0; x<sizes.length ; x++) {
			summ = summ + Integer.parseInt(sizes[x]);
			out.println("<br>sizes: " + sizes[x]);
			count++;
		}
		out.println("<br>Summation: " + summ +"<br>");
		out.println("Average: "+ (summ/count));
		
	}
}
