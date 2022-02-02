package co.micol.jsptest.member.service;

import java.util.List;

public interface MemberMapper { //mybatis에서 사용하기 위해
	
	List<MemberVO> memberSelectList(); //전체리스트 가지고 오기 R
	MemberVO memberSelect(MemberVO vo); //한명 조회 R 
	int memberInsert(MemberVO vo);  //삽입 C
	int memberDelete(MemberVO vo);  //삭제 D
	int memberUpdate(MemberVO vo);  //변경 U

}
