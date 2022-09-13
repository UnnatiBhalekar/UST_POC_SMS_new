package com.poc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.app.entities.Standard;
import com.poc.app.repository.StandardRepository;
@Service
public class StandardService {
	@Autowired
	StandardRepository standardRepository;

	public List<Standard> displayStandard() {
		List<Standard> standard=standardRepository.findAll();
		return standard;
	}

	public List<Standard> saveStandard(List<Standard> standard) {
		return standardRepository.saveAll(standard);
	}
	
	public Standard searchStandardById(int standard_id) {
		Standard s = standardRepository.findById(standard_id).get();
		return s;
		
	}
	
	  public Object updateStandard(Standard standard) {
		  if(standardRepository.existsById(standard.getStandard_id())) {
			  Standard updatedvehicle = standardRepository.save(standard);
		        return updatedvehicle;
		  }
		  else {
			  return "Data Not Found";
		  }
	    }
	
	public void DeleteStandardById(int standard_id) {
		standardRepository.deleteById(standard_id);
		
	}
	
	

}
