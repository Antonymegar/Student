import  java.util.Scanner;
import static java.lang.Math.pow;



public class CompoundInterest {
    public static void main(String[] args)
    {

        double amount=0,principle,rate,time,ci,t=1;



        Scanner sc=new Scanner(System.in);

        System.out.println("enter principle ");

        principle=sc.nextDouble();

        System.out.println("enter rate");

        rate=sc.nextDouble();

        System.out.println("enter time");

        time=sc.nextDouble();

        rate=(1+rate/100);

        for(int i=0;i<time;i++)
            t*=rate;
        System.out.println(t);

        amount=principle*t;

        System.out.println("amount="+amount);

        ci=amount-principle;

        System.out.println("compound interest="+ci);

    }
}
