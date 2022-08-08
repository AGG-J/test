package kr.mr.service;

import java.util.List;

import kr.mr.model.BoardVO;

public interface BoardService {
	public List<BoardVO> getList();
	
	//등록
	public void register(BoardVO board);
	
	//게시글 상세보기
	public BoardVO view(int bid);
	
	//삭제
	public int remove(int bid);
	
	//수정
	public int modify(BoardVO board);

}
