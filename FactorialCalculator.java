import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
               
        int i = 1, number;
        
        int fact = 1;
        
        System.out.println("<------ Factorial Calculator ------>");
     
        while(i < 3){
            
            System.out.print("Enter a positive integer: ");
            number = input.nextInt();
         
            if(number > 0){
           
                System.out.print(number + "!" + " = ");
                
                for(i=1;i<=number;i++){
                    
                    fact = fact*i;
               
                    String str = "x";
                    
                  if(i == number){
                 
                    str = "";   
                    
                }
                  System.out.print(i + str);
               
                }
                  System.out.println("\nThe factorial of a " + number + " is: " + fact);
                  
            }else{
                
                System.out.println("Invalid Input!");
                break;
                  
            }
   
        }
       
    }
  
  } 