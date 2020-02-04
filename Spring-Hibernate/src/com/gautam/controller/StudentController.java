package com.gautam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gautam.entity.Student;
import com.gautam.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentservice;

	@RequestMapping(value = "/addStudent")
	public String displayAddStudentForm(Model m) {

		Student student = new Student();
		m.addAttribute("student", student);
		return "AddStudent";

	}

	@RequestMapping(value = "/saveProcess")
	public String saveProcess(@ModelAttribute("student") Student student, Model m) {
		studentservice.saveStudentObj(student);
		List<Student> listofStudents = studentservice.getAllStudent();
		m.addAttribute("AllStudents", listofStudents);
		return "ListStudents";

	}

	@RequestMapping(value = "/getStudents")
	public String getAllStudents(Model m) {

		List<Student> listofStudents = studentservice.getAllStudent();
		m.addAttribute("AllStudents", listofStudents);
		return "ListStudents";

	}

	@RequestMapping(value = "/showUpdateForm")
	public String showUpdateform(@RequestParam("studentId") Integer studentid, Model m) {
		Student student = findById(studentid);
		m.addAttribute("student", student);
		return "AddStudent";

	}
	
	@RequestMapping(value = "/deleteRecord")
	public String showDeletedPage(@RequestParam("studentId") Integer studentid, Model m) {
		
		Student student = findById(studentid);
		studentservice.deleteObjById(student);
		return "redirect:/getStudents";

	}


	private Student findById(Integer studentid) {

		Student student = studentservice.getStudentObjById(studentid);
		return student;

	}

}
