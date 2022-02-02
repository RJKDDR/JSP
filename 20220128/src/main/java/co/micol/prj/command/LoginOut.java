package co.micol.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.prj.comm.Command;

public class LoginOut implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		String name = (String) session.getAttribute("name");	
		request.setAttribute("message", name + "님 로그아웃되었습니다");
		
		session.invalidate();//session을 삭제한다
		return "member/memberLogOut";
	}

}
