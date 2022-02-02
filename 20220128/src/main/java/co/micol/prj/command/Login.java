package co.micol.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;
import co.micol.prj.member.vo.MemberVO;

public class Login implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		HttpSession session = request.getSession();  //세션객체를 가져온다
		
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		
		vo = memberDao.membeSelect(vo);
		if(vo != null) {
			//세션에 값을 넣는방법
			session.setAttribute("id",  vo.getId()); //id저장
			session.setAttribute("author", vo.getAuthor());//권한을 저장
			session.setAttribute("name", vo.getName()); //이름 저장 //세선연역은 어플리케이션 전체 
			request.setAttribute("message", vo.getName() + "환영합니다.");
		}else {
			request.setAttribute("message", "아이디 또는 패스워드가 일치하지 않습니다");
		}
		return "member/memberLoginResult";
	}

}
