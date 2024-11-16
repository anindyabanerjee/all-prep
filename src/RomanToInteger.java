import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class RomanToInteger {


    public static void main(String[] args) {
        LinkedHashMap <String,Integer>reference=new LinkedHashMap<>();

        reference.put("I",1);
        reference.put("V",5);
        reference.put("X",10);
        reference.put("L",50);
        reference.put("C",100);
        reference.put("D",500);
        reference.put("M",1000);

        System.out.println("Please enter the roman number");
        Scanner newReader = new Scanner(System.in) ;
        String romanNumber=newReader.nextLine();
       // ArrayList <Character> romanNumberArray= Arrays.asList(romanNumber.toCharArray());
    }
}
