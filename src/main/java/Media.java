import java.util.Scanner;

public class Media {
	
	Scanner sc = new Scanner(System.in);
	public double Media(double n1, double n2) {
		System.out.println("primeiro valor");
		n1 = sc.nextDouble();
		System.out.println("segundo valor");
		n2 = sc.nextDouble();
		
		return (n1 + n2) /2;
	}
}
