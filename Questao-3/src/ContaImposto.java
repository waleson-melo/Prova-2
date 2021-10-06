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
//        double saldo = getSaldo();
//        double imposto = saldo * (getPercentualImposto() / 100);
        setSaldo(getSaldo() - (getSaldo() * (getPercentualImposto() / 100)));
//
//        System.out.println("Imposto: " + imposto + "Saldo: " + saldo);
//        System.out.println("saldo depoid do desocnto: " + (saldo - imposto));
    }
}
