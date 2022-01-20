import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {

    char operator;
    double number1, number2, result=0;
    int flag = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("Choose an option");
    System.out.println("+ for Addition");
    System.out.println("- for Subtraction");
    System.out.println("* for Multiplication");
    System.out.println("/ for Division");
    System.out.print("Enter your choice ");
    operator = input.next().charAt(0);

    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();
	result=0;
    switch (operator) {

      // addition
      case '+':
        //by Saurabh
        break;

      // subtraction
      case '-':
        //by Snehadeep
        break;

      // multiplication
      case '*':
        //by Sai
	return(number1*number2);
        break;

      // division
      case '/':
        //by Naresh
        break;

      default:
	flag=1;
        System.out.println("Invalid operator!");
        break;
    }
	if(flag==0)
	System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    input.close();
  }
}