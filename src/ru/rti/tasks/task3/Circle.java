package ru.rti.tasks.task3;

public class Circle implements AbstractShape {
	
	private double radius = 0;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getSquareSize() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getSidesLength() {
		return 2 * Math.PI * radius;
	}

}
