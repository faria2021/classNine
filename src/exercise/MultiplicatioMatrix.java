package exercise;

public class MultiplicatioMatrix {

	public static void main(String[] args) {
		//4X4
		
//		System.out.print(1  + "   ");
//		System.out.print(2  + "   ");
//		System.out.print(3  + "   ");
//		
//		System.out.print(4  + "   ");
//		
		int n =10;
		
//		for(int i=1; i<=n; i++){      
//			
//			System.out.print(i  + "   ");// this kind of for loop take care of the horizental part mean it print horizentaly
//			
//			//System.out.println(i  + "   ");//by using ln it will go verticaly.print ln will print verticaly and print will print horizentaly.
//		
//		
//		}
//       for(int i=1; i<=n; i++){      
//			
//			//System.out.print(i  + "   ");// this kind of for loop take care of the horizental part mean it print horizentaly
//			
//			System.out.println(i  + "   ");//by using ln it will go verticaly.print ln will print verticaly and print will print horizentaly.
//		
//		
//		}
       
       for(int i=1; i<=n; i++){  
    	   
    	   for(int j=1; j<=n; j++){      
    		  
    		   //System.out.print(i  + "   ");
   			
    		  // System.out.print(i*j  + "   ");
    		   
    		 //  System.out.print(i*j  + "\n");
    		   
    		  // System.out.print(i*j  + "\"");//for special charater to print in java you have to put \ infront of it.like exeample"\"".so \"this two are value and ""this is the out side cotation
   	
    		    System.out.print(i*j  + " \t  ");//this t mean tab,so gap will be same within.before special character you have to put \.everytime.
   		
    		  //  System.out.print(i*j  + " \n  ");//this n means new line ,so its a special charector.
    	   
    	   }
			System.out.println(" ");
		}
      

	}

}
