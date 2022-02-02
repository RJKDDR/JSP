package co.micol.jsptest.common;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	public String run(HttpServletRequest request, HttpServletResponse response); //스트링은 보여줄 페이지를 리턴시킴
	
}
