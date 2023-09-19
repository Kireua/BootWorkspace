package com.yb.app.board;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

// @Repository 안써도 상관없음 
@Mapper
public interface NoticeDAO extends BoardDAO{

}
