package co.micol.prj.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.comm.Command;
import co.micol.prj.command.Login;
import co.micol.prj.command.LoginForm;
import co.micol.prj.command.LoginOut;
import co.micol.prj.command.MainCommand;
import co.micol.prj.command.NoticeList;
import co.micol.prj.command.NoticeSelect;
import co.micol.prj.command.NoticeWrite;
import co.micol.prj.command.NoticeWriteForm;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String,Command>();
       
    public FrontController() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		//명령 그룹
		map.put("/main.do", new MainCommand()); //홈페이지
		map.put("/loginForm.do", new LoginForm()); //로그인폼
		map.put("/login.do", new Login()); //로그인
		map.put("/loginOut.do", new LoginOut()); //로그아웃
		map.put("/noticeList.do", new NoticeList()); //공지사항 리스트
		map.put("/noticeSelect.do", new NoticeSelect());//공지사항 세부내용보기
		map.put("/noticeWriteForm.do", new NoticeWriteForm());//글쓰기 폼
		map.put("/noticeWrite.do", new NoticeWrite());//글등록
		
		
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//서비스요청분석및 실행
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String page = uri.substring(contextPath.length());
		
		Command command = map.get(page);
		String viewPage = command.exec(request, response);
		
		if(viewPage != null && !viewPage.endsWith(".do")) {
	         viewPage = "WEB-INF/views/" + viewPage + ".jsp";
	      }
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
