package model;

public class Fornecedor {
    private String Cnpj;
    private String Telefone;
    private String Nome;



public Fornecedor(String Cnpj, String Telefone, String Nome){
    this.Cnpj = Cnpj;
    this.Telefone = Telefone;
    this.Nome = Nome;
}

@Override
public String toString(){
    return "Cnpj: " + this.Cnpj + " Telefone: " + this.Telefone + " Nome: " + this.Nome;
}

}
