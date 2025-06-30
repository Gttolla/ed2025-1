public class ShowNode {

   public static void main(String args[])
   {
       Info info_1 = new Info<>(1,"Teste");
       Info info_2 = new Info(2, 200);
       Info info_3 = new Info(3, new Object());

       Node node_1 = new Node(info_1);
       Node node_2 = new Node(info_2);
       Node node_3 = new Node();
       node_3.setInfo(info_3);

       System.out.println("\nNode 1 Ref: " + node_1.toString());
       System.out.println("\nInfo 0: " + node_1.getInfo().toString());
       System.out.println("\nInfo 1: " + node_2.getInfo().toString());
       System.out.println("\nInfo 3: " + node_3.getInfo().toString());
   }
}