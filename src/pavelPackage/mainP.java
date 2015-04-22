package pavelPackage;

public class mainP {
	public static void main(String[] args) {
		System.out.println("Hello World, Pasha!");
		mainP mc = new mainP();
		// Викличемо функцію, і перевіримо правильність результату
		
		double x = 0;
		double y = mc.function(x);
		System.out.println("x = " + x + "; and y = " + y);
	}
	public double function (double x) {
		
		double y = 0;
		if (x != 0){
		// Firstly check correctness of input x
		  if(Math.sin((Math.PI)/x) >= 0) {
			y = Math.log10(Math.sin(Math.PI/x));
			
		  } else {
		 System.out.println("Incorrect input value x!");
		  }
		} else{
			System.out.println("x can not be equal to 0");
		}
		return y;
	}
}
