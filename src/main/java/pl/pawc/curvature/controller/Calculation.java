package pl.pawc.curvature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Calculation{

	@RequestMapping("result")
	public ModelAndView calculate(HttpServletRequest request, HttpServletResponse response){
		String h1 = request.getParameter("h1");
		String h2 = request.getParameter("h2");
		String d = request.getParameter("d");
		
		//calculation
		
		String result = "test result";
		
		return new ModelAndView("resultPage", "result", result);
	}
	
}
