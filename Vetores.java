/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
		Object nomes[] = new Object[4];//cria um vetor o vetor consegue guardar varias variaveis dentro dele
		
		//sempre dar valor p varivel começando pela posição 0 aqui vai de 0 a 3, valores sem valor sao null 
		nomes[0] = "André";
		nomes[1] = 10;
		nomes[3] = "Andrei";
		
		System.out.println("posição 0: "+ nomes[0]);
		System.out.println("posição 1: "+ nomes[1]);
		System.out.println("posição 2: "+ nomes[2]);
		System.out.println("posição 3: "+ nomes[3]);
		System.out.println("");
		System.out.println("length: "+ nomes.length);
		
        /*String vCharacter[] // nome da variavel que é o vetor
        = {'R', 'x'}; // o vetor tem 2 valores R e x */
	}
}
