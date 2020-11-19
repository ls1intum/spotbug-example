package de.tum.in.ase.eist;

import java.util.ArrayList;

public class TUMOnline {

	private ArrayList<Course> registeredCourses;
	private ArrayList<Student> enrolledStudents;

	public TUMOnline() {
		registeredCourses = new ArrayList<Course>();
		enrolledStudents = new ArrayList<Student>();
	}

	public void enrolStudent(Student student) {
		enrolledStudents.add(student);
	}

	public void registerCourse(Course course) {
		this.registeredCourses.add(course);
	}

	public Student findStudentByName(String firstName, String lastName) {
		for (Student student : this.enrolledStudents) {
			if (student.getFirstName() == firstName && student.getLastName() == lastName) {
				return student;
			}
		}
		return null;
	}
}
