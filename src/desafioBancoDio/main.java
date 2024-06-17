package desafioBancoDio;

public class main {
	
	public static void main(String[] args) {
		Cliente jaqueline = new Cliente();
		jaqueline.setNome("Jaqueline");
		
		  Banco banco = new Banco(); 
	        banco.setNome("Banco 1");

		
		conta cc = new ContaCorrente(jaqueline);
		conta poupanca = new ContaPoupanca(jaqueline);

		banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		
	 conta contaEncontrada = banco.buscarConta(cc.getNumero()); 
     if (contaEncontrada != null) {
         System.out.println("Conta encontrada!");
         contaEncontrada.imprimirExtrato(); 
     } else {
         System.out.println("Conta não encontrada.");
     }
	
}
}
