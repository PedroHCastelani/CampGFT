package poo1;

import poo.model.Cliente;
import poo.model.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "000000";
        //dados endereço


        Cliente cliente = new Cliente();



        //dados cliente

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");

        }catch (Exception e) {
            System.err.println("Houve um erro ao adicionar endereço: " + e.getMessage());
        }
    }
}
