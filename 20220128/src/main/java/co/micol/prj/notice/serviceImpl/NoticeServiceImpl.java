package co.micol.prj.notice.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.comm.DataSource;
import co.micol.prj.notice.service.NoticeMapper;
import co.micol.prj.notice.service.NoticeService;
import co.micol.prj.notice.vo.NoticeVO;

public class NoticeServiceImpl implements NoticeService {
	private SqlSession session = DataSource.getInstance().openSession(true);
	private NoticeMapper map =session.getMapper(NoticeMapper.class);

	@Override
	public List<NoticeVO> noticeSelectList() {
		return map.noticeSelectList();
	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		//noticeHitUpdate(vo.getNoticeId()); //조회수증가
		return map.noticeSelect(vo);
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		return map.noticeInsert(vo);
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
		return map.noticeDelete(vo);
	}

	@Override
	public int noticeUpdate(NoticeVO vo) {
		return map.noticeUpdate(vo);
	}

	@Override
	public void noticeHitUpdate(int id) {
		map.noticeHitUpdate(id);
	}

	@Override
	public List<NoticeVO> noticeSearch(String key, String str) {
		return map.noticeSearch(key, str)
				;
	}

}
