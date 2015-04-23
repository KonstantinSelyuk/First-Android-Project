package maksPackage;

public class MainM {
	public static void main(String[] args) {
		System.out.println("Hello Maks");
		 MainM mc = new MainM();
		 
		 double x = 0;
		 double y = mc.function(x);
		 System.out.println("x = " + x  + "; and y = " + y);
	}
	    public double function (double x) {
	    	double y = 0;
			
			if(x*Math.pow((Math.sin((Math.PI)*x)), 2) >= 0) {
				
	y = (x - Math.abs(x))*Math.sqrt(x*Math.pow(Math.sin((Math.PI)*x), 2));
				
			 } else {
				 System.out.println("Incorrect input value x!");
				  }
				return y;
	}
}

