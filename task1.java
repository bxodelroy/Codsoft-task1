import java.util.Scanner;
import java.util.Random;
class NumberGame{
    public static void main(String[] args){
        Random sc= new Random();
        int rand= sc.nextInt(100);
        Scanner in= new Scanner(System.in);
        System.out.println("Take a guess of the random number within 100: ");
        int n= in.nextInt();
        
        
       
        int i=1;
        if(n==rand){
            System.out.println("RIGHT ANSWER");
        }
        else{
            System.out.println("Wrong Answer....TRY AGAIN ");
             if(n>rand){
            System.out.println("[Hint: your number is Higher]");
            }
            else{
            System.out.println("[Hint: your number is Lower]");
            }
            while(i<3){
             System.out.println("Take a guess of the random number: ");
                int a= in.nextInt();   
            if(a==rand){
            System.out.println("RIGHT ANSWER");
            }
            else{
            System.out.println("Wrong Answer....TRY AGAIN ");
                if(a>rand){
            System.out.println("[Hint: your number is Higher]");
            }
            else{
            System.out.println("[Hint: your number is Lower]");
            }
                }
                i++;
            }
        }
        
        System.out.println("Take the LAST guess of the random number: ");
        int b= in.nextInt();
        if(b==rand){
            System.out.println("RIGHT ANSWER");
        }
        else{
            System.out.println("Wrong Answer....NO MORE CHANCES LEFT");
            }
        
        System.out.println("The Random guess was: " +rand);

        

    }
}