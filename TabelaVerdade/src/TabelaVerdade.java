import java.util.Scanner;
public class TabelaVerdade {

	public static void main(String[] args) {

		String p, q, r;

		Scanner in = new Scanner(System.in);

		do {
			System.out.println("Dada a seguinte fórmula: " +
					"\n p v (q ^ r) <-> (p v q) ^ (p v r)");
			System.out.println("Insira v (verdadeiro) ou f (falso)");
			System.out.println("Digite o valor de p: ");
			p = in.nextLine();

			System.out.println("Digite o valor de q: ");
			q = in.nextLine();

			System.out.println("Digite o valor de r: ");
			r = in.nextLine();

			if (p.equals("v") && q.equals("v") && r.equals("v")) {
				System.out.println("O resultado da expressão é verdadeira.");
				System.out.println();
				
			} else if (p.equals("v") && q.equals("v") && r.equals("f")) {
				System.out.println("O resultado da expressão é verdadeira.");
				System.out.println();
			
			} else if (p.equals("v") && q.equals("f") && r.equals("v")) {
				System.out.println("O resultado da expressão é verdadeira.");
				System.out.println();
			
			} else if (p.equals("v") && q.equals("f") && r.equals("f")) {
				System.out.println("O resultado da expressão é verdadeira.");
				System.out.println();
				
			} else if (p.equals("f") && q.equals("v") && r.equals("v")) {
				System.out.println("O resultado da expressão é verdadeira.");
				System.out.println();
				
			} else if (p.equals("f") && q.equals("f") && r.equals("v")) {
				System.out.println("O resultado da expressão é verdadeira.");
				System.out.println();
				
			} else if (p.equals("f") && q.equals("v") && r.equals("f")) {
				System.out.println("O resultado da expressão é verdadeira.");
				System.out.println();
				
			} else if (p.equals("f") && q.equals("f") && r.equals("f")) {
				System.out.println("O resultado da expressão é verdadeira.");
				System.out.println();
			
			} else {
				System.out.println("Valor inserido inválido.");
				System.out.println();

			}
		} while (p != "as" && q != "as" && r != "as");
	}

}
