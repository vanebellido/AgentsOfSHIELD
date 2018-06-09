/**
 * @author		Vanessa Bellido	<vanessapalau@gmail.com>	(nom i correu)
 * @version		1.0				(versió actual del programa)
 * @since		1.0				(primera versió del programa)
 */
import java.util.Scanner;
public class Proyecto {
	public static void main(String[] args) {
		/** Aquí s'escaneja*/
		Scanner sc = new Scanner(System.in);
		/** Aquí introdueixes el nombre de casos*/
		int casos = sc.nextInt();
		/** Aquí saltes la línia del número*/
		sc.nextLine();
		/** Aquí, segon els casos, es repeteix el bucle*/
		for(int i = 0; i < casos; i++)
		{
			/** Escaneja els codis */
			String codigos = sc.nextLine();
			/** Posa tots els codis en majúscules */
			String c2 = codigos.toUpperCase();
			/** Busca la condició en els codis*/
			int intIndex = c2.indexOf("GGGGG");
			/** Si no surt, torna el -1, i per tant,
			 * mostra per pantalla "humá"*/
			if(intIndex == -1)
			{
				System.out.println("Humano");
			}
			/** La resta de casos, mostra per pantalla
			 * "Inhumá"*/
			else
			{
				System.out.println("Inhumano");
			}
		}
	}
}