
import java.util.*;
 
class StringTokenizerDemo {
    public static void main(String args[]) {
        int number;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers with commas in between the numbers:");
        String s = input.nextLine();
        StringTokenizer st = new StringTokenizer(s, ",");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            number = Integer.parseInt(temp);
            System.out.println(number);
            sum = sum + number;
        }
        System.out.println("sum of the integers is: " + sum);
        input.close();
    }
}