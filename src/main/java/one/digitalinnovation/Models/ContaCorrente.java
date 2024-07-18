package one.digitalinnovation.Models;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=======Extrato Conta Corrente======");
        super.imprimirInfos();
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                super.toString();
    }
}
