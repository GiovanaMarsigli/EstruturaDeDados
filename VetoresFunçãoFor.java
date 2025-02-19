/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
		String nomes[] = new String[20];
		nomes[0] = "André";
		nomes[1] = "Mariana";
		nomes[2] = "Giovana";
		nomes[3] = "Andrei";
		
		System.out.println("Tamanho do vetor: "+ nomes.length); // length retorna o tamanho do vetor 
		System.out.println("");
		System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		System.out.println(nomes[2]);
		System.out.println(nomes[3]);
		System.out.println("");
		
        // estrutura de repetição
        for(int i = 0; i < nomes.length; i++){ // O i indica da posição/ contagem de repetição
            System.out.println(nomes[i]);
        }
	}
}
