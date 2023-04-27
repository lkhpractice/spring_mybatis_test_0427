package com.lkhpractice.mybatiss.dao;

import java.util.ArrayList;

import com.lkhpractice.mybatiss.dto.BoardDto;

public interface IDao {
	
	public void writeDao(String mwriter, String mcontent);	// 게시판 글쓰기
	public ArrayList<BoardDto> listDao();	// 게시판 리스트 가져오기
	public void deleteDao(String mid);	// 게시글 삭제하기
	public int totalCount(); // 총 게시글 수 반환
	
}
