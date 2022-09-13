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

}
