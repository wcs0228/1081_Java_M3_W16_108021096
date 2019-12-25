import java.util.Scanner;
public class M3Q8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str[] = scn.nextLine().split(" ");
        int data[] = new int[str.length];
        for (int i = 0; i < str.length; i++)
        {
            data[i]=Integer.parseInt(str[i]);
        }

        fun(data);

    }
    public static void fun(int data1[]){
        for(int i =0;i<data1.length;i++)
        {
            System.out.print(data1[i]*data1[i]+"\t");
        }
        System.out.println();
    }

}
