public class Switch {
    public static void main(String[] args){
        int star = 4;
        switch(star){
            case 1 :
                System.out.println("Rating is 1");
                break;
            case 2 :
                System.out.println("Rating is 2");
                break;
            case 3 :
                System.out.println("Rating is 3");
                break;
            case 4 :
                System.out.println("Rating is 4");
                break;
            case 5 :
                System.out.println("Rating is 5");
                break;
            default:
                System.out.println("Ratings can be only from 1 to 5");
        }


//        SWITCH AND CASE WITHOUT BREAK : ISSUE
//        switch(star){
//            case 1 :
//                System.out.println("Rating is 1");
//            case 2 :
//                System.out.println("Rating is 2");
//            case 3 :
//                System.out.println("Rating is 3");
//            case 4 :
//                System.out.println("Rating is 4");
//            case 5 :
//                System.out.println("Rating is 5");
//            default:
//                System.out.println("Ratings can be only from 1 to 5");
//        }

//        EXPECTED OUTPUT: Rating is 4
//        ACTUAL OUTPUT: Rating is 4
//                       Rating is 5
//                       Ratings can be only from 1 to 5
    }
}
