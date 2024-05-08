public class Array2Dprint {
    public static void main(String[] args) {

      //array declaration
        int[][] marks1=new int[2][3];
        //imtialization
        marks1[0][0]=10;
        marks1[0][1]=11;
        marks1[0][2]=12;
        marks1[1][0]=13;
        marks1[1][1]=14;
        marks1[1][2]=15;
        int marks2[][]={{1,2,3},
                         {4,5,6,5},
                         {7,8,9}};

        //marks.length=number of row
        for(int i=0;i<marks2.length;i++){//printing the rows
            for(int j=0;j<marks2[i].length;j++){ //printing the columns
                System.out.print(marks2[i][j]+" "); //printing the all array matrix format
            }
            System.out.println();
        }
    }
    
}
