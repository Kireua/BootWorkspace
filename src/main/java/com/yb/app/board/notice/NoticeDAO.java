package com.yb.app.board.notice;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.yb.app.board.BoardDAO;

// @Repository 안써도 상관없음 
@Mapper
public interface NoticeDAO extends BoardDAO{

}
