import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num10 = new int[10];

        num10[9] = 34;
        num10[0]=1;
        num10[1]=2;


        System.out.println(num10[9]);

        for(int i=0; i<10; i+=2){
            System.out.println(num10[i]);
        }


    }
}
