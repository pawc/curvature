package pl.pawc.curvature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pl.pawc.curvature.model.Data;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Calculation{

	@RequestMapping("result")
	public ModelAndView calculate(HttpServletRequest request, HttpServletResponse response){
		String h1String = request.getParameter("h1");
		String dString = request.getParameter("d");
		String planet = request.getParameter("planet");
		
		double h1;
		double d;
		
		try{
			h1 = Double.valueOf(h1String);
			d = Double.valueOf(dString);
		}
		catch(Exception e){
			return new ModelAndView("errorPage", "error", "Fill out the fields and use . instead of ,");
		}
		
		Data data = new Data(h1, d, planet);
		String[] result = data.calculateCurvatureDrop();
		
		return new ModelAndView("resultPage", "result", result);
	}
	
}
