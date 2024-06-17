package desafioBancoDio;

public class ContaCorrente extends conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

		@Override
		public void imprimirExtrato() {
			System.out.println("=== Extrato conta corrente ===");
			super.imprimirInformaçoesComuns();
		 
		
		
	}

		
	
}
