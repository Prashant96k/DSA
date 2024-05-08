public class Array2D {
    public static void main(String[] args) {
        //first type of array declaratization and create
        //declare and intialize
        int marks[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(marks[1][2]);
        
        //second way of creating array

        int[][] marks1=new int[2][3];
        //imtialization
        marks1[0][0]=10;
        marks1[0][1]=11;
        marks1[0][2]=12;
        marks1[1][0]=13;
        marks1[1][1]=14;
        marks1[1][2]=14;
        System.out.println(marks1[1][2]);
    }
}
