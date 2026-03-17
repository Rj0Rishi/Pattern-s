import java.util.Scanner;
class diamond{
    public diamond(){
        System.out.print("Enter a number:");
        Scanner setValue=new Scanner(System.in);
        int getValue=setValue.nextInt();
        for(int i=1;i<=getValue;i++){
            for(int j=i;j<getValue;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i=getValue;i>0;i--){
            for(int j=i;j<=getValue;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-3);k++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond d=new diamond();
    }
}