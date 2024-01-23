import java.util.Scanner;
public class Vasya_The_Hipster {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte red = scanner.nextByte();
        byte blue = scanner.nextByte();
        if (red == blue){
            System.out.print(red + " ");
            System.out.print(0);
        }else if(red < blue && blue + red > 1){
            System.out.print(red + " ");
            System.out.print((blue - red) / 2);
        }else if (blue < red && blue + red > 1){
            System.out.print(blue + " ");
            System.out.print((red - blue) / 2);
        }else{
            System.out.print(0 + " ");
            System.out.println(0);
        }
    }
}
