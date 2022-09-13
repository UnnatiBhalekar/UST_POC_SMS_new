package com.poc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.app.entities.Standard;
import com.poc.app.entities.Subject;
import com.poc.app.service.StandardService;
import com.poc.app.service.SubjectService;

@RestController
//@RequestMapping("/standard")
public class StandardController {
	
	@Autowired
	StandardService standardService;
	
	@PostMapping("/admin/standard/save")
	public List<Standard> saveSubject(@RequestBody List<Standard> standard) {
		return standardService.saveStandard(standard);
	
	}
	
	@GetMapping("/user/standard/display")
	public List<Standard> displayStandard(){
		return standardService.displayStandard();
	}
	
	@GetMapping("/admin/standard/display")
	public List<Standard> displayStandard1(){
		return standardService.displayStandard1();
	}
	
	@GetMapping("/user/standard/search/id/{id}")
	public Standard searchStandardById(@PathVariable int id) {
		return standardService.searchStandardById(id);
	}
	
	@GetMapping("/admin/standard/search/id/{id}")
	public Standard searchStandardById1(@PathVariable int id) {
		return standardService.searchStandardById1(id);
	}
	
	@DeleteMapping("/admin/standard/delete/id/{id}")
	public void DeleteStandardById(@PathVariable int id) {
		standardService.DeleteStandardById(id);
	}
	
	@PutMapping(path = "/admin/standard/update")
    public Object update(@RequestBody Standard standard) {
        return standardService.updateStandard(standard);
    }
}
