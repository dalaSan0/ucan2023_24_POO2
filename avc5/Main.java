package avc5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static int clienteNum=1;
    static int contaBancariaNum=1;
    public static void main(String[] args){
        List<Holder> titulares=new ArrayList<>();
        List<BankAccount> contasBancarias=new ArrayList<>();
        
        titulares=Arrays.asList(new Holder("TitularA",clienteID()),
                new Holder("Titular B",clienteID()),
                new Holder("Titular C",clienteID()));
        contasBancarias=Arrays.asList(new BankAccount(contaBancID()),
                new BankAccount(contaBancID()));
    }
    public void ordenarContaBancarias(List<BankAccount> contasBancarias){
        Comparator<BankAccount> comparador=(BankAccount c1, BankAccount c2) -> {
            if(c1.getContaBancariaID()>c2.getContaBancariaID())
                return 1;
            if(c1.getContaBancariaID()==c2.getContaBancariaID())
                return 0;
            return -1;
        };
        Collections.sort(contasBancarias,comparador);
    }
    public static void menuInicial(){
        System.out.println("1- Registrar Titular");
        System.out.println("2- Registrar Conta Bancaria");        
        System.out.println("3- Operacoes");
        System.out.println("4- Encerrar");
    }
    public static int clienteID(){
        return clienteNum++;
    }
    public static int contaBancID(){
        return contaBancariaNum++;
    }
}
