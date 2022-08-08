package kr.mr.mapper;

import java.util.List;

import kr.mr.model.BoardVO;

// Persistent Layer
// @Mapper
public interface BoardMapper {
	//게시판 리스트 가져오기
	public List<BoardVO> getList();
	
	//등록
	public void insert(BoardVO board);
	
	//게시글 상세보기
	public BoardVO view(int bid);
	
	//삭제
	public int delete(int bid);
	
	//수정
	public int update(BoardVO board);
	
}
