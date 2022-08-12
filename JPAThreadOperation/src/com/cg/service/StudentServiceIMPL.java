package com.cg.service;

import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoIMPL;
import com.cg.entities.Student;

public class StudentServiceIMPL implements StudentService {
private StudentDao dao;
public StudentServiceIMPL()
{

dao = new StudentDaoIMPL();
}
@Override
public void addStudent(Student student) {
dao.beginTransaction();
dao.addStudent(student);
dao.commitTransaction();
}
@Override
public void updateStudent(Student student) {
dao.beginTransaction();
dao.updateStudent(student);
dao.commitTransaction();
}
@Override
public void removeStudent(Student student) {
dao.beginTransaction();
dao.removeStudent(student);
dao.commitTransaction();
}
@Override
public Student findStudentById(int id) {
//no need of transaction, as it's an read operation
Student student = dao.getStudentById(id);
return student;
}
}