package one.digitalinnovation.Models;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=======Extrato Conta Poupanca======");
        super.imprimirInfos();
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                super.toString();
    }
}
