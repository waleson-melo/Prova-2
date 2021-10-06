public class Eleitoral {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // -----------------------------------------------------------------------------

    public void imprimir() {
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade());
    }

    public void verificar() {
        if (getIdade() < 16) {
            System.out.println("Eleitor não pode votar");
        } else if ((getIdade() >= 16) && (getIdade() <= 65)) {
            System.out.println("Eleitor deve votar");
        } else {
            System.out.println("Voto facultativo");
        }
    }
}
