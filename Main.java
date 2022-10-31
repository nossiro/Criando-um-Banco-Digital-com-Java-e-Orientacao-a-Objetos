package DesafioBanco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String  resposta = "";
        Cliente orisson = new Cliente();
        orisson.setNome("Orisson");
                
        IConta cc = new ContaCorrente(orisson);
        cc.depositar(1500);

        IConta poupanca = new ContaPoupanca(orisson);
        cc.transferir(1000, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println("Gostaria de realizar alguma operação? S/N");
        resposta = leitor.nextLine();

            if (resposta.equalsIgnoreCase("S")){
                System.out.println("Qual operação gostaria de realizar e em qual conta?");
                System.out.println("DC - depositar na conta corrente");
                System.out.println("DP - depositar na poupança");
                System.out.println("SC - sacar da conta corrente");
                System.out.println("SC - sacar da conta poupança");
                System.out.println("TCP - transferir da conta corrente para a poupança");
                System.out.println("TPC - transferir da poupança para a conta corrente");
                String operacao = leitor.nextLine();

                switch (operacao){
                    case "DC":
                        System.out.println("Qual valor gostaria de depositar na conta corrente?");
                        Double valordepc = leitor.nextDouble();
                        cc.depositar(valordepc);
                        cc.imprimirSaldoAtual();
                        break;

                    case "DP":
                        System.out.println("Qual valor gostaria de depositar na poupança?");
                        Double valordepp = leitor.nextDouble();
                        poupanca.depositar(valordepp);
                        poupanca.imprimirSaldoAtual();
                        break;

                    case "SC":
                        System.out.println("Qual valor gostaria de sacar da conta corrente?");
                        Double valorsacc = leitor.nextDouble();
                        cc.sacar(valorsacc);
                        cc.imprimirSaldoAtual();
                        break;


                    case "SP":
                        System.out.println("Qual valor gostaria de sacar da poupança?");
                        Double valorsacp = leitor.nextDouble();
                        poupanca.sacar(valorsacp);
                        poupanca.imprimirSaldoAtual();
                        break;
                        
                    case "TCP":
                        System.out.println("Qual valor gostaria de transferir da conta corrente para a poupança?");
                        Double valortcp = leitor.nextDouble();
                        cc.transferir(valortcp, poupanca);
                        cc.imprimirSaldoAtual();
                        poupanca.imprimirSaldoAtual();
                        break;

                    case "TPC":
                        System.out.println("Qual valor gostaria de transferir da poupança para a conta corrente?");
                        Double valortpc = leitor.nextDouble();
                        poupanca.transferir(valortpc, cc);
                        cc.imprimirSaldoAtual();
                        poupanca.imprimirSaldoAtual();
                        break;
                        
                    default:
                        System.out.println("Entrada inválida, tente novamente!");
                        break;
                    }
                    resposta = "N";

            } if (resposta.equalsIgnoreCase("N")){ 
                System.out.println("Agradecemos pela preferência!");
            } else{
                System.out.println("Entrada inválida, tente novamente!");
        }
    }
}
