
public class Array {
	
	public static void main(String[] args) {      
        
        //Initialize array   
        int [] arr = new int [] {8, 2, 5, 1};   
        int temp = 0;  
          
        //Displaying elements of original array  
        System.out.println("Elements of original array: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");
        
        //for(int item:arr)
        	//System.out.println(item);
        
        	
        }
        
        //Sort the array in ascending order  
        for (int i = 0; i < arr.length; i++) { 
        	System.out.println( " " + i);
            for (int j = i+1; j < arr.length; j++) {   
               if(arr[i] > arr[j]) {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }   
            }   
        }  
        
        System.out.println();  
          
        //Displaying elements of array after sorting  
        System.out.println("Elements of array sorted in ascending order: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");  
        }  
   
        
        } }
	
	
	


