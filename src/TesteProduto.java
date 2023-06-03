import model.ConjuntoProdutos;
import model.Fornecedor;
import model.Produto;

public class TesteProduto {
    public static void main(String[] args) throws Exception {
        // criando fornecedores
        Fornecedor forn_1 = new Fornecedor("1234321", "98675-4354", "Ze maria");
        Fornecedor forn_2 = new Fornecedor("543212345", "97059-5968", "Claudio");

        // criando produtos
        Produto produto_um = new Produto(1, "Tv LCD", 3500, forn_1);
        Produto produto_dois = new Produto(2, "notebook", 2000, forn_2);
        Produto produto_tres = new Produto(3, "impressora", 232, forn_2);

        // produto com Código igual para teste
        // Produto produto_quatro = new Produto(1, "mouse", 200, forn_1);
        
        // Atualizando preço do produto apenas

        // System.out.println(produto_um.atualizarPreco(10));
        
        // objeto ConjuntoProdutos
        ConjuntoProdutos conjunto = new ConjuntoProdutos();

        // inserindo produtos na lista
        conjunto.set_produto(produto_um);
        conjunto.set_produto(produto_dois);
        conjunto.set_produto(produto_tres);

        // cadastrando produto com código igual ao existente na lista
        // System.out.println(conjunto.set_produto(produto_quatro));

        // confirmando se o produto existe na lista        
        // System.out.println(conjunto.exists_produto(produto_um));
        // System.out.println(conjunto.search_produto(produto_tres));
        
        // listando todos os produtos
        System.out.println(conjunto);

        // atualizar preço do produto 'porcentagem' da lista
        // System.out.println(conjunto.atualizar_preco_produto(produto_um, 10));

        // atualizar nome do produto da lista
        // System.out.println(conjunto.atualizar_nome_produto(produto_um, "Computador"));

        // atualizar valor do produto na lista
        System.out.println(conjunto.atualizar_valor_produto(produto_um, 2000));
        
        System.out.println(conjunto);

        // System.out.println("\n");
        // System.out.println(conjunto);

        // System.out.println("\n");
        
        // removendo produto da lista
        // System.out.println(conjunto.remove_produto(produto_um));

        // System.out.println("\n");
        // System.out.println(conjunto);
    }
}
