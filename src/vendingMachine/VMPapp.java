package vendingMachine;

import vendingMachine.ui.VMPui;
import vendingMachine.ui.VMPui_machine;

public class VMPapp {
    public static void main(String[] args) {

        VMPsystem vmPsystem = new VMPsystem();
        VMPmachine vmPmachine = new VMPmachine();
        VMPui vmPui = new VMPui();
        VMPui_machine vmPui_machine = new VMPui_machine();

        // 0 - main // 1 - buyer // 2 - manager // 3 - exit
        do{
            switch (vmPsystem.location){
                case 0:
                    vmPui.entry(); vmPsystem.locate(); break;
                case 1: {
                    vmPui_machine.showMachine();
                    vmPsystem.setBuyerBeverage();
                    vmPui.howManyBeverage();
                    vmPsystem.setBuyerBeverageQuantity();
                    vmPmachine.consume(VMPsystem.buyerBeverage,VMPsystem.buyerBeverageQuantity);
                   // vmPmachine.showBeverage();
                    //vmPsystem.initLocate();
                }break;
                case 2:
                     vmPsystem.locate(); break;
                case 3: break;

            }
        }while(vmPsystem.location !=3);

        vmPui.bye();
    }
}
