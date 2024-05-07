import java.util.Scanner;

 class Stair_Peak_Or_Neither {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         short t = scanner.nextShort();
         for (short i = 0; i < t; i++) {
             byte a = scanner.nextByte(), b = scanner.nextByte(), c = scanner.nextByte();
             if (a < b  && b < c){
                 System.out.println("STAIR");
             }else if(a < b && b > c){
                 System.out.println("PEAK");
             }else{
                 System.out.println("NONE");
             }
         }
     }
}
