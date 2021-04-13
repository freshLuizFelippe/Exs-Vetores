import java.util.Scanner;

public class selecaovetor {

	public static void main(String[] args) {
	
	 double[] n = new double[10];

	        
	 Scanner scan = new  Scanner(System.in);
	      
	 for(int i = 0; i < n.length; i++) 
	 {
	 System.out.println("Insira os valores");
	  n[i] = scan.nextDouble();	            
	  }
	        
	 for(int i = 0; i < n.length; i++) 
	 {           
	 if( n[i] <= 10) 
	 {	 
	 System.out.println("n[" + i + "] = " + n[i]);
	       }
	            
	     }

	}

}
