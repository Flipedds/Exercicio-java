package model;

public class Produto {
    private int Codigo;
    private String Nome;
    private float valor;
    private Fornecedor fornecedor;



public Produto(int Codigo, String Nome, float valor, Fornecedor fornecedor){
   this.Codigo = Codigo;
   this.Nome = Nome;
   this.valor = valor;
   this.fornecedor = fornecedor;
}

public int get_Codigo(){
    return Codigo;
}

public void setNome(String nome) {
    Nome = nome;
}

public void setValor(float valor) {
    this.valor = valor;
}

public void setFornecedor(Fornecedor fornecedor) {
    this.fornecedor = fornecedor;
}

public String atualizarPreco (float valor){
    if (valor > 0){
        this.valor = this.valor + (this.valor *(valor/100));
        String resultado = "o valor total é de:" + this.valor;
        return resultado;
    }
    String erro = "erro ao atualizar";
    return erro;
}

@Override
public String toString(){
    return "Codigo: " + this.Codigo + " Nome: " + this.Nome + " valor: " + this.valor + "\n"+"Fornecedor: " + this.fornecedor;
}

}
