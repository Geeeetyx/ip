public class Task {
	protected String description;
	protected boolean isDone;

	public Task(String description) {
		this.description = description;
		this.isDone = false;
	}

	public void setDone() {
		isDone = true;
	}

	public void setNotDone() {
		isDone = false;
	}

	public String getStatusIcon() {
		return (isDone ? "X" : " "); // mark done task with X
	}
}