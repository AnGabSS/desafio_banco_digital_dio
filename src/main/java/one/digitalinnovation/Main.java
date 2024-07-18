package one.digitalinnovation;

import one.digitalinnovation.Models.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Cliente Angelo = new Cliente("Angelo");
        Cliente Giovanna = new Cliente("Giovanna");

        Conta cc = new ContaCorrente(Giovanna);
        cc.depositar(100);
        cc.depositar(200);
        cc.sacar(50);


        Conta cp = new ContaPoupanca(Angelo);
        cp.depositar(70);
        cp.depositar(320);
        cp.sacar(50);
        cp.transferir(100, cc);

        List<Conta> contas = new ArrayList();
        contas.add(cc);
        contas.add(cp);


        Banco banco = new Banco("BANCO", contas);

        banco.imprimir();
        cc.imprimirExtrato();
        cp.imprimirExtrato();
 }
}