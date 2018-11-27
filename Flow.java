import java.util.*;
public class Flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        One number = new One();
        System.out.print("Welcome back, my Master <3\n Your Number: ");
        int N = sc.nextInt();
        System.out.print("Result: ");
        for(int i = 1; i <= N; i++)
        {
            System.out.print((number.order(i) + " "));
        }
    }

}

class One{
    public static int order(int n){
        if(n==1)
        {
            return 1;
        }
        else
            return order(n-1)+1;
    }
}
