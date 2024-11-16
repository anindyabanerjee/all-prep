import java.util.Arrays;
import java.util.Scanner;

public class ShortestSubArray {
    //Main method to take the necessary inputs from user/screen
    public static void main(String[] args)  {
        Scanner scanner =new Scanner(System.in);
        int size,i;
        //int [] array= new int[];
        System.out.println("Please enter the size of the array");
        Scanner newReader = new Scanner(System.in) ;
        size=newReader.nextInt();

        int [] array= new int[size];
        System.out.println("Please enter the elements of the array");
        for (i=0;i<size;i++)
        {
            array[i]=newReader.nextInt();
        }

        System.out.println(Arrays.toString(array));

        //method call to find the shortest sub array in an array to

    }

    public int findSubArray(int[]array){

        int subArrayStartIndex,i,j, startPosition, endPosition, subArrayLength;




        return 2;
    }

}
