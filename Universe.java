import java.io.*;
import java.util.*;
class Universe
{
public static void main(String[]args)
{
int l=1,i,sum=1,sum1=1;
String str="";
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(l<=t)
{
int n=sc.nextInt();
int m=sc.nextInt();
int [] arr=new int[n];//yudistra
int [] arr1=new int[m];//duryodna
for(i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<arr1.length;i++)
{
arr1[i]=sc.nextInt();
}
for(i=0;i<arr.length;i++)
{
sum=sum+arr[i];
}
for(i=0;i<arr1.length;i++)
{
sum1=sum1+arr1[i];
}
if(sum>sum1)
{
str=str.concat("yudistra\n");
}
else if(sum1>sum)
{
str=str.concat("duryodna\n");
}
if(sum==sum1)
{
str=str.concat("draw\n");
}
sum=0;
sum1=0;
l++;
}
System.out.println(str);
}
}
