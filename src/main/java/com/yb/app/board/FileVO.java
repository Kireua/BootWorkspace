package com.yb.app.board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class FileVO {

	private Long fileNo;
	private String fileName;
	private String originalName;
}
