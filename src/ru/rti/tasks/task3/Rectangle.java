package ru.rti.tasks.task3;

public class Rectangle implements AbstractShape {
	
	private double length = 0;
	private double width = 0;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getSquareSize() {
		return length * width;
	}

	@Override
	public double getSidesLength() {
		return 2 * (length + width);
	}

}
