public class ContaImposto extends ContaBancaria{
    private double percentualImposto;

    public double getPercentualImposto() {
        return percentualImposto;
    }

    public void setPercentualImposto(double percentualImposto) {
        this.percentualImposto = percentualImposto;
    }

    //-------------------------------------------------------------------------------

    public void calcularImposto(){
        setSaldo(getSaldo() - (getSaldo() * (getPercentualImposto() / 100)));
    }
}
