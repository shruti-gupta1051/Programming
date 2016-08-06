import java.util.*;
class Array
{
public static void main(String...k){
int a[][];
a=new int[3][];
a[0]=new int[4];
a[1]=new int[1];
a[2]=new int[3];
Scanner sc=new Scanner(System.in);
System.out.println("enter array element");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("array elements are=");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
System.out.print("\t"+a[i][j]);
}
System.out.println();
}
}
}