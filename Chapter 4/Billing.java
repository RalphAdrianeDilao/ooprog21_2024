class Billing {
   private static final double TAX = 0.08; 

   static void computeBill(double price){
      double finalPrice = price + (price * TAX);
      System.out.println("The total price for the bill is: $" + finalPrice);
   }
   
   static void computeBill(double price, int quantity){
      double priceBeforeTax = price * quantity;
      double finalPrice = priceBeforeTax + (priceBeforeTax * TAX);
      System.out.println("The total price for the bill is: $" + finalPrice);
   }
   
   static void computeBill(double price, int quantity, int coupon_discount){
      double priceBeforeTax = (price * quantity) - coupon_discount;
      double finalPrice = priceBeforeTax + (priceBeforeTax * TAX);
      System.out.println("The total price for the bill is: $" + finalPrice);
   }
   
   public static void main(String[] a){
      // Had to test multiple inputs to try and replicate sample output because I want to
      computeBill(23.2);
      computeBill(24.4, 2);
      computeBill(40.45, 2, 10);
   }
}
