public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        IngressoVIP ingressoVIP = new IngressoVIP();

        float valor = 100, valorComAdicional;

        ingresso.setValor(valor);
        ingressoVIP.setValor(valor);
        ingressoVIP.setValorAdicional(50);

        valorComAdicional = ingressoVIP.valorVIP();

        System.out.print("Valor Ingresso: ");
        ingresso.imprimirValor();
        System.out.println("Valor Ingresso VIP com adicional: " + valorComAdicional);
    }
}
