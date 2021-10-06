public class Macaco {
    private String nome;
    private String bucho = "vento";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBucho() {
        return bucho;
    }

    public void setBucho(String bucho) {
        this.bucho = bucho;
    }

    // -----------------------------------------------------------------------------

    public void comer(String alimento) {
        setBucho(alimento);
    }

    public void verBucho() {
        System.out.println("O macaco " + getNome() + " tem no bucho " + getBucho());
    }

    public void digerir() {
        setBucho("vento");
    }
}
