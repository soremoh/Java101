package Theater;

public class Theater {

    //좌석 배열 만들기
    private String movieTitle;
    private int column;
    private int row;
    private boolean[][] seat;

    Theater(){

        this.row = 14;
        this.column = 14;
        this.seat = new boolean[this.row][this.column];
    }
    Theater(int row,int column){
        this.row = row;
        this.column = column;
        this.seat = new boolean[this.row][this.column];
    }

    void makeTitle(String movieTitle){

        this.movieTitle = movieTitle;
    }
    void makeReservation(int row, int column){
        if((this.row >= row && row >= 0) && (this.column >= column && column >=0 ))  seat[row][column] = true;
        else if(seat[row][column]==true) System.out.println("this seat has reservation");
        else System.out.println("you input a wrong seat");
    }

    void showSeats(){
        System.out.println("-----"+this.movieTitle+"-----");
        System.out.println("----Screen----");
        for (int i=0; i< seat.length;i++){
            for (int j = 0;j<seat[i].length;j++){
                if(seat[i][j]==false) System.out.print("x");
                else System.out.print("o");
            }
            System.out.println();
        }
        System.out.println("------end------");
    }


}
