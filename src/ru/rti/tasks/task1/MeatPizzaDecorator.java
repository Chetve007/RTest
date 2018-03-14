package ru.rti.tasks.task1;

public class MeatPizzaDecorator extends PizzaDecorator {
	
	SimpleNonVegeterianPizza sNVP = new SimpleNonVegeterianPizza();

	public String getDescription() {
		return sNVP.getDescription() + " + Мясная добавка (50.99)";
	}
	
	public double getPrice() {
		return sNVP.getPrice() + 50.99;
	}
	
}
