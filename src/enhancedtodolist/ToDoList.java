package enhancedtodolist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ToDoList {
	
	List<Task> taskList=new ArrayList<Task>() ;
	
	//Adding task to tasks array
	public void addTask(Task task)
	{
		if(task!=null)
		{
			taskList.add(task);
		}
		else
		{
			System.out.println("Task is null");
		}
	}
	
	//Remove Task from task array
	public void removeTask(Task toRemoveTask)
	{
		if(taskList.isEmpty()||taskList==null)
		{
			System.out.println("Task List is null or empty");
		}
		else if(taskList.contains(toRemoveTask))
		{
			taskList.remove(toRemoveTask);
			System.out.println("Task Removed");
		}
		else
		{
			System.out.println("Task not found");
		}
		
		
	}
	
	//Printing task details
	public void dispalyTask()
	{
		if(taskList!=null && !taskList.isEmpty())
		{
			taskList.stream().forEach(task->System.out.println("Task:"+task.getTask()+"\n"+"DueDate:"+task.getDueDate()));
		}
		else
		{
			System.out.println("List is null or empty");
		}
		System.out.println();
	}
	
	public void priorityTask()
	{
		Collections.sort(taskList,Comparator.comparing(Task::getDueDate));
	}

}
