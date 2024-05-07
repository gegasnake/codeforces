import java.util.Scanner;

public class Stone_Game {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int max=0,min=n+1;
            int max_index=0,min_index=0;
            for(int i=0;i<n;i++){
                int a=input.nextInt();
                if(a>max){
                    max=a;
                    max_index=i;
                }
                if(a<min){
                    min=a;
                    min_index=i;
                }
            }
            int s=Math.min(max_index, min_index)+1;
            int p=n-Math.max(max_index, min_index);
            int r=Math.abs(max_index-min_index);
            System.out.println(Math.min(s+r, Math.min(p+r, p+s)));
        }
        input.close();
    }
}