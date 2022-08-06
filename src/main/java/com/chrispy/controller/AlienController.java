package com.chrispy.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.chrispy.dao.AlienRepo;
import com.chrispy.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	// --- VIEW NAMES ---
	// HOME
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	
	}
	// --- CRUD OPERATIONS ---
	// CREATE
	@PostMapping("/addAlien")
	public ModelAndView addAlien(Alien alien) {
		repo.save(alien);
		// HOW DO I HEAD HOME AFTER COMPLETING THE FUNCTION??? --- working!
		return new ModelAndView("home");
		}
	
	@GetMapping("/getAlien")
	public ModelAndView getAlienByAid(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("showAlien");
		Alien alien = repo.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		return mv;
	}
	

}
