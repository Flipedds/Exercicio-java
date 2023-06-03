package model;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoProdutos {
    private List<Produto> produtos;

public ConjuntoProdutos(){
    this.produtos = new ArrayList<Produto>();
}

public String set_produto(Produto produto){
    boolean CodExiste = false;
        for (Produto elemento : this.produtos) {
            if (elemento.get_Codigo() == produto.get_Codigo()) {
                CodExiste = true;
                break;
            }
        }

        if (CodExiste) {
            return "Código já existe na lista. Não é possível cadastrar o novo produto.";

        } else {
            this.produtos.add((Produto) produto);
            return "Cadastrado com Sucesso";
        }
}


public boolean exists_produto(Produto produto){
    if(this.produtos.contains(produto)){
        return true;
    }
    return false;
}

public Object search_produto(Produto produto){
    for (Produto elemento : this.produtos) {
        if (elemento.equals(produto)) {
            return elemento;
        }
    }
    return " Produto não encontrado !";
}

public String atualizar_preco_produto(Produto produto, float valor){
    for (Produto elemento : this.produtos) {
        if (elemento.equals(produto)) {
            elemento.atualizarPreco(valor);
            return "Produto Atualizado";
        }
    }
    return "Produto não encontrado para atualizar !";
}

public String atualizar_nome_produto(Produto produto, String Nome){
    for (Produto elemento : this.produtos) {
        if (elemento.equals(produto)) {
            elemento.setNome(Nome);
            return "Produto Atualizado";
        }
    }
    return "Produto não encontrado para atualizar !";
}

public String atualizar_valor_produto(Produto produto, float valor){
    for (Produto elemento : this.produtos) {
        if (elemento.equals(produto)) {
            elemento.setValor(valor);
            return "Produto Atualizado";
        }
    }
    return "Produto não encontrado para atualizar !";
}

public String atualizar_fornecedor_produto(Produto produto, Fornecedor fornecedor){
        for (Produto elemento : this.produtos) {
            if (elemento.equals(produto)) {
                elemento.setFornecedor(fornecedor);
                return "Fornecedor do Produto Atualizado";
            }
        }
        return "Produto não encontrado para atualizar o fornecedor!";
    }



public String remove_produto(Produto produto){
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
    prods = "Produtos: \n";
    for(Produto prod : this.produtos){
        prods += prod.toString() + '\n';
    }
    return prods;
}

}