public class Arithmetic {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 20;
        int number3 = 35;

//      Addition
        System.out.println(number1 + number2);
//      Subtraction
        System.out.println(number1 - number2);
//      Multiplication
        System.out.println(number1 * number2);
//      Division => How many time the number is dividable (but not the remainder)
        System.out.println(number1 / number2);
        System.out.println(number3 / number1);
//      Modulus => Remainder
        System.out.println(number1 % number2);
        System.out.println(number3 % number1);

//        number1 = number1 + 1;
//        number1++;
        // Postfix => First Use number1 and then add one to it
        System.out.println(number1++);
        System.out.println(number1);
        // Prefix => First Use add one to it and then use it(Before using the number1 add one to it)
        System.out.println(++number1);
    }
}
