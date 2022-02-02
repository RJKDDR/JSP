package co.micol.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.comm.Command;

public class MainCommand implements Command {

	 @Override
	   public String exec(HttpServletRequest request, HttpServletResponse response) {
	      return "main/main";   //처음시작 페이지를 return
	   }

}
