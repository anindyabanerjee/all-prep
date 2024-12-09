import java.util.*;

public class RomanToInteger {


    public static void main(String[] args) {
        LinkedHashMap <Character,Integer>reference=new LinkedHashMap<>();

        reference.put('I',1);
        reference.put('V',5);
        reference.put('X',10);
        reference.put('L',50);
        reference.put('C',100);
        reference.put('D',500);
        reference.put('M',1000);


        System.out.println("Please enter the roman number");
        Scanner newReader = new Scanner(System.in) ;
        String romanNumber=newReader.nextLine().toUpperCase();
       // ArrayList <Character> romanNumberArray= Arrays.asList(romanNumber.toCharArray());

        System.out.println("The integer value is "+ convertToInteger(romanNumber,reference) );
    }
    // 1.give meaning to the method name e.g convertRomanNumeralsToInteger
    // 2.Before
    // 3.make readability of inside for and if conditions more readable
    public static int convertToInteger(String romanNumber, Map<Character,Integer> referenceValues){
        int ii,number=0;
        //iterating till the end of the string
            for(int i=0;i<romanNumber.length();i++){
                //comparing of the value of the present character is greater than the subsequent number. if so then just subtract from the subsequent value and
                // skip the next element
                //else just keep adding the corresponding values from the string
                if( i+1 <romanNumber.length() && (referenceValues.get(romanNumber.charAt(i)) < referenceValues.get(romanNumber.charAt(i+1))) ){
                    number+=referenceValues.get(romanNumber.charAt(i+1))-referenceValues.get(romanNumber.charAt(i));
                i++;
                }else {
                    number+=referenceValues.get(romanNumber.charAt(i));
                }
        }
        return number;
    }
}
