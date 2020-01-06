package com.bridgelabz.program;

public class OccurenceCountOfNo{

	public static void main(String[] args) {

		int[] arr	=	{1,1,1,2,2,2,3,3,3,4,4};
		
		//int[] temp= new int[arr.length];
		
		
		
		for(int i = 0;i<arr.length;i++) {
			
			int count = 0;
			
			for(int j=0; j<arr.length;j++) {
			
			if(arr[i]==arr[j] && j<i) {
				
				break;
				
			}
			
			if(arr[i]==arr[j]) {
				
				
				count++;
			}
			
			}		
						

		
		if(count!=0)
		{
			
		System.out.println(arr[i]+"   "+count);
			
			
			
		}
	}

}
}
