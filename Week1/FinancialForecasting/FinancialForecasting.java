package Week1.FinancialForecasting;
public class FinancialForecasting {
   public static double predict(int currVal, int time) {
       if (time == 0) {
           return currVal;
       }
       return predict(currVal*4+time, time-1);
   }
   public static void main(String[] args) {
       int currVal = 500;
       int time = 3;
       double futureValue = predict(currVal, time);
       System.out.printf("Predicted value after %d years: %f", time, futureValue);
   }
}