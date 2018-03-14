package ru.rti.tasks.task2;
import ru.rti.tasks.RunnableTask;

public class ArithmeticAverageMatrix extends RunnableTask {
	
	private int rows = 0;
	private int cols = 0;
	private int[][] matrix = new int[rows][cols];
	
	public ArithmeticAverageMatrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		matrix = new int[rows][cols];
		
		if(rows <= 0 || cols <= 0)
			throw new IllegalArgumentException(
					"Ќеверное использование конструктора. «начени€ дл€ параметров 'rows' и 'cols' должны быть больше нул€.");
	}

	@Override
	public void runTask() {
		init();
		int result = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				result += matrix[i][j];
				System.out.printf("%6d", matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println("The arithmetic mean is " + result / (rows + cols));
		
	}

	@Override
	public void init() {
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(i % 3 == 0)
					matrix[i][j] = 100;
				else if(j % 2 == 0)
					matrix[i][j] = 200;
				else
					matrix[i][j] = i * j;
			}
		}
	}
}
