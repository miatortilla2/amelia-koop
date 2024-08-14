import javax.swing.JOptionPane; // import JOptionPane

//Book Purchase - Java 3A
//Amelia Koop, Sp24

public class BookPurchase
{  
   public static void main(String[] args)
   {
   
   System.out.println("Book Title" + "         Price") ; // Print column names.
   
   String bookName ; // name of book.
   String input ; // user input.
   double bookPrice ; // price of each book.
   double totalPrice = 0 ; // total price of all books.
   int bookAmount = 0 ; // total amount of books ordered.
   char repeat ; // to repeat y or n.
   
      do
      {
         // get book name.
         bookName = JOptionPane.showInputDialog("What is the title of the book?");
         
         // get book price.
         input = JOptionPane.showInputDialog("What is the price of the book?");
         bookPrice = Double.parseDouble(input) ;
         
         // print book name and price in columns.
         System.out.println(bookName + "              " + "$  " + bookPrice) ;
         
         // ask user to repeat transaction.
         input = JOptionPane.showInputDialog("Would you like to add another book" +
                                             " to your cart? Y or N");
         // add book price to total.                                    
         totalPrice += bookPrice ;
         
         // add book to total book amount.
         ++ bookAmount ;
                                             
         repeat = input.charAt(0);
         
      } while (repeat == 'Y' || repeat == 'y'); // repeat program if Y.
      
      // print total price of all books.
      System.out.println(String.format("\nTotal $%,.2f", totalPrice));
      
      double discount = 0 ; // declare discount variable.
      
      if (bookAmount >= 7) // apply 15% discount if 7 or more books.
      {
         discount = (totalPrice * .15) ;
         System.out.println (String.format("Discount (%15) $%,.2f", + discount)) ;
      }
      else if (bookAmount >= 4 && bookAmount < 7) // apply 10% discount if 4 or more books.
      {
         discount = (totalPrice * .10) ;
         System.out.println (String.format("Discount (%10) $%,.2f", + discount)) ;
      }
      else if (bookAmount < 4 && bookAmount <= 1) // apply no discount if less than 4 books.      
      {
         discount = 0 ;
      }
      else if (bookAmount == 0) // if book amount is 0 print no books were ordered.
      {
         System.out.println("No books were ordered.") ;
      }
      
      // calculate subtotal
      double subTotal = (totalPrice - discount) ;
      System.out.println(String.format("Subtotal $%,.2f", + subTotal)) ;
      
      // calculate sales tax.
      double salesTax = (subTotal * .085) ;
      System.out.println(String.format("Tax (8.5) $%,.2f", + salesTax)) ;
      
      // calculate amount due
      double amountDue = (subTotal + salesTax) ;
      System.out.println(String.format("Amount Due $%,.2f", + amountDue)) ; 
      
      System.exit(0);
   }
}         
