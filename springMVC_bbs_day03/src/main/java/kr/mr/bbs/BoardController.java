package kr.mr.bbs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.mr.model.BoardVO;
import kr.mr.service.BoardService;

@Controller
public class BoardController {
	// list.do (get) > list()
	// register.do (post) > register()
	// view.do (get) > view()
	// remove.do (get) > remove()
	// modify.do (post) > modify()
	
	@Autowired
	private BoardService service;
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		List<BoardVO> list = service.getList();
		
		model.addAttribute("list",list);
		return "boardList";
	}

}
