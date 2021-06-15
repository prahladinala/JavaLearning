public class Assignment {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 5;
//      int number3 = 10;
        int number3 = number1;
        System.out.println(number3); //10
        number3 = number3 + number2;
        System.out.println(number3); //15 ie; 10+5

        number3 += number2;
        System.out.println(number3); //20 ie; 15+5

        number3 -= number2;
        System.out.println(number3); //15 ie; 20-5

        number3 *= number2;
        System.out.println(number3); //75 ie; 15*5

        number3 /= number2;
        System.out.println(number3); //15 ie; 75/5

        number3 %= number2;
        System.out.println(number3); //0 ie; 15%5

//        ORACLE DOCS
//        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
    }
}
