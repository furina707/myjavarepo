//3×4 矩阵的加法和减法计算器。
import java.util.Random;
public class MatrixCalculator {
	public static void main(String args[])
	{
		int a[][]=new int[3][4],b[][]=new int[3][4];
		int result[][]=new int[3][4];
		getElements(a);
		getElements(b);
		compute(a,b,result,'+');
		print(a,b,result,'+');
		compute(a,b,result,'-');
		print(a,b,result,'-');
	}
	private static void getElements(int x[][])
	{
		Random rand=new Random();
		for(int i=0;i<x.length;i++)
			for(int j=0;j<x[i].length;j++)
				x[i][j]=rand.nextInt(100);
	}
	private static void compute(int a[][],int b[][],int result[][],char oper)
	{
	for(int i=0;i<result.length;i++)	
		for(int j=0;j<result[i].length;j++)
			result[i][j]=oper=='+'?a[i][j]+b[i][j]:a[i][j]-b[i][j];
	}
	private static void print(int a[][],int b[][],int result[][],char oper)
	{
	int i;	

	for( i=0;i<result.length;i++)
	{
		for(int x:a[i])
			System.out.printf("%3d", x);
		System.out.printf("%3c", oper);
		//for(j=0;j<b[i].length;j++)
		for(int x:b[i])
			System.out.printf("%3d", x);
		System.out.printf("%3s","=");
		for(int x:result[i])
			System.out.printf("%4d",x);
		System.out.println();
		
	}
	System.out.println();
	}
}