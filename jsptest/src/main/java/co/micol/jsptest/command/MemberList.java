package co.micol.jsptest.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.jsptest.common.Command;
import co.micol.jsptest.member.service.MemberService;
import co.micol.jsptest.member.serviceImpl.MemberServiceImpl;

public class MemberList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 회원목록 가져오기
		MemberService memberDao= new MemberServiceImpl();
		request.setAttribute("members", memberDao.memberSelectList()); //전체회원목록을 가져옴
		return "member/memberList";
	}

}
