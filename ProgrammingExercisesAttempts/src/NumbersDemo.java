public class NumbersDemo {

    //Declare main method holding two variables (int)
    public static void main(String[] args) {
        int numOne;
        int numTwo;
        numOne = 9;
        numTwo = 4;

        //variable check
        System.out.println("First number is: " + numOne);
        System.out.println("Second Number is: " + numTwo);

        //pass value into methods
        displayTwiceTheNumber(numOne);
        displayTwiceTheNumber(numTwo);

        //break up each method
        System.out.println("--Next Method--");

        displayNumberPlusFive(numOne);
        displayNumberPlusFive(numTwo);

        System.out.println("--Next Method--");
//        displayNumberSquared(numOne);
//        displayNumberSquared(numTwo);

        System.out.println("--Finish--");
    }

    //variable at the end is different from the name of the value passed in

    //Displaying a variable twice
    public static void displayTwiceTheNumber(int result)
    {
        System.out.println(result);
        System.out.println(result);
    }

    //Displaying a number added to 5
    public static void displayNumberPlusFive(int result)
    {
        int adder;
        int newResult;
        adder = 5;
        System.out.println(result + " + 5 equals:");

        //Could probably just use 5 as well
        newResult = result + adder;
        System.out.println(newResult);
    }

    //squaring given number
    public static void displayNumberSquared(int result)
    {

    }
}
