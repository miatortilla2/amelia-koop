import java.util.Scanner ; // import Scanner

//Retirement Planning - Java 3B
//Amelia Koop, Sp24

public class RetirementPlanner
{  
   public static void main(String[] args)
   {
      double begBalance ; // beginning balance
      double endBalance ; // ending balance
      double withdrawlAmt ; // yearly withdrawl amount
      double earnRate  ; // annual earning rate
      int yearAccumulator = 1 ; // start at year 1
      
      // create scanner object for user input
      Scanner keyboard = new Scanner(System.in);
      
      // ask user beginning balance
      System.out.println("What is the beginning balance?") ;
      begBalance = keyboard.nextDouble() ;
      
      // ask user for annual withdrawl
      System.out.println("What is the desired annual withdrawl?") ;
      withdrawlAmt = keyboard.nextDouble() ;
      
      // ask user for earning rate
      System.out.println("What is the annual earnings rate? (5=5%)") ;
      earnRate = keyboard.nextDouble() ;
      
      // print column headers
      System.out.println("Year\tBeg Balance\tWithdrawl\tEarnings\tEnd Bal") ;
      
      double yearlyEarnings ; // earnings for the year
      
      while (yearAccumulator <= 20) // repeat calculation 20 times
      {
         yearlyEarnings = ((begBalance - withdrawlAmt) * (earnRate / 100)) ; // calculate yearly earnings
         endBalance = (begBalance - withdrawlAmt + yearlyEarnings) ; // calculate ending balance
         
         // print calculations
         System.out.println(yearAccumulator + "\t\t" + begBalance + "\t\t" + withdrawlAmt + "\t\t"
                            + yearlyEarnings + "\t\t" + endBalance) ;
                            
         begBalance = endBalance ; // set ending balance to next year's beginning balance
         
         ++ yearAccumulator ; // add year to accumulator
      }
      
      System.out.println() ;
      System.out.println("Above is your projected retirement plan.") ;
      
    }
}
