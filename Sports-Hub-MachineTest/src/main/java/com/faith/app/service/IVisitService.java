package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.entity.Visit;

public interface IVisitService {
	
	public List<Visit>getAllVisits();
	
	public Optional<Visit>getVisitById(Integer visitId);
	
	public void addVisit(Visit visit);
	
	public void updateVisit(Visit visit);
	
	public void deleteVisit(Integer visitId);

}
