package com.sangmin.survival.user.ctr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sangmin.survival.user.svc.UserSvc;
import com.sangmin.survival.user.vo.UserVO;

@RequestMapping("/user")
@Controller("userCtr")
public class UserCtr {

	@Autowired
	private UserSvc svc;
	
	//로그인 화면으로 이동
	@RequestMapping("/loginView")
	public String userLoginView() {
		return "/user/login";
	}
	
	//로그인 처리
	@RequestMapping("/login")
	public String userLogin(@RequestParam("id") String id, @RequestParam("pw") String pw, HttpSession session, Model model) throws Exception {
		System.out.println("########################");
		System.out.println("ID : " + id);
		System.out.println("PW : " + pw);
		System.out.println("########################");
		
		UserVO loginUser = svc.userLogin(new UserVO(id, pw));
		if(loginUser != null) {
			session.setAttribute("loginUser", loginUser);
			return "main";
		}else {
			return "fail";
		}
	}
	
	//로그아웃 처리
	@RequestMapping("/logout")
	public String logout(HttpSession session, HttpServletRequest request ){
		session = request.getSession(false);		
		if(session != null) {
			session.invalidate();
			System.out.println("로그아웃 처리 완료");
		}
		return "home";
	}
	
	//회원가입 화면으로 이동
	@RequestMapping("/joinView")
	public String userJoinView() {
		return "/user/join";
	}
	
	//회원가입 처리
	@RequestMapping("/join")
	public String userJoin() {
		return "";
	}
	
}
