package desafioBancoDio;

public class ContaPoupanca extends conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

		@Override
		public void imprimirExtrato() {
			System.out.println("=== Extrato conta poupança ===");
			super.imprimirInformaçoesComuns();
		 
		
		
	}

		
	
}
