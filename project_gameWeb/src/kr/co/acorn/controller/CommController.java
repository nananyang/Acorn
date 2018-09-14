package kr.co.acorn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.acorn.dao.CommDAO;

@Controller
public class CommController {
	@Autowired
	CommDAO dao;
	
	
	@RequestMapping("/views/webMain")
	public ModelAndView main() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("webMain");
		
		return mav;
	}
	
	
	@RequestMapping("/adsf")
	public ModelAndView commList() {
		return new ModelAndView("commList","commList",dao.selectAll());
	}
	
	
	
}
