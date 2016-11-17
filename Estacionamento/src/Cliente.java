
public class Cliente extends Pessoa {
	private String formaDePagamento;

	public Cliente(String nome, long cpf, int telefone, String endereco, String formaDePagamento) {
		super(nome, cpf, telefone, endereco);
		this.formaDePagamento = formaDePagamento;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

}
