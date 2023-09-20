package com.yb.app.board.notice;

import com.yb.app.board.FileVO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class NoticeFileVO extends FileVO {
	private Long boardNo;

}
