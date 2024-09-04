package enhancedtodolist;

import java.time.LocalDate;

public class TaskMain {

public static void main(String[] args) {
		
		ToDoList list=new ToDoList();
		
		Task task1=new Task("Complete module Videos",LocalDate.of(2024, 9, 9));
		Task task2=new Task("Complete Assignments",LocalDate.of(2024, 9, 20));
		Task task3=new Task("Complete Java Course",LocalDate.of(2024, 11, 20));
		Task task4=new Task("Complete Sample project",LocalDate.of(2024, 10, 23));
		
		list.addTask(task1);
		list.addTask(task2);
		list.addTask(task3);
		list.addTask(task4);
		
		System.out.println("Before prioritizing based on date");
		list.dispalyTask();
		
		System.out.println("After prioritizing based on date");
		list.priorityTask();
		list.dispalyTask();
		
		list.removeTask(task3);
		
		list.dispalyTask();
		
		list.removeTask(task3);
		
	}
}
