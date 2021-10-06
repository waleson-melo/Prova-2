public class EleitoralTeste {
    public static void main(String[] args) {
        Eleitoral eleitor1 = new Eleitoral();
        Eleitoral eleitor2 = new Eleitoral();
        Eleitoral eleitor3 = new Eleitoral();

        // eleitor1
        eleitor1.setNome("Juninho");
        eleitor1.setIdade(10);
        eleitor1.imprimir();
        eleitor1.verificar();

        System.out.println();

        // eleitor2
        eleitor2.setNome("Ricardo");
        eleitor2.setIdade(19);
        eleitor2.imprimir();
        eleitor2.verificar();

        System.out.println();

        // eleitor3
        eleitor3.setNome("Bartolomeu");
        eleitor3.setIdade(79);
        eleitor3.imprimir();
        eleitor3.verificar();
    }
}
