package com.gautam.dao;

import java.util.List;

import com.gautam.entity.Student;

public interface StudentDaoService {

	void saveStudentObj(Student student);

	public List<Student> getAllStudent();

	Student getStudentObjById(Integer studentid);

	void deleteObjById(Student student);

}
