import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("b");
//        System.out.println(25468752);
//        int ans=Math.round(1.6F);
//        System.out.println(ans);
//        double rand=Math.random()*10002;
//        System.out.println(rand);

//        Scanner sc=new Scanner(System.in);
//        byte b=sc.nextByte();
//        System.out.println(b);
//        NumberFormat currency =NumberFormat.getPercentInstance();
//        NumberFormat.getPercentInstance().format(0.2);
//
//        String res= currency.format(0.2);
//        System.out.println(res);

        final int  MONTHS_IN_YEAR=12;
        final int PERCENTAGE=100;

        Scanner sc=new Scanner(System.in);

        System.out.print("Princi:");
        int principal=sc.nextInt();

        System.out.println("Months:");
        byte months=sc.nextByte();

        System.out.println("Intrest:");
        float intrest=sc.nextFloat();
        float monthlyIntrest=intrest/PERCENTAGE/MONTHS_IN_YEAR;

        float mortgage=(float)(principal*(monthlyIntrest)*Math.pow((1+monthlyIntrest),months))/
                (float)(Math.pow((1+monthlyIntrest),months)-1);
        String formatedMortgage=NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(formatedMortgage);
    }
}
