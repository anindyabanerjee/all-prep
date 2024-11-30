import java.util.Arrays;

public class LongestCommonPrefix {
        String [] stringArray=new String[10];

    public String longestCommonPrefixString(String [] argumentArray){

        StringBuilder resultString = new StringBuilder();
        Arrays.sort(argumentArray);
        String firstElement=argumentArray[0];
        String lastElement=argumentArray[argumentArray.length-1];

        int i;
        for (i=0;i<firstElement.length();i++){
            if((lastElement.length()>=i)&&(firstElement.charAt(i)!=lastElement.charAt(i))){
                break;
            }else{
            resultString.append(firstElement.charAt(i));
            }
        }
        return resultString.toString();
    }
}


