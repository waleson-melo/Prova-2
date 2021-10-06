public class Velho extends Imovel{
    private float precoDesconto;

    public float getPrecoDesconto() {
        return precoDesconto;
    }

    public void setPrecoDesconto(float precoDesconto) {
        this.precoDesconto = precoDesconto;
    }

    // ------------------------------------------------------------------------------

    public void imprimirValorDesconto(){
        System.out.println("Valor do imovel com desconto: "
                + (getPreco() - getPrecoDesconto()));
    }
}
