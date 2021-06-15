public class DataTypes {
    public static void main(String[] args){
        System.out.println("New Module");
//        byte => -128 to +127
//        short => -32768 to 32767
//        int => -2,147,483,648 to 2,147,483,647
//        long => -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float => Example: 234.5f (precision is : just a point after a decimal)
//        double => Example: 234.23
//        boolean => true or false
//        char => only one character 'A'
//        String.

        byte myByte = 127;
        System.out.println(myByte);

        int mInt = 7;
//        float mFloat = 7;
//        double mDouble = 7;
//        OR
//        float mFloat = 7f;
//        double mDouble = 7d;
//        OR
        float mFloat = 7.0f;
        double mDouble = 7.0;
        System.out.println("Int value is: " + mInt);
        System.out.println("Float value is: " + mFloat);
        System.out.println("Double value is: " + mDouble);


        int mDivInt = 22/7;
        float mDivFloat = 22/7f;
        double mDivDouble = 22/7d;

        System.out.println("22/7 in Int is: " + mDivInt);
        System.out.println("22/7 in Float is: " + mDivFloat);
        System.out.println("22/7 in Double is: " + mDivDouble);

        boolean isActive = false;
        System.out.println(isActive);

        char mChar = 'A'; //A unicode char 41
        System.out.println(mChar);

//        GET UNICODE VALUE
        char uChar = 'a'; //A unicode char 61
        String mValue = Integer.toHexString(uChar);
        System.out.println(mValue);
//      https://www.ssec.wisc.edu/~tomw/java/unicode.html
//      char mUniCode = '\u0041';
        char mUniCode = '\u0080';
        System.out.println(mUniCode);

//      Single quotes for char
//      Double quotes for String.
        String mString = "I am a String";
        System.out.println(mString);

//      String Concatenation
        System.out.println("The mString Value is : "+ mString);

        String fakeValue = "22.987";
        String fakeValue2 = "33.8";
        System.out.println(fakeValue + fakeValue2); // String + String
//        Expected Output: 56.787
//        Actual Output: 22.98733.8

        System.out.println(mInt + mFloat); // Int + Float

        // String + String = StringString
        System.out.println(mString + fakeValue2);
        // String + Space as String + String = String String
        System.out.println(mString +" "+ fakeValue2);

        System.out.printf(mString);
        System.out.println(mString);

//        System.out.printf(mString.toUpperCase());
//        Make All Characters Caps.
        System.out.println(mString.toUpperCase());
//        Make All Characters lower.
        System.out.println(mString.toLowerCase());


        String mSpaceString = "      More Space     ";
        System.out.println(mSpaceString.toUpperCase());
//        Remove Space from The String
        System.out.println(mSpaceString.trim());

//        ORACLE DOCS
//        https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
    }
}
