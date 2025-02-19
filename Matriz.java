/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
		Object nomes[][] = new Object[2][3];
		
		nomes[0][0] = 10; // adicionando o número 10 no x = 0, y = 0
		nomes[1][2] = "Presente"; // adicionando a string "Presente" no x = 2, y = 1
		
		System.out.println(nomes[0][0] +", " + nomes[1][0]);
		System.out.println(nomes[0][1] +", " + nomes[1][1]);
		System.out.println(nomes[0][2] +", " + nomes[1][2]);
	}
}
