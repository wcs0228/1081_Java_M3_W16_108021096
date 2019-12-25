import java.util.Scanner;
public class M3Q6plus {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long val =scn.nextLong();
        String str ="";
        while (val >0)
        {
            str=Long.toString(val%10)+" "+str;
            val/=10;
        }
        System.out.println(str);

    }
}
