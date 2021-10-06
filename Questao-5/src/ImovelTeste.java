public class ImovelTeste {
    public static void main(String[] args) {
        Novo imovelNovo = new Novo();
        Velho imovelVelho = new Velho();

        // Novo
        System.out.println("Imovel Novo");
        imovelNovo.setEndereco("Rua do imovel novo bairro no imovel novo");
        imovelNovo.setPreco(1000);
        imovelNovo.setPrecoAdicional(500);
        System.out.println("Endereco: " + imovelNovo.getEndereco());
        System.out.println("Preco: " + imovelNovo.getPreco());
        System.out.println("Preco adicional: " + imovelNovo.getPrecoAdicional());
        imovelNovo.imprimirValorAdicional();

        System.out.println("");

        // Velho
        System.out.println("Imovel Velho");
        imovelVelho.setEndereco("Rua do imovel velho bairro do imovel velho");
        imovelVelho.setPreco(1000);
        imovelVelho.setPrecoDesconto(500);
        System.out.println("Endereco: " + imovelVelho.getEndereco());
        System.out.println("Preco: " + imovelVelho.getPreco());
        System.out.println("Desconto: " + imovelVelho.getPrecoDesconto());
        imovelVelho.imprimirValorDesconto();
    }
}
