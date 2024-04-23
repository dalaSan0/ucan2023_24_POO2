package avc5;
public class DepositAccount{
    private int accountID;
    private double saldo;
    
    public DepositAccount(double saldo){
        this.saldo=saldo;
        accountID=0;
    }
    
    public void setAccountID(int accountID){
        if(accountID==0)
            this.accountID=accountID;
    }
    public int getAccountID() {
        return accountID;
    }
    public double getSaldo() {
        return saldo;
    }
    public void addSaldo(double valor) {
        this.saldo += valor;
    }
    public boolean subtractSaldo(double valor){
        if(this.saldo-valor<0) return false;
        this.saldo-=valor;
        return true;
    }
}
