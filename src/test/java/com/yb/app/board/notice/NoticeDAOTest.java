package com.yb.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yb.app.board.BoardVO;
import com.yb.app.board.NoticeDAO;

@SpringBootTest
class NoticeDAOTest {

	@Autowired
	private NoticeDAO noticeDAO;
	@Test
	void getListTest() throws Exception {
		List<BoardVO> ar = noticeDAO.getList();
		assertNotEquals(0, ar.size());
	}

}
