package com.chrispy.controller;

import java.util.List;
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
	
	// HOME
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	// CREATE (POST)
	@PostMapping
	public Alien createAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	// READ
	@RequestMapping("/readAlien")
	public Alien readAlien(int aid) {
		Alien alien = repo.findById(aid).orElse(new Alien());
		home().addObject(alien);
		return alien;
	}

	@GetMapping("/aliens")
	public List<Alien> getAllAliens() {
		return repo.findAll();
	}
		
	//UPDATE (PUT)
	@PutMapping("/alien")
	public Alien saveOrUpdateAlien(Alien alien) {
		repo.save(alien);
		return alien;
	}
		
	// DELETE
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable("aid") int aid) {
		Alien a = repo.getById(aid);
		repo.delete(a);
		return "deleted";
	}
	
	@RequestMapping("/alien/{aid}")
	public Optional<Alien> getAlienById(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}
	
	

}
