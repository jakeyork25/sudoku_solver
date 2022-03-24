import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class index {

    public static List<String> ListifyRow(String str) {
        var row = new ArrayList<String>();
        for(var i = 0; i < 9; i++) {
            var digitChar = str.charAt(i);
            var digit = Character.toString(digitChar);
            row.add(digit);
        }       
        return row;
    }
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the top row: ");
        String firstRow = reader.next();
        System.out.println("Enter the second row: ");
        List<String> secondRow = ListifyRow(reader.next());
        System.out.println("Enter the third row: ");
        List<String> thirdRow = ListifyRow(reader.next());
        reader.close();
        String reversed = firstRow;
        String[] numArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayList<String> numList = new ArrayList<>(Arrays.asList(numArray));
       

        for(var i = 0; i < 9; i++) {
            var digitChar = firstRow.charAt(i);
            var digit = Character.toString(digitChar);
            if(digit.equals("0")) {
                for(String numStr : numList) {
                    if(!reversed.contains(numStr) && !secondRow.get(i).equals(numStr) && !thirdRow.get(i).equals(numStr)) {
                        digit = numStr;
                    }
                }
            }
            reversed = reversed.substring(0,i)+digit+reversed.substring(i + 1);
        }

        System.out.print("The sequence is " + reversed);
    }

    public static boolean IsInRow(List<String> list) {
        return true;
    }
}