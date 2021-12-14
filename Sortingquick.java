package geekster_java_practice_session;

public class Sortingquick {
public static void main(String[] args) {
		
		int[] a = {7,8,3,2,5,1,6,4};
		sort(a, 0, a.length-1);
		for(int i : a)
		{
			System.out.print(i+" ");
		}
		
	}
	public static void sort(int[] a, int start, int end)
	{
		if(start < end)
		{
			int mid = start+(end-start)/2;
			
			sort(a, start, mid);
			sort(a, mid+1, end);
			
			merge(a,start,mid,end);
		}
	}
	public static void merge(int[] a, int start, int mid, int end) //2436
	{
		int n1 = mid-start+1;
		int n2 = end-mid;
		
		int a1[] = new int[n1];
		int a2[] = new int[n2];
		
		for(int i = 0; i < n1; i++)
		{
			a1[i] = a[start+i];
		}
		for(int j = 0; j < n2; j++)
		{
			a2[j] = a[mid+1+j];
		}
		
		int i = 0, j = 0;
		
		int k = start;
		while(i < n1 && j < n2)
		{
			if(a1[i] < a2[j])
			{
				a[k] = a1[i];
				i++;
			}
			else
			{
				a[k] = a2[j];
				j++;
			}
			k++;
		}
		while(i < n1)
		{
			a[k] = a1[i];
			i++;
			k++;
		}
		while(j < n2)
		{
			a[k] = a2[j];
			j++;
			k++;
		}
	}

}
