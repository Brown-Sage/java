public class multidimensionalarr {
    public static void main(String[] args) {
        int [][] marks= new int [2][3];
        marks[0][0]=100;
        marks[0][1]=150;                             //this is 2-D array
        marks[0][2]=200;
        marks[1][0]=250;
        marks[1][1]=300;
        marks[1][2]=400;
        for (int i=0;i<marks.length;i++){
            for(int j=0; j<=marks.length;j++){       // loop nested because of 2 arrays if we do a 3-D
                System.out.println(marks[i][j]);     // we will have to make 3 variables and 3 for loop nests      
            }
        }
    }
}
