package co.micol.prj.member.service;

import java.util.List;

import co.micol.prj.member.vo.NoticeVO;

public interface NoticeService {
	List<NoticeVO> noticeSelectList();
	NoticeVO noticeSelect(NoticeVO vo);
	int noticeInsert(NoticeVO vo);
	int noticeDelete(NoticeVO vo);
	int noticeUpdate(NoticeVO vo);
	
	void noticeHitUpdate(int id); //조회수 증가
	List<NoticeVO> noticeSearch(String key, String str); //검색할 필드 와 데이터를 전달 받음
	
	

}
