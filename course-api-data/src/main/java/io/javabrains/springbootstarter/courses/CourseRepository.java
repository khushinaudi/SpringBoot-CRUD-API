package io.javabrains.springbootstarter.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	//public List<Course> findByName(String name);
	//method which returns all the courses with a particular name
	
	//public List<Course> findByDescription(String foo);
	//method which returns all the courses that have a particular description
	
	public List<Course> findByTopicId(String topicId);
	//we are looking for the ID property of the topic object

}

