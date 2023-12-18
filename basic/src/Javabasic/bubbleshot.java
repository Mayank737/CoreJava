package Javabasic;

public class bubbleshot {

	 public static void main(String[] args) {
//		int arr[] = {12,98,16,8,18,99};
//		int temp;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length-1; j++) {
//				
//				if(arr[j+1]<arr[j]) {
//					temp =arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//	for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+ " ");
//		}
	
	    int arr[]= {12,4,32,56,87,98,1,48};
	    int temp;
	    for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j+1]<arr[j]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}  
		} for (int i = 0; i < arr.length; i++) {
			  System.out.print(arr[i]+" ");
		}
	 
	 }
}
