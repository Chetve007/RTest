package ru.rti;

import ru.rti.tasks.RunnableTask;
import ru.rti.tasks.task1.PizzaDecoratorPattern;
import ru.rti.tasks.task2.ArithmeticAverageMatrix;
import ru.rti.tasks.task3.PolymorphismSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {	
		
		List<RunnableTask> runnableTasks = new ArrayList<RunnableTask>();
		RunnableTask pizzaDecoratorPattern = new PizzaDecoratorPattern();
		RunnableTask arithmeticAverageMatrix = new ArithmeticAverageMatrix(5, 5);
		RunnableTask polymorphismSample = new PolymorphismSample();
		runnableTasks.addAll(Arrays.asList(pizzaDecoratorPattern, arithmeticAverageMatrix, polymorphismSample));
		runnableTasks.forEach(runnableTask -> {
			runnableTask.run();
		});

	}

}
