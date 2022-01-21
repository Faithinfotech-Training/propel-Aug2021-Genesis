package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.Visit;
import com.faith.app.repository.IVisitRepository;
@Service
public class VisitServiceImplementation implements IVisitService {
	
	@Autowired
	private IVisitRepository visitRepository;

	@Override
	public List<Visit> getAllVisits() {
		// TODO Auto-generated method stub
		return (List<Visit>) visitRepository.findAll();
	}

	@Override
	public Optional<Visit> getVisitById(Integer visitId) {
		// TODO Auto-generated method stub
		return visitRepository.findById(visitId);
	}

	@Override
	public void addVisit(Visit visit) {
		visitRepository.save(visit);
		
	}

	@Override
	public void updateVisit(Visit visit) {
		visitRepository.save(visit);
		
	}

	@Override
	public void deleteVisit(Integer visitId) {
		visitRepository.deleteById(visitId);
		
	}

}
