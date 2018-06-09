/**
 * @author		Vanessa Bellido	<vanessapalau@gmail.com>	(nom i correu)
 * @version		1.0				(versi� actual del programa)
 * @since		1.0				(primera versi� del programa)
 */
import java.util.Scanner;
public class Proyecto {
	public static void main(String[] args) {
		/** Aqu� s'escaneja*/
		Scanner sc = new Scanner(System.in);
		/** Aqu� introdueixes el nombre de casos*/
		int casos = sc.nextInt();
		/** Aqu� saltes la l�nia del n�mero*/
		sc.nextLine();
		/** Aqu�, segon els casos, es repeteix el bucle*/
		for(int i = 0; i < casos; i++)
		{
			/** Escaneja els codis */
			String codigos = sc.nextLine();
			/** Posa tots els codis en maj�scules */
			String c2 = codigos.toUpperCase();
			/** Busca la condici� en els codis*/
			int intIndex = c2.indexOf("GGGGG");
			/** Si no surt, torna el -1, i per tant,
			 * mostra per pantalla "hum�"*/
			if(intIndex == -1)
			{
				System.out.println("Humano");
			}
			/** La resta de casos, mostra per pantalla
			 * "Inhum�"*/
			else
			{
				System.out.println("Inhumano");
			}
		}
	}
}