public class Main {
    public static void main(String[] args) {
        ContaImposto contaImposto = new ContaImposto();

        double valor;

        // Criando Conta
        contaImposto.setAgencia("0500");
        contaImposto.setCodigo_tipo(1);
        contaImposto.setNumero("123123");
        System.out.println("Agencia: " + contaImposto.getAgencia());
        System.out.println("Tipo Conta: " + contaImposto.getNomeTipo());
        System.out.println("Numero da conta: " + contaImposto.getNumero());

        System.out.println("");

        // Depositando na conta
        valor = 1000;
        System.out.println("Depositando: " + valor);
        contaImposto.depositar(valor);
        contaImposto.mostrarSaldo();

        System.out.println("");

        // Sacando da conta
        valor = 200;
        System.out.println("Sacando: " + valor + "reais.");
        contaImposto.sacar(valor);
        contaImposto.mostrarSaldo();

        System.out.println("");

        // Depositando na conta
        valor = 200;
        System.out.println("Depositando na conta " + valor + " reais.");
        contaImposto.depositar(valor);
        contaImposto.mostrarSaldo();

        System.out.println("");

        // Setando Importo
        contaImposto.setPercentualImposto(10);
        System.out.println("Percentual de Imposto: "
                + contaImposto.getPercentualImposto() + "%");

        System.out.println("");

        // Calculando e descontando
        System.out.println("Subtraindo " + contaImposto.getPercentualImposto() + "%"
            + " de " + contaImposto.getSaldo());
        contaImposto.calcularImposto();
        System.out.println("Saldo apos desconto: ");
        contaImposto.mostrarSaldo();
    }
}
