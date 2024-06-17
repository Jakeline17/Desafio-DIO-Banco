package desafioBancoDio;

import java.util.ArrayList;
import java.util.List;

public class Banco {


	
	private String nome;
	private List<conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<conta> getContas() {
		return contas;
	}
	
	public void adicionarConta(conta conta) {
        contas.add(conta);
    }

	public void setContas(List<conta> contas) {
		this.contas = contas;
	}

	    public conta buscarConta(int numero) {
	        for (conta conta : contas) {
	            if (conta.getNumero() == numero) {
	                return conta;
	            }
	        }
	        return null;
	    }
	}
	
