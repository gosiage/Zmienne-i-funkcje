import java.util.Scanner;

public class BMI

{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	//	System.out.println(" Podaj imi� " );
	//	String imi� = input.nextLine();
	//	System.out.println("Witaj " + imi�);
		
	//	System.out.println("Podaj tw�jk wiek");
	//	int wiek = input.nextInt();
	//	System.out.println("Twoj Wiek to " + wiek);
		
		System.out.println("Podaj tw�j wzrost w cm");
		double wzrost = input.nextDouble();
		System.out.println("Podaj Twoj� wag� w kg (bez oszustw)");
		double waga = input.nextDouble();
		wzrost = wzrost / 100;
		double bmi = waga/(Math.pow(wzrost, 2));
		System.out.println("Twoj indeks bmi wynosi: " + bmi) ;
	}
	
	
}