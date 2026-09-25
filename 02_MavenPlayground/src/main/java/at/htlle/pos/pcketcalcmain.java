package at.htlle.pos;

public class pcketcalcmain {
    static void main(){
         int result = pocketCalculator.addition(1,2);
         int expectet = 3;
         String testresult;
         if(result==expectet) testresult = "ok";
         else testresult = "failed";
        System.out.printf("Pocketcalculator.addition(1,2) expectet result = 3 , actural =%d, test result: %s",result,testresult);//3
        System.out.println(pocketCalculator.subtraction(1,2)); //-1
    }
}
