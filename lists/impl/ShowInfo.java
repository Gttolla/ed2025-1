
public class ShowInfo {

   public static void main(String args[])
   {
       Info info = new Info<>(1,"Teste");
       Info info_2 = new Info(2, 200);
       Info info_3 = new Info(3, new Object());

       System.out.println("\nInfo 0: " + info.toString());
       System.out.println("\nInfo 1: " + info_2.toString());
       System.out.println("\nInfo 3: " + info_3.toString());
   }
}