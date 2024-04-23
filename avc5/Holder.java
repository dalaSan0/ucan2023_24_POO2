package avc5;
public class Holder {
    private String nome;
    private int numCliente;
    private BankAccount contaBancaria;

    public Holder(String nome, int numCliente) {
        this.nome = nome;
        this.numCliente = numCliente;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumCliente() {
        return numCliente;
    }
    public BankAccount getContaBancaria() {
        return contaBancaria;
    }
    public void setContaBancaria(BankAccount contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
}
