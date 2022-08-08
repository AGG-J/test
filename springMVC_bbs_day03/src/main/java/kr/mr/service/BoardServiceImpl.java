package kr.mr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.mr.mapper.BoardMapper;
import kr.mr.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	// 주입하기
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}
	@Override
	public void register(BoardVO board) {
		// TODO Auto-generated method stub
	}
	@Override
	public BoardVO view(int bid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int remove(int bid) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int modify(BoardVO board) {
		// TODO Auto-generated method stub
		return 0;
	}
}
