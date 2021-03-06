package kr.co.mlec.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardVO;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;
	
	@RequestMapping("/board")
	public ModelAndView list() {
		List<BoardVO> boardList = service.selectAllBoard();
		
		ModelAndView mav = new ModelAndView("board/list");
		mav.addObject("boardList",boardList);
		
		/*for(BoardVO board : boardList) {
			System.out.println(board);
		}*/
		return mav;
	}

}
