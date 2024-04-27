/*************************
 * Name: 	Oscar Rosa 
 * Course: 	CS-320 
 * Date: 	April 13, 2024
 * Description: This is the TaskService class. 
 *************************/

package Task;

import java.util.HashMap;

import Task.Task;

public class TaskService {
	
	int currentIDNum = 0; //pseudo GUID
	
	public static HashMap<String, Task> tasks = new HashMap<String, Task>();
	
	public void addUniqueTask(String _name, String _description) {

		String stringID = Integer.toString(currentIDNum);		
		Task tempTask = new Task (stringID, _name, _description);
		tasks.put(stringID, tempTask);	

		++currentIDNum;		
	}
	
	public void deleteTasks(String _ID) {
		
		if(tasks.containsKey(_ID)) {			
			tasks.remove(_ID);
		}		
	}
	
	public void updateTasks(String _ID, String _newName, String _newDescription) {
		
		if(tasks.containsKey(_ID)) {
			
			tasks.get(_ID).setName(_newName);
			tasks.get(_ID).setDescription(_newDescription);
		}
		
	}
}
