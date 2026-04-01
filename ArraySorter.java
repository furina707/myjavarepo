//固定大小的冒泡排序
import java.util.Random;
public class ArraySorter {
	public static void main(String args[])
	{
		int a[]=new int[10];
		getElements(a);
		print(a);
		sort(a);
		print(a);
	}
private static void sort (int a[])
{
	int i,j,t;
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length-1-i;j++)
			if(a[j]>a[j+1])
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
	}
}
private static void getElements(int a[])
{
	Random rand=new Random();
	for(int i=0;i<a.length;i++)
		a[i]=rand.nextInt(100);
	
	
}
private static void print(int a[]) 
{
	for(int i=0;i<a.length;i++)
		System.out.printf("%3d",a[i]);
	    System.out.println();
}
}