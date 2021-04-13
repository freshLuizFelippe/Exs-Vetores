import java.util.Scanner;

public class preenchimentovetor {

	public static void main(String[] args) {
		int [] n = new int [10];
		int x;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor"); 
		x = scan.nextInt();
		
		while(!(x <= 50 && x > 0));	
		
		n[0] = x;
		System.out.println("n[" + 0 + "] = " + n[0]);
		
		for (int i = 1; i < n.length; i++) 
			{
				n[i] = n[i-1] * 2;
				System.out.println("n[" + i + "] = " + n[i]);
			}

	}

}
