package enhancedtodolist;

import java.time.LocalDate;

public class Task {
	
	private String task;
	private LocalDate dueDate;
	
	public Task(String task, LocalDate dueDate) {
		this.task = task;
		this.dueDate = dueDate;
	}

	/**
	 * @return the tasks
	 */
	public String getTask() {
		return task;
	}

	/**
	 * @param task the task to set
	 */
	public void setTask(String task) {
		this.task = task;
	}

	/**
	 * @return the dueDate
	 */
	public LocalDate getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
}
