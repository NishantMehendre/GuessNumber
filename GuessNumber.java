import java.util.Scanner;
public class GuessNumber {
public void guessTheNumber(){
    Scanner sc=new Scanner(System.in);
    int n=(int)(Math.random()*1001);
    int i=3;
    int guess;
    //Receives three input from the user and checks if they match with the random number generated
    //Gives hint to user based on whether the guess was higher or lower than the random number generated
    //Continues till the number is guessed or user has no more attempts left
    while(i>0){
        System.out.println("Guess the number");
        guess=sc.nextInt();
        if(guess<0||guess>1000)
        System.out.println("invalid input\nThe number is between 0 and 1000(included)");
        else if(n>guess)
        System.out.println("The number is greater than "+guess);
        else if(n<guess)
        System.out.println("The number is less than "+guess);
        else{
            System.out.println("You have guessed the number!!!");
            break;
        }
        i--;
    }
    //Checks if the user failed to guess the random number generated in the given number of attempts
    if(i==0){
    System.out.println("Failed to guess the number in given number of tries\nThe number was "+n);
    sc.close();
    }
}
}
class Driver{
    public static void main(String[] args) {
        GuessNumber ob=new GuessNumber();
        ob.guessTheNumber();
    }
}