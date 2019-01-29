import java.util.Scanner;
public class NewSorting {

    public static void main(String[] args) 
    {
        int num, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < num; i++) 
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) 
        {
            for (int j = i + 1; j < num; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print(" Order:");
        for (int i = 0; i < num - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[num - 1]);
    }
}
