package com.bridgelabz.program;

public class OccurenceOfNoInArray {


public static void main(String[] args) {

double[] a= {1.1,2.1,2.3,2.4,1.1,2.3,3.4,2.4};
double arr[][]= new double[5][2];
double arr1[]=new double[10];
boolean[] visited=new boolean[a.length];
int i,j;
int z=0;


for(i=0;i<a.length;i++)
{
int count=1;
if(visited[i]==true)
{
continue;
}
for(j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
visited[j]=true;
count=count+1;
}
}
//System.out.println(a[i]+"   "+count);

if(z<arr1.length)
{
arr1[z]=a[i];
z++;
arr1[z]=count;
z++;
}
}

z=0;
for(int k=0;k<5;k++)
{
for(int l=0;l<2;l++)
{
arr[k][l]=arr1[z];
z++;
}
}
for(int x=0;x<5;x++)
{
for(int y=0;y<2;y++)
{
System.out.print(arr[x][y]+" ");
}
System.out.println();
}
}
}

