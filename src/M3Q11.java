import java.util.Scanner;
public class M3Q11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n =scn.nextInt();
        int data [] =new int [n];
        for(int i =0;i<n;i++)
        {
            data[i] =scn.nextInt();
        }

        for(int i =0;i<data.length;i++)
        {
            int sum;
            sum=data[i];
            for(int j =i+1;j<data.length;j++)
            {
                sum=sum+data[j];
                if(sum ==0)
                {
                    for(int k =i;k<=j;k++)
                    {
                        System.out.print(data[k]+"\t");
                    }
                }
            }
        }
    }
}
