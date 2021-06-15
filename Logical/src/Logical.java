public class Logical {
    public static void main(String[] args){
        boolean hasAccount = true;
        boolean isLoggedIn = false;
        boolean hasPaid = false;

//        Checking to Conditions at a time = Logical Operations
//        Scenario: A Course platform  => Assign a course Assignment
//        If the student hasAccount and isLoggedIn and hasPaid.
//        && => returns true if all conditions are true
//        System.out.println(hasAccount && isLoggedIn); //false
        System.out.println(hasAccount && isLoggedIn && hasPaid);//false

        boolean fbLogin = true;
        boolean googleLogin = false;
        boolean emailLogin = false;
//        Scenario: A Course platform  => create Account
//        if any one of the way Login with FB or Login with Google or with Email = Create Account
//        || => returns true if any condition is true
        System.out.println(fbLogin || googleLogin || emailLogin);//true

//         ! => Not Operator => true to false OR false to true
        System.out.println(!emailLogin);
    }
}
