package kr.co.acorn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.co.acorn.dao.BoardDAO;

@Controller
public class BoardController {
	@Autowired
	BoardDAO dao;
}
