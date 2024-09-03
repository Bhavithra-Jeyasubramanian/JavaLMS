package com.techademy.ust;

public class ToDoList {
	
	Task[] tasks;
	int taskCount=0;
	public ToDoList(int size)
	{
		tasks=new Task[size];
	}
	
	public void addTask(Task task)
	{
		if(taskCount<this.tasks.length)
		{
		   tasks[taskCount]=task;
		   taskCount++; 
		}
		else
		{
			System.out.println("Task Cannot be added");
		}
	}
	
	//Remove Task
	public void removeTask(Task toRemoveTask)
	{
		int index=0;
		for(int i=0;i<tasks.length;i++)
		{
			if(tasks[i].equals(toRemoveTask))
			{
				tasks[i]=null;
				index=i;
				break;
			}
			
		}
		
		
		if(index<tasks.length)
		{
		 for(int i=index;i<tasks.length-1;i++)
		 {
		 	tasks[i]=tasks[i+1];
		 }
		taskCount--;
		}
		else
		{
			System.out.println("Task not found");
		}
	}
	
	public void dispalyTask()
	{
		for(Task task:tasks)
		{
			if(task!=null)
			{
			System.out.println("Task:"+task.getTask());
			System.out.println("DueDate:"+task.getDueDate());
			}
			else
			{
				break;
			}
		}
		System.out.println();
	}

}
