
public class SearchAlgorithms {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] test2 = {0, 4, 5, 6, 12, 15, 17, 23, 29};
		
		System.out.println(binSearch(test1, 3)); //2
		System.out.println(linSearch(test1, 3)); //2
		
		System.out.println(binSearch(test2, 23)); //7
		System.out.println(linSearch(test2, 23)); //7
		
		System.out.println(binSearch(test2, 25)); //-1
		System.out.println(linSearch(test2, 25)); //-1
		
		System.out.println(binSearch(test1, 10)); //9
		System.out.println(linSearch(test1, 1)); //0
		 
		System.out.println(binSearch(test1, 1)); //0

	}

	public static int linSearch(int[] test, int query) 
	{
		for(int i = 0; i < test.length; i++)
		{
			if(test[i] == query)
			{
				return i;
			}
		}
		return -1;
	}

	public static int binSearch(int[] test, int query) 
	{
		int L = 0;
		int R = test.length - 1;
		while(L <= R)
		{
			int mid = L + (R - L)/2;
			if(test[mid] > query)
			{
				L = mid;
			}
			if (test[mid] < query)
			{
				R = mid;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
	
}

