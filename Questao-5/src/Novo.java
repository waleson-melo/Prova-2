public class Novo extends Imovel{
    private float precoAdicional;

    public float getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(float precoAdicional) {
        this.precoAdicional = precoAdicional;
    }

    // ------------------------------------------------------------------------------

    public void imprimirValorAdicional(){
        System.out.println("Valor do imovel com adicional: "
            + (getPrecoAdicional() + getPreco()));
    }
}
