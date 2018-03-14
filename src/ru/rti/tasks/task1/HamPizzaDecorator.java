package ru.rti.tasks.task1;

public class HamPizzaDecorator extends PizzaDecorator {
	
	SimpleNonVegeterianPizza sNVP = new SimpleNonVegeterianPizza();
	
	public String getDescription() {
		return sNVP.getDescription() + " + Ветчина (45.90)";
	}
	
	public double getPrice() {
		return sNVP.getPrice() + 45.90;
	}

}
