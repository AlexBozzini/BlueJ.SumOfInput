/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Sum {

    public static void main(String[] args){
        int x, i = 1;
        int sum = 0;
        System.out.println("Input a number");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        
        while(i <= x)
        {
           sum = sum +i;
           i++;
        
        

    }
    System.out.println("Sum of "+x+" numbers is: "+sum);
}
}
