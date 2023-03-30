public class Strongno {
  public static void main(String[] args) {
    for(int i=1;i<1000;i++) {
			checkNumber(i);
		}
  }
    static int fact(int number)   
    {   
        int f = 1;   
        while (number != 0) {   
            f = f * number;   
            number--;   
        }   
        return f; 
    }   
  static void checkNumber(int number)   
    { 
      int sum = 0;     
        int tempno = number;      
         while (tempno != 0) {   
            
            sum = sum + fact(tempno % 10);        
            tempno = tempno / 10;   
        }   
  
        if(sum == number)  
            System.out.println(number + " is a Strong number");   
    }  

}
