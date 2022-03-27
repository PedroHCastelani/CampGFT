package poo.model;

public class Endereco {

    public enum TipoEndereco {
        RESIDENCIAL,
        ENTREGA,
        TRABTALHO
    }

    public String endereco;
    public String numeroCasa;
    public String complementoEndereco;
    public String bairroEndereco;
    public String estadoEndereco;
    public String cep;

}
