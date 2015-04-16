package test1;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hello World");
		MainClass mc = new MainClass();
		// Викличемо функцію, і перевіримо правильність результату
		double x = 23.4;
		double y = mc.function(23.4);
		System.out.println("x = " + x + "; and y = " + y);

	}
	
	public double function(double x) {
		double y = 0;
		// Firstly check correctness of input x
		if(Math.cos(x * x) >= 0) {
			y = Math.sqrt(Math.cos(x * x));
		} else {
			System.out.println("Incorrect input value x!");
		}
		return y;
	}

}
