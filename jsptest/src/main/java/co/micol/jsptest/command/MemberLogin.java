package co.micol.jsptest.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.jsptest.common.Command;
import co.micol.jsptest.member.service.MemberService;
import co.micol.jsptest.member.service.MemberVO;
import co.micol.jsptest.member.serviceImpl.MemberServiceImpl;

public class MemberLogin implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 로그인 프로세스
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		
		vo = memberDao.memberSelect(vo);
		
		if(vo != null) {
			request.setAttribute("message", vo.getName() + "님 환영합니다");
		}else {
			request.setAttribute("message", "존재하지 않는 아이디 또는 패스워드가 틀립니다.");
		}
		
		return "member/memberLoginResult";
	}

}
