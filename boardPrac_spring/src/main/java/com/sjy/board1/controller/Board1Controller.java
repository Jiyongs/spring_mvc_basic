package com.sjy.board1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sjy.board1.service.Board1Service;

@Controller
public class Board1Controller {
	
	@Autowired
	private Board1Service board1Service;
	
	//#########################게시판 이동이 안됨... 왜 안돼 애러ㅐㄴ야런어리ㅏ ##############
	// 1 페이지 이동
	@RequestMapping(value = "/board1", method = RequestMethod.GET)
	public String mvBoard(Model model) {
		
		System.out.println("Board1Controller 실행");
		//List<Board1Dto> postList = board1Service.getPostList();
		//model.addAttribute("posts", postList);
		
		return "/board/board1";
	}
}
