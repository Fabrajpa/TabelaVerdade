import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
public static int opcao;

	public static void main(String[] args) {

		do {

			opcao = opcaoMenuPrincipal();
			switch (opcao) {
			case 1:
				cadastrarCliente();

				break;
			case 2:
				cadastrarFuncionario();
				break;
			case 3:
				cadastrarVeiculo();
				break;
			case 4:
				procurarVeiculo();
				break;
			default:
				System.out.println("Opção Inváda !!!");

			}
		} while (opcao != -1);
		System.out.println("FIM !!!");

	}

	private static int opcaoMenuPrincipal() {

		System.out.println("############# MENU INICIAL #############");
		System.out.println("######### 1. Cadastrar Cliente #########");
		System.out.println("####### 2. Cadastrar Funcionário #######");
		System.out.println("######### 3. Cadastrar Veículo #########");
		System.out.println("######### 4. Procurar veículo ##########");
		System.out.println("########### 5. Procurar vaga ###########");
			
			
			return opcao;
	}

	Scanner in = new Scanner(System.in);

	Calendar calendar = Calendar
			.getInstance();calendar.set(Calendar.YEAR,2015);calendar.set(Calendar.MONTH,2);calendar.set(Calendar.DAY_OF_MONTH,10);
	Date date = calendar.getTime();System.out.println(date);

	System.out.println("Digite seu nome: ");
	String nome = in.nextLine();

	System.out.println("Digite seu CPF: ");
	long cpf = in.nextLong();

	System.out.println("Digite seu endereço: ");
	String endereco = in.next();

	System.out.println("Digite seu telefone: ");
	int telefone = in.nextInt();

	System.out.println("Digite a forma de pagamento: ");
	String pagamento = in.next();

}

}
