package com.bridgelabz.program;

public class SelectionSort {
	
	  void selectionSort(int arr[]) {
		  
		  int l	=	arr.length;
		 // int min=0;
		  
		  
		    for(int i=0;i<l-1;i++)
		    {
		    	
		    	int min	=	i;
		    	
		    	  for(int j=i+1;j<l;j++)
		    	  {
		    		  
		    		  if(arr[j]<arr[min]) {
		    			  
		    			  min	=j;
		    			  
		    		  }
		    			  
		    			  int temp	=	arr[min];
		    			  arr[min]	=	arr[i];
		    			  arr[i]	=	temp;
		    					  
		    		
		    		  
		    	  }
		    }
		  
		  
	  }
	  
	  void printArr(int arr[]) {
		  
		  for(int i=0;i<arr.length;i++) {
			  
			  System.out.print(arr[i]+" ");
		  }
	  }
	
	

	public static void main(String[] args) {
		
		SelectionSort obj	=	new SelectionSort();
		
		int arr1[]	=	{56,78,31,10};
		
		obj.selectionSort(arr1);
		obj.printArr(arr1);
		obj.selectionSort(arr1);
		

	}

}
