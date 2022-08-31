package courseAPI.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring FrameWork", "Spring Framework desc"),
			new Topic("java", "Core Java", "Core Java desc"),
			new Topic("javascript", "Javascript", "javascript desc")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	
}




