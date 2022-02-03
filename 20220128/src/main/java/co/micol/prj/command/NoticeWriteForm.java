package co.micol.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.comm.Command;

public class NoticeWriteForm implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		//글쓰기 폼 호출
		return "notice/noticeWriteForm";
	}

}
