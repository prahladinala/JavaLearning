public class Variables {
    public static void main(String[] args){
//        main() => is the functions
//                  this function is the main entry point in the program
//                  we can have only one main function in one module(one file)
//        The things we write inside () are called arguments
//        sout + tab = System.out.println("");
        System.out.println("Variables");
//        What is Variables ?
//        It is a holder/ container. Where we can store what ever we want
//        Example in a Game: Your High Score is a variable| Your Points| Your Life
//        Example in a Banking Application: How much money you have in your account
//        .
//        INTEGERS
//        int => Integer
//        Syntax: int integer_name = integer_value
//        Declaring variable in single line.
        int marioScore = 200;
//        Declaring variable in two line.
//        int marioLife;
//        marioLife = 5;
        int lifeUps = 50;
        lifeUps = 5;
        int finalMarioScore = marioScore * lifeUps;
//        System.out.println("finalMarioScore"); it is a string not a variable name
        System.out.println(finalMarioScore);

    }
}
