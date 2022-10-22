package vendingMachine;

public class VMPmachine {

    String[] beverages = {"pocari","cola","cider","welch's","vita500"};
    int[] stocks = new int[] {15,15,15,15,15};

    public void consume(int idx, int demand){
        if(stocks[idx] < demand) System.out.println(beverages[idx]+"Not enough beverages");
        else stocks[idx] -= demand;
    }

    public void fill(int idx, int quantity){
        if (stocks[idx]+quantity > 30) System.out.println(beverages[idx]+"Over beverages");
        else stocks[idx] += quantity;
    }

//    public void showBeverage(){
    //for(int i:stocks)
    //}

   // public void initLocate(){

    //}
}
