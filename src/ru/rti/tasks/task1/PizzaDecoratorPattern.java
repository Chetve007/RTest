package ru.rti.tasks.task1;
import ru.rti.tasks.RunnableTask;

public class PizzaDecoratorPattern extends RunnableTask {

	@Override
	public void runTask() {
		SimpleNonVegeterianPizza sNVP = new SimpleNonVegeterianPizza();
		System.out.println(sNVP.getDescription() + " " + sNVP.getPrice());
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	

}
