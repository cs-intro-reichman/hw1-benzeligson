// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Bill3
{
   public static void main(String[] args) {
      String name1 = args[0];
      String name2 = args[1];
      String name3 = args[2];
      double bill = Double.parseDouble(args[3]);
      double priceForEach = Math.ceil(bill/3);
      System.out.println("dear " + name3 + ", " + name2 + ", " + name1 + 
                         ": pay " + priceForEach + " Shekels each");
   }
}
