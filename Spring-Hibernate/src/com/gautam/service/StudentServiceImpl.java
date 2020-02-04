package com.gautam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gautam.dao.StudentDaoService;
import com.gautam.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDaoService studentsaoservice;

	@Transactional
	public void saveStudentObj(Student student) {
		// TODO Auto-generated method stub
		studentsaoservice.saveStudentObj(student);

	}

	@Transactional
	public List<Student> getAllStudent() {
		return studentsaoservice.getAllStudent();
	}

	@Transactional
	public Student getStudentObjById(Integer studentid) {
		return studentsaoservice.getStudentObjById(studentid);
	}

	@Transactional
	public void deleteObjById(Student student) {
		studentsaoservice.deleteObjById(student);

	}

}
