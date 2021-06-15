public class IfElse {
    public static void main(String[] args){
        int temp = 35;
//        IF ELSE
//        if(temp < 30){
//            System.out.println("Temp is less than 30");
//            System.out.println("Its Cool..!");
//        }else{
//            System.out.println("Temp is Hot");
//        }

//        IF IF
//        if(temp < 30){
//            System.out.println("Temp is less than 30");
//            System.out.println("Its Cool..!");
//        }if(temp < 40){
//            System.out.println("Temp is less than 40");
//            System.out.println("Temp is Hot");
//        }if(temp < 50){
//            System.out.println("Temp is less than 50");
//            System.out.println("Temp is Hot");
//        } else {
//            System.out.println("Temp is more than 50");
//        }

//        IF IF With Logical Operations
        if(temp < 30 || temp < 40){
            System.out.println("Temp is less than 30");
            System.out.println("Its Cool..!");
        } else {
            System.out.println("Temp is more than 50");
        }

        if(true){
            System.out.println("If is true now");
        } else{
            System.out.println("Else");
        }
    }
}
