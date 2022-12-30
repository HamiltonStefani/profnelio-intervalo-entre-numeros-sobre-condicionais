package exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    double interv= sc.nextDouble();
		
		if (interv < 0.0 || interv > 100) {
			
			System.out.println("Fora de Intervalo");
			
		}else if(interv <=25) {
			
			System.out.println("Está entre 0, 25");
			
		}else if(interv <50) {
			
			System.out.println("está entre 25, 50");
			
		}else if(interv <75) {
			
			System.out.println("Está entre 50, 75");
			
		}else if(interv <=100) {
			
			System.out.println("Está entre: 75, 100");
			
		}

	}

}
