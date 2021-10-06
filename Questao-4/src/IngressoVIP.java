public class IngressoVIP extends Ingresso{
    private float valorAdicional;

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    // ------------------------------------------------------------------------------

    public float valorVIP(){
        setValor(getValor() + getValorAdicional());
        return getValor();
    }
}
