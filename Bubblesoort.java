package geekster_java_practice_session;

public class Bubblesoort {
public static void main(String[] args) {
		
		int[] a = {2,6,8,5,4,3};
		boolean flag = false;
		for(int i = 0; i < a.length-(i+1); i++)
		{
			for(int j = 0; j < a.length-(i+1); j++)
			{
				if(a[j] > a[j+1])
				{
					swap(a,j,j+1);
					flag = true;
				}
			}
			if(flag == false)
			{
				break;
			}
		}
		printArray(a);
	}
	public static void swap(int[] a, int x, int y)
	{
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	public static void printArray(int[] a)
	{
		for(int i : a)
		{
			System.out.print(i+" ");

}
	}
}
