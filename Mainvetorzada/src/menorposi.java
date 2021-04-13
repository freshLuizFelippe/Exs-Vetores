import java.util.Scanner;

public class menorposi {

	public static void main(String[] args) {
		
		int n;
		int pos = 0, menor = 0;
		int x[];
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira quantos valores serão inseridos");	
		n = scan.nextInt();
		
		x = new int [n];
		
		for (int i = 0; i < x.length; i++) {
		
			System.out.println("Insira os valores");
			x[n] = scan.nextInt();	
			}
		for(int z = 0; z < x.length; z++) {
		
            if(z==0) {
            menor= x[z];
            pos = z;
            }

            if(x[z]<menor) {
                menor=x[z];
                pos = z;
          
            }
            System.out.println("Menor valor: " + menor);
            System.out.println("Sua posição: " + pos);
        }

	
		
	}
}
