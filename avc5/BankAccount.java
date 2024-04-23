package avc5;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class BankAccount {
    private int contaBancariaID;
    private DemandAccount contaOrdem;
    private List<SavingAccount> contasPoupanca;
    private List<Holder> titulares;

    public BankAccount(int contaBancariaID) {
        this.contaBancariaID = contaBancariaID;
        contaOrdem = new DemandAccount(0.0);
        contasPoupanca=new ArrayList<>();
        titulares=new ArrayList<>();
    }
    
    public void deposit(double valor){
        contaOrdem.addSaldo(valor);
        System.out.println("Valor Depositado com sucesso!");
    }
    public void withdraw(double valor){
        try{
            if(contaOrdem.subtractSaldo(valor))
                System.out.println("Valor Levantado com Sucesso!");
            else throw new InvalidWithdraw();
        }
        catch(InvalidWithdraw e){
            System.out.println(e.getMessage());
        }
    }
    public double getDemandAccountBalance(){
        return contaOrdem.getSaldo();
    }
    public double getBalance(){
        double saldoPoupancas=0.0;
        if(!contasPoupanca.isEmpty()){
            for(SavingAccount poupaca:contasPoupanca)
                saldoPoupancas+=poupaca.getSaldo();
        }
            return getDemandAccountBalance()+saldoPoupancas;
    }
    public boolean removeAccount(){
        if(contaOrdem.getSaldo()==0){
            System.out.println("Conta Removida");
            return true;
        }
        else
            System.out.println("Operacao Cancelada! Conta nao-Nula");
        return false;
    }

    public int getContaBancariaID() {
        return contaBancariaID;
    }
    public DemandAccount getContaOrdem() {
        return contaOrdem;
    }
    public List<SavingAccount> getContasPoupanca() {
        return contasPoupanca;
    }

    public void addContasPoupanca(SavingAccount contaaPoupanca) {
        this.contasPoupanca.add(contaaPoupanca);
    }
    public List<Holder> getTitulares() {
        Comparator<Holder> comparador=(Holder t1, Holder t2) -> {
            if(t1.getNumCliente()>t2.getNumCliente())
                return 1;
            if(t1.getNumCliente()==t2.getNumCliente())
                return 0;
            return -1;
        };
        Collections.sort(titulares,comparador);
        return titulares;
    }
    public void addTitulares(Holder titular) {
        this.titulares.add(titular);
    }
}
