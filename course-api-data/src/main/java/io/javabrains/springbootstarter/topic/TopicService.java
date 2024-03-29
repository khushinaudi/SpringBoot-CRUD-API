package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
//			new Topic("spring", "Spring Framework", "Spring description"),
//			new Topic("java", "Core Java", "Java description"),
//			new Topic("javascript", "Javascript", "JS description")
//			));
	
	public List<Topic> getAllTopics()
	{
		List<Topic>topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();	
	}

    public void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}
