package model;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoProdutos {
    private List<Produto> produtos;

public ConjuntoProdutos(){
    this.produtos = new ArrayList<Produto>();
}

public String set_produto(Object produto){
    boolean idExiste = false;
        for (Produto elemento : this.produtos) {
            if (((Produto) elemento).get_Codigo() == ((Produto) produto).get_Codigo()) {
                idExiste = true;
                break;
            }
        }

        if (idExiste) {
            return "Código já existe na lista. Não é possível cadastrar o novo produto.";

        } else {
            this.produtos.add((Produto) produto);
            return "Cadastrado com Sucesso";
        }
}


public boolean exists_produto(Object produto){
    if(this.produtos.contains((Produto) produto)){
        return true;
    }
    return false;
}

public Object search_produto(Object produto){ 
    for (Produto elemento : this.produtos) {
        if (elemento.equals(produto)) {
            return elemento;
        }
    }
    return " Produto não encontrado !";
}

public String atualizar_preco_produto(Object produto, float valor){
    for (Produto elemento : this.produtos) {
        if (elemento.equals(produto)) {
            elemento.atualizarPreco(valor);
            return "Produto Atualizado";
        }
    }
    return "Produto não encontrado para atualizar !";
}

public String atualizar_nome_produto(Object produto, String Nome){
    for (Produto elemento : this.produtos) {
        if (elemento.equals(produto)) {
            elemento.setNome(Nome);
            return "Produto Atualizado";
        }
    }
    return "Produto não encontrado para atualizar !";
}

public String atualizar_valor_produto(Object produto, float valor){
    for (Produto elemento : this.produtos) {
        if (elemento.equals(produto)) {
            elemento.setValor(valor);
            return "Produto Atualizado";
        }
    }
    return "Produto não encontrado para atualizar !";
}



public String remove_produto(Object produto){
    for (Produto elemento : this.produtos) {
        if (elemento.equals(produto)) {
            this.produtos.remove(elemento);
            return "Produto removido com sucesso";
        }
    }
    return "produto não encontrado para remover!";
}


@Override
public String toString(){
    String prods;
    prods = "";
    for(Produto prod : this.produtos){
        prods += prod.toString() + '\n';
    }
    return prods;
}

}