

/*   *    
   ***   
  *****  
 ******* 
*********
 ******* 
  *****  
   ***   
    *   
*/

public class Diamond {
  
	int length =9;
	String[] s = new String[length];
	
	public void m1(){
		
		int lowerIndex = (length/2);
		int upperIndex = (length/2);
		
		
		for(int upperPartRow =0;upperPartRow<length;upperPartRow++){
			
			while(lowerIndex!=-1){
				
				for(int indexToFillAllWithSpace=0;indexToFillAllWithSpace<length;indexToFillAllWithSpace++){
					s[indexToFillAllWithSpace]=" ";
				}
				
				for(int column =lowerIndex; column<=upperIndex;column++){
						s[column]="*";}
				
				lowerIndex--;
				upperIndex++;
				for(int i=0;i<length;i++){
					System.out.print(s[i]);
				}
				System.out.println();}
				
		
		}
		lowerIndex=lowerIndex+2;
		upperIndex=upperIndex-2;
		for(int lowerPartRow =0;lowerPartRow<length;lowerPartRow++){
			
			while(lowerIndex<=upperIndex){
				
				for(int indexToFillAllWithSpace=0;indexToFillAllWithSpace<length;indexToFillAllWithSpace++){
					s[indexToFillAllWithSpace]=" ";
				}
				
				for(int column =lowerIndex; column<=upperIndex;column++){
						s[column]="*";}
				
				lowerIndex++;
				upperIndex--;
				for(int i=0;i<length;i++){
					System.out.print(s[i]);
				}
				System.out.println();}
				
		
		}
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new Diamond().m1();
	}

}
