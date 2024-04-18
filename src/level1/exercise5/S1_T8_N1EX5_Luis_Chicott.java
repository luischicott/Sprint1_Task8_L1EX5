package level1.exercise5;

import java.io.PrintStream;

public class S1_T8_N1EX5_Luis_Chicott implements PiValue  {

	public static void main (String[] args) {
		
	S1_T8_N1EX5_Luis_Chicott instance = new S1_T8_N1EX5_Luis_Chicott();
	
	
	System.out.println("The value of pi is " + instance.getPiValue()); 
	

		
	}
	
	public double getPiValue() {
        return 3.1415; 
    }

}
