/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class CalculoAreaCirculo {
	public static void main(String[] args) {
	    final double PI=3.1416; //constante PI 
	    double radio,area;
	    Scanner input = new Scanner (System.in);
	    
		System.out.println("Ingrese el valor del radio del círculo: ");
		radio = input.nextDouble();
		area = PI*radio*radio;
		System.out.println("El área del ciruclo es =  "+ area);
	}
}
