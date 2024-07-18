package one.digitalinnovation.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public void imprimir() {
        System.out.println("======= Banco: " + nome + "=========");
        for(Conta conta : contas) {
            System.out.println("Conta: " + conta);
        }
    }

}
