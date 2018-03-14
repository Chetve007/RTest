package ru.rti.tasks.task3;

import java.util.ArrayList;
import java.util.List;

import ru.rti.tasks.RunnableTask;

public class PolymorphismSample extends RunnableTask {
	
	List<Circle> circle = new ArrayList<>();
	List<Rectangle> rectangle = new ArrayList<>();

	@Override
	public void runTask() {
		
		circle.add(new Circle(5.3));
		circle.add(new Circle(6.9));
		circle.add(new Circle(4.1));
		
		rectangle.add(new Rectangle(2.3, 1.8));		
		rectangle.add(new Rectangle(9.7, 4.5));	
		rectangle.add(new Rectangle(6.6, 7.1));	
		
		System.out.println("Calculates the circle length.");
		for(Circle item : circle) {
			System.out.print(item.getSidesLength() + "  ");
		}
		System.out.println("\nCalculates the area of circle.");
		for(Circle item : circle) {
			System.out.print(item.getSquareSize() + "  ");
		}
		System.out.println("\nRectangle. Calculates the sum of the lengths of all sides.");
		for(Rectangle elem : rectangle) {
			System.out.print(elem.getSidesLength() + "  ");
		}
		System.out.println("\nCalculates the area of rectangle.");
		for(Rectangle elem : rectangle) {
			System.out.print(elem.getSquareSize() + "  ");
		}
	}

	@Override
	public void init() {
		
	}
}
