package io.brains.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopic()
	{
		// return topic;
		List<Topic> topics=new ArrayList();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	public Optional<Topic> getTopic(String id)
	{
		// return topic.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
	}
	public void addTopic(Topic topic2) {
		// TODO Auto-generated method stub
		topicRepository.save(topic2);
		
	}
	public void updateTopic(Topic topic2, String id) {
		// TODO Auto-generated method stub
		topicRepository.save(topic2);
	}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicRepository.deleteById(id);
		
	}

}
