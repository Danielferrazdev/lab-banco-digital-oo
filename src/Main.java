
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		venilton.setPontuacaoCredito(700);

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(200);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		int pontuacaoMinima = 600;
		System.out.println("=== Resultado da análise de empréstimo ===");

		if (cc.verificarPontuacaoParaEmprestimo(pontuacaoMinima)) {

			System.out.println("Cliente " + cc.cliente.getNome() + " é elegível para solicitação de empréstimo.");
		} else {
			System.out.println(
					"Cliente " + cc.cliente.getNome() + " não tem pontuação suficiente para solicitar empréstimo.");
		}
	}

}
