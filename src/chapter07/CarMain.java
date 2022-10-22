package chapter07;

public class CarMain {
    public static void main(String[] args) {
/*
        Car tesla = new Car();
        tesla.go();
        System.out.println(tesla.Color);
        tesla.Color = "pink";
        System.out.println(tesla.Color);
        tesla.Company = "Korea's factory";
        tesla.type = "gasoline";

*/
        Car[] ticos = new Car[5];
        Car[] car = new Car[3];


        Car sm3 = new Car();
        sm3.Color = "white";
        sm3.Company = "samsung";
        sm3.type = "gasoline";

        for(int i=0; i< ticos.length;i++){
            ticos[i] = sm3;
        }

        System.out.println( ticos[0].Color);
        sm3.Color = "black";
        System.out.println( ticos[1].Color);

    }
}
