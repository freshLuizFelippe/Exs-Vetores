import javax.swing.JOptionPane;

public class Impares {

	public static void main(String[] args) {
	

		int x, y, z, soma;
		
		z= 0;
		soma = 0;
		
		 x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
	     y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));
	     
	    if (y > x) 
	    {
	    	z = y;
	    	y = x;
	    	x = z;
	    }
	    
	    for (int i = y + 1; i < x; i++) 
	    {
	    	if (i % 2 != 0) 
	    	{
	    		soma = soma + i;
	    	}
	    	
	    }
	    
	    JOptionPane.showMessageDialog(null, "A soma dos n�meros �mpares entre " + y + " e " + x + " � igual a: " + soma);
	    //JOptionPane.showMessageDialog(null, total);
	

	}

}
