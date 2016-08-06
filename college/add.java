import java.util.*;
class add{
public static void main(String ...p){
Scanner sc= new Scanner(System.in);
int a[ ] [ ]=new int[3][3];
int b[ ] [ ]=new int[3][3];
int add[ ] [ ]=new int[3][3];
System.out.println("enter the numbers of matrix");
for(int i=0; i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
a[i][j]=sc.nextInt();
}}
System.out.println("enter the numbers of matrix");
for(int i=0; i<b.length;i++)
{
for(int j=0;j<b[i].length;j++)
{
b[i][j]=sc.nextInt();
}}
for(int i=0; i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{

add[i][j]=a[i][j]+b[i][j];
}}
for(int i=0; i<add.length;i++)
{
for(int j=0;j<add[i].length;j++)
{
System.out.print("\t"+ add[i][j]);
}System.out.println();}}}
