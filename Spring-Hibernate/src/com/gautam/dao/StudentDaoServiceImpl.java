package com.gautam.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gautam.entity.Student;

@Repository
public class StudentDaoServiceImpl implements StudentDaoService {

	@Autowired
	private SessionFactory sFactory;

	public void saveStudentObj(Student student) {
		// TODO Auto-generated method stub
		sFactory.getCurrentSession().saveOrUpdate(student);

	}

	public List<Student> getAllStudent() {
		return sFactory.getCurrentSession().createQuery("from Student").list();
	}

	public Student getStudentObjById(Integer studentid) {
		Student student = sFactory.getCurrentSession().get(Student.class, studentid);
		return student;
	}

	public void deleteObjById(Student student) {

		sFactory.getCurrentSession().delete(student);
	}

}
