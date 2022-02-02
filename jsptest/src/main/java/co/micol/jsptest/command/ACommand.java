package co.micol.jsptest.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.jsptest.common.Command;

public class ACommand implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// a.do로 들어오면 처리하는곳
		return "member/a";
		
	}

}
