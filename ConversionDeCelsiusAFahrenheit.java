/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class ConversionDeCelsiusAFahrenheit {
    public static void main(String[] args) {
        final double celsius_a_fahrenheit = 9.0 / 5.0; // Constante 
        double celsius, fahrenheit;

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        celsius = input.nextDouble();

        fahrenheit = (celsius * celsius_a_fahrenheit) + 32;

        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }
}
