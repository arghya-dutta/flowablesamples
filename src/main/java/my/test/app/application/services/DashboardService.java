package my.test.app.application.services;

import java.util.Arrays;
import java.util.List;

import org.flowable.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

	@Autowired
	private TaskService taskService;
	public List<String> getAllProcessInstances( String name) {
		
		System.out.println(taskService.createTaskQuery().count());
		return Arrays.asList(new String[] { "1", "2" });
	}

}
