public class Relational {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 15;
        int number3 = 10;

//        == Equal to
        System.out.println(number1 == number2); //false
        System.out.println(number1 == number3); //true

//        != Not Equal to
        System.out.println(number1 != number2); //true
        System.out.println(number1 != number3); //false

//        > Greater than
        System.out.println(number1 > number2); //false

//        < Lesser than
        System.out.println(number1 < number2); //true

//        >= Greater than equal to
        System.out.println(number1 >= number2); //false

//        <= Lesser than equal to
        System.out.println(number1 <= number2); //true
    }
}
