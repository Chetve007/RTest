package ru.rti.tasks;

public abstract class RunnableTask {
	
	public abstract void runTask();

	public abstract void init();

	public void run() {
		logTaskName();
		runTask();
	}

	public void logTaskName() {
		logLine(String.format(">>>>> ������ �������: %s", this.getClass()));
	}

	public RunnableTask() {
		init();
	}

	public void log(Object message) {
		System.out.print(message);
	}

	public void logLine(Object message) {
		System.out.println(message);
	}
}
