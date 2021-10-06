
public class ContaBancaria {
    private String numero = "00000-0";
    private String agencia = "0000-0";
    private double saldo = 0.0;
    private int codigoTipo = 1; //1 = Conta Corrente, 2 = Conta Poupança
    private String nomeTipo = "Conta Corrente";

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigo_tipo(int codigoTipo) {
        this.codigoTipo = codigoTipo;

        if (this.codigoTipo == 1)
            this.nomeTipo = "Conta Corrente";
        else if (this.codigoTipo == 2)
            this.nomeTipo = "Conta Poupanca";
        else
            System.out.println("Tipo invalido");
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNome_tipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + getSaldo());
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor)
            this.saldo -= valor;
        else
            System.out.println("Saldo insuficiente!");
    }

}