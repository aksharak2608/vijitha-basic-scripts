package coreJavaConcepts;

public class Arrayex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,4,5};
int[] b= new int[6];
String ip="you are very new to me";
String[] op= ip.split(" ");
for(String s:op)
System.out.println(s);






int c[][]=new int[3][2];
c[0][0]=6;
c[0][1]=3;
c[1][0]=3;
c[1][1]=3;
c[2][0]=3;
c[2][1]=6;
System.out.println(c.length);

for(int i=0;i<c.length;i++)
{
	System.out.println(c[i].length);
	for(int j=0;j<c[i].length;j++)
	{
		
	}
	
}
{
System.out.println(c);
}




int d[][]= {{1,2},{2,3,3,4},{2,3,7}};
for(int i=0;i<d.length;i++)
{
	//System.out.println(d[i].length);
	for(int j=0;j<d[i].length;j++)
	{
		System.out.print(" "+d[i][j]);
	}
	
	System.out.println();
}

System.out.println("length is "+a.length);

for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}


for(int temp:a)
{
	System.out.println(temp);
}


	}

}
