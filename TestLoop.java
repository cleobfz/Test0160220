
public class TestLoop {

	public static void main(String args[])    {       
		int counter = 0;       
		outer: for(int i = 0; i < 3; i++)    {  
			System.out.println("außen");
			middle: for(int j = 0; j < 3; j++)  { 
				System.out.println("mitte");
				inner: for(int k = 0; k < 3; k++) { 
					System.out.println("innen");
//					if(k-j>0) break middle;                               
					counter++;                           
					}  
				counter++;
			 }
			counter++;
		}
		System.out.println(counter);    
		} 
	}
	
	
	

