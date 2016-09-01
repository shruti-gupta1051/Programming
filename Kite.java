import java.util.*;
public class Kite
{
    public static void main(String args[])
    {
        System.out.print("Enter no of rows ");
        Scanner sc = new Scanner(System.in);
                int num=sc.nextInt();
                for(int i=1;i<=num;i++)
                {
                    for(int j=num;j>=i;j--)
                    {
                        System.out.print(" ");
                    }
                   for(int k=1;k<=i;k++)
                    {
                       System.out.print(" *"); 
                    }
                     System.out.println();
                }     
                 for(int i=1;i<=num;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(" ");
                    }
                   for(int k=num;k>=i;k--)
                    {
                       System.out.print(" *"); 
                    }
                     System.out.println();
                }
                     for(int i=1;i<=(num-2);i++)
                {
                    for(int j=num;j>=i;j--)
                    {
                        System.out.print(" ");
                    }
                   for(int k=1;k<=i;k++)
                    {
                       System.out.print(" *"); 
                    }
                     System.out.println();
                }  				
    }
    
}

