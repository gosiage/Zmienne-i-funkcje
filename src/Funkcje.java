
public class Funkcje
{

	public static void main(String[] args)
	{
		// wypisz();
		System.out.println(" Obwod ko³a wynosi " + obliczObwodKola(10.0) );
	
	}
	public static double obliczObwodKola(double r)
	{

		double obwodKola = 2*Math.PI*r;
				return obwodKola;
	}
	
}