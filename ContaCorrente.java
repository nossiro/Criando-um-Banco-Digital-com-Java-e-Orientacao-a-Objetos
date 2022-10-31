package DesafioBanco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.imprimirInfosComuns();
    }

    @Override
    public void imprimirSaldoAtual() {
        System.out.println("*** Saldo Atual Conta Corrente ***");
        super.imprimirSaldoAtual();
    
    }

}
