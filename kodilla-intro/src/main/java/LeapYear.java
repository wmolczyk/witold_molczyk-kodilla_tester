public class LeapYear {public static void main(String[] args){
    int year = 2036;
    System.out.println(year);
            if (year%4 != 0){
                System.out.println("rok nie przestępny");
            }else if (year%100 != 0){
                System.out.println("rok przestępny");
            }else if (year%400 !=0){
                System.out.println("rok nie przestępny");
            }else {
                System.out.println("rok przestępny");
            }
}
}
