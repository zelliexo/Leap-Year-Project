//kate m
//cs1
import java.util.Scanner;

class exercise2 {
  public static void main(String[] args) {
    int inputYear;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter a year: ");
    inputYear = keyboard.nextInt();

    boolean flag = true;

    if (inputYear % 4 != 0 ){
      flag = false;
    }
      else if(inputYear % 100 != 0){
        flag = true;
      }
      else if(inputYear % 400 != 0){
        flag = false;
      }
    else{
      flag = true;
    }

      if(flag)
        System.out.print(inputYear+ " is a leap year.");
      else
        System.out.print(inputYear+ " is not a leap year.");

    keyboard.close();
  }
}
