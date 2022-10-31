package DesafioBanco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupanca ***");
        super.imprimirInfosComuns();
        
    }

    @Override
    public void imprimirSaldoAtual() {
        System.out.println("*** Saldo Atual Conta Poupanca ***");
        super.imprimirSaldoAtual();
    
    }

}
