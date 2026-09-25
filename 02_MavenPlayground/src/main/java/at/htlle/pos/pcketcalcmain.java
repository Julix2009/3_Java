package at.htlle.pos;

public class pcketcalcmain {
    static void main(){
         long result = pocketCalculator.addition(1,2);
         long expectet = 3;
         String testresult;
         if(result==expectet) testresult = "ok";
         else testresult = "failed";
        System.out.printf("Pocketcalculator.addition(1,2) expectet result = 3 , actural =%d, test result: %s",result,testresult);//3
        // cases skipped;
        // result 0;
        //0,0;

        System.out.println("----/n");
        //aString testresult;ddilong result = pocketCalculator.addition(1,2);tion with overflow
        result = pocketCalculator.addition(Integer.MAX_VALUE,1);
        expectet = 2147483648L;
        if(result==expectet) testresult = "ok";
        else testresult = "failed";

        System.out.printf("Pocketcalculator.addition(1,2) expectet result = 2147483648L  , actural =%d, test result: %s",result,testresult);

        System.out.println("----/n");
        System.out.println("Adding negative numbers");
        // -1 , 3 --> positive result
        //1, -2 --> negative results
        // 1 , -2 --> negative result
        // -2 , 4 --> neg. result
        // 1 , -1 --> 0
        //underflow
        //Interger.Min_VALUE, -1

        System.out.println("---/n");

        expectet = 1;
        result = pocketCalculator.addition(-1, 2);

        if(result==expectet) testresult = "ok";
        else testresult = "failed";

        System.out.printf("Pocketcalculator.addition(-1,2) expectet result = 1   , actural =%d, test result: %s",result,testresult);

        System.out.println("---- /n");

        expectet = 0;
        result = pocketCalculator.addition(1, -1);

        if(result==expectet) testresult = "ok";
        else testresult = "failed";

        System.out.printf("Pocketcalculator.addition(1,-1) expectet result = 1   , actural =%d, test result: %s",result,testresult);










    }
}
