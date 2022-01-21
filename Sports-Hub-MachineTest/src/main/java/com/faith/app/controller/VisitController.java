package com.faith.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Visit;
import com.faith.app.service.IVisitService;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class VisitController {
	
	@Autowired
	private IVisitService visitService;
	
	@GetMapping("/visits")
	public List<Visit> getAlVisits() {
		// TODO Auto-generated method stub
		return visitService.getAllVisits();
	}

	@GetMapping("/visits/{visitId}")
	public Optional<Visit> getVisitById(@PathVariable Integer visitId) {
		// TODO Auto-generated method stub
		return visitService.getVisitById(visitId);
	}

	@PostMapping("/visits")
	public void addVisit(@RequestBody Visit visit) {
		visitService.addVisit(visit);
		
	}

	@PutMapping("/visits")
	public void updateVisit(@RequestBody Visit visit) {
		visitService.updateVisit(visit);
		
	}

	@DeleteMapping("/visits/{visitId}")
	public void deleteVisit(@PathVariable Integer visitId) {
		visitService.deleteVisit(visitId);
		
	}

}
