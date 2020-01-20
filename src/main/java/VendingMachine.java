import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Coins> values ;
    private Boolean isCoinInserted = false ;

    VendingMachine( ArrayList<Coins> values ){
        this.values =values;
        this.isCoinInserted = true;

    }
    VendingMachine(){

    }
    public void resetBalance(){
        this.values.clear();
    }
    public double  getBalance() {
       double money =0 ;
       if (!isCoinInserted){
           money=0;
       }
       else if  (this.values.size()>0 && isCoinInserted){
           for ( Coins value  : values ){
                money += value.getValue() ;
            }
        }
     return money ;
    }

    public double getReturn() {
        double returnAmount = getBalance();
       resetBalance();
        return returnAmount;
    }
}
