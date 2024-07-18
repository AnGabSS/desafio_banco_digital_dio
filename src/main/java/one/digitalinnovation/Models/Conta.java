package one.digitalinnovation.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements IConta{

    private static final int AGENCIA_PRINCIPAL = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        agencia = AGENCIA_PRINCIPAL;
        numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta destino) {
        sacar(valor);
        destino.depositar(valor);
    }

    protected void imprimirInfos(){
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo: " + saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente.toString() +
                '}';
    }
}
