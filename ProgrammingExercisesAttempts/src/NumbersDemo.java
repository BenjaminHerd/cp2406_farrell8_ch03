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

//        displayNumberPlusFive(numOne);
//        displayNumberPlusFive(numTwo);
//
//        displayNumberSquared(numOne);
//        displayNumberSquared(numTwo);
    }

    public static void displayTwiceTheNumber(int result)
    {
        System.out.println(result);
        System.out.println(result);
    }

    public static void displayNumberPlusFive()
    {

    }

    public static void displayNumberSquared()
    {

    }
}
