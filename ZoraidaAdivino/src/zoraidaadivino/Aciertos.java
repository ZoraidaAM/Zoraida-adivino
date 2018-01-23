package zoraidaadivino;

	import java.util.Scanner;

	/**
	 * Programa para adivinar un número aleatorio 
	 * @author Zoraida
	 * @version 23/01/2018
	 */
	public class Aciertos { 

	    /**
	     * Método que genera un numero aleatorio
	     * Pide al usuario que introduzca un número entero  
	     * Proporciona orientaciones para acertar el numero aleatorio
	     * @param n valor que introducimos por teclado
	     * @param cont contador de intentos
	     * @param x valor aleatorio para adivinar
	     */
	    public static void main(String[] args) {
	        int n = 0,cont = 0;
	        int x = (int) (500 *Math.random());
	        //System.out.print(x);
	        Scanner sc = new Scanner(System.in);
	        do {
	            System.out.print("\nIntroduce el valor de X: ");
	            n = sc.nextInt();
	            if (n > x) {
	                System.out.print("Te pasaste Amigo");
	            } else if (n < x){
	                System.out.print("Casi cerca ...");
	            }
	            cont++;
	        } while (n != x);
	        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
	        sc.close();
	    }
	}


