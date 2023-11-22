package com.darden_upskilling_training.darden.controller;

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

import com.darden_upskilling_training.darden.model.StudentDao;
import com.darden_upskilling_training.darden.model.StudentEntity;
import com.darden_upskilling_training.darden.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService sservice;
	@PostMapping("/addstudent")
	public StudentEntity addstudent(@RequestBody StudentEntity data){
		return sservice.addStudent(data);
		
	}
	@GetMapping("/all")
	public List<StudentEntity> getList(){
		return sservice.getDetails() ;
		
	}
	@GetMapping("/getByid/{id}")
	public StudentEntity getStudentById(@PathVariable int id) {
		return sservice.getById(id);
	}
	@PutMapping("/update")
	public StudentEntity updatestudentId(@RequestBody StudentDao s) {
		return sservice.update(s);
		}
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return  sservice.delete(id);
		
	}

}
