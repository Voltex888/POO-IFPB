package Aula06;

public class Cliente {
    private String nomeCliente, numero;

    public Cliente(String nomeCliente, String numero) {
        this.nomeCliente = nomeCliente;
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    @Override
    public String toString(){
        return "Cliente{ " + nomeCliente + " Numero: " + numero;
    }
}
