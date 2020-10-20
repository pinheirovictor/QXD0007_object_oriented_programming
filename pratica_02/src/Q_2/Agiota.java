package Q_2;

import java.util.ArrayList;
import java.util.Collections;

public class Agiota {

	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<Transacao> transacoes = new ArrayList<Transacao>();
	float saldo;
	int nextTrId;

	public Agiota(float saldoInicial) {
		this.saldo = saldoInicial;
		clientes = new ArrayList<>();
		transacoes = new ArrayList<>();
		this.nextTrId = 0;
	}

	// metodo de pegar cliente
	public Cliente pegarCliente(String codenome) {
		for (Cliente cliente : clientes)
			if (cliente.codenome.equals(codenome))
				return cliente;
		return null;
	}

	// metodo de adcionarclientes a lista de clientes a partir do cliente
	// selecionado
	public void adicionarCliente(String codenome, String fullname) {
		Cliente cliente = pegarCliente(codenome);
		if (cliente == null)
			clientes.add(new Cliente(codenome, fullname));

	}

	// metodo emprestar dinheiro ao cliente
	public boolean emprestar(String codenome, float valor) {
		Cliente cliente = pegarCliente(codenome);
		if (cliente == null)
			return false;
		if (this.saldo > valor) {
			cliente.creditar(saldo);
			transacoes.add(new Transacao(this.nextTrId, codenome, valor));
			return true;
		}
		return false;
	}

	/// metodo recber dinheiro emprestado
	public boolean receber(String codenome, float valor) {
		Cliente cliente = pegarCliente(codenome);
		if (cliente == null)
			return false;
		if (this.saldo <= valor) {
			cliente.debitar(saldo);
			transacoes.add(new Transacao(this.nextTrId, codenome, -valor));
			return true;
		}
		return false;
	}

	// metodo matar cliente se nao pagar
	boolean matar(String codenome) {
		Cliente cliente = pegarCliente(codenome);
		if (cliente == null)
			return false;
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).codenome.equals(codenome)) {
				clientes.remove(i);
				break;
			}
		}
		int i = 0;
		while (i < clientes.size()) {
			if (transacoes.get(i).codenome.equals(codenome))
				transacoes.remove(i);
			else
				i += 1;
		}
		return true;

	}

	// metodo gerar historico de transacoes
	String getHistorico() {
		String saida = "";
		for (Transacao tr : transacoes)
			saida += tr + "\n";
		return saida;
	}

	// metodo to string
	@Override
	public String toString() {
		return "Agiota [clientes=" + clientes + ", transacoes=" + transacoes + ", saldo=" + saldo + ", nextTrId="
				+ nextTrId + "]";
	}

}
