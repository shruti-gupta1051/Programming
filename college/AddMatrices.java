import java.util.*;
class AddMatrices
{
public static void main(String...k)
{
int mat1[][],mat2[][],mat3[][];
int rows,cols;
Scanner sc=new Scanner(System.in);
System.out.println("enter tha no. of rows");
rows=sc.nextInt();
System.out.println("enter the no. of column");
cols=sc.nextInt();
mat1=new int[rows][cols];
mat2=new int[rows][cols];
mat3=new int[rows][cols];
System.out.println("enter the elements of mat 1");
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
mat1[i][j]=sc.nextInt();
}
}
System.out.println("enter the elements of mat2");
for(int i=0;i<rows;i++)
{
for( int j=0;j<cols;j++)
{
mat2[i][j]=sc.nextInt();
}
}
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
mat3[i][j]=mat1[i][j]+mat2[i][j];
}
}
System.out.println("Sum is:");
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
System.out.println(mat3[i][j]);
}
System.out.println();
}
}
}