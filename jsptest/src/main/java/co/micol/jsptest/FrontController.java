package co.micol.jsptest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.jsptest.command.ACommand;
import co.micol.jsptest.command.BCommand;
import co.micol.jsptest.command.MemberJoin;
import co.micol.jsptest.command.MemberJoinForm;
import co.micol.jsptest.command.MemberList;
import co.micol.jsptest.command.MemberLogin;
import co.micol.jsptest.command.MemberLoginForm;
import co.micol.jsptest.command.MemberSearch;
import co.micol.jsptest.common.Command;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();
    
       
    
    public FrontController() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
		//초기값 등록
				map.put("/a.do", new ACommand());  //a.do로 요청
				map.put("/b.do", new BCommand());
				map.put("/memberList.do", new MemberList());
				map.put("/memberSearch.do", new MemberSearch());
				map.put("/memberLoginForm.do", new MemberLoginForm());
				map.put("/memberLogin.do", new MemberLogin());
				map.put("/memberJoinForm.do", new MemberJoinForm());
				map.put("/memberJoin.do", new MemberJoin());
			
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//실제요청을 처리하는곳
				request.setCharacterEncoding("utf-8");//한글깨짐방지를 위해
				String uri = request.getRequestURI();//URI값을 구함
				String contextPath = request.getContextPath();//루트를구함(컨텍스트패스)
				String page = uri.substring(contextPath.length()); // 실제 요청한 페이지를 구함
				
				Command command = map.get(page); //요청을 map에서 찾아온다.
				String viewPage = command.run(request, response); //요청을 처리하는 command 호출
				
				//가장 간단한 viewResolve임 
				if(viewPage!=null && !viewPage.endsWith(".do")) {
			         viewPage = "WEB-INF/views/" + viewPage + ".jsp";
			      
				}
				RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage); //서버에서 접근하여 브라우저로 결과를 돌림
				dispatcher.forward(request, response);
			}
	}


