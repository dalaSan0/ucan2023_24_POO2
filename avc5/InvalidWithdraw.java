package avc5;
public class InvalidWithdraw extends Exception{
    public InvalidWithdraw(){
        super("Operacao Cancelada! Saldo Insuficiente");
    }
}
