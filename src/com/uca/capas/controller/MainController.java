package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.StudentDAO;
import com.uca.capas.domain.Student;

@Controller
public class MainController {

	@Autowired
	private StudentDAO studentDAO;

	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		Student student = new Student();
		mav.addObject("students", student);
		mav.setViewName("main");
		return mav;
	}

	@RequestMapping("/formData")
	public ModelAndView formData(@RequestParam(value = "cStudent") Integer code, @ModelAttribute Student student) {
		ModelAndView mav = new ModelAndView();
		Student studenty = null;
		try {
			if (code == null) {
				mav.addObject("message", "No hay ningún estudiante registrado con ese codigo");
			} else {
				studenty = studentDAO.findOne(code);
				mav.addObject("students", studenty);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		mav.setViewName("form");
		return mav;
	}
}
