package Landowner;


public class Application {

	public static void main(String[] args) {
         Landowner owner=new Landowner();
         
         Rectangle plot1= new Rectangle(3,4);
         owner.add(plot1);
         System.out.println(plot1.computeArea());
         
         Square plot2=new Square (5);
         owner.add(plot2);
         System.out.println(plot2.computeArea());
         
         
         
         CircleBuilder roughCircleBuilder = new CircleBuilder(3.14);
 		 Circle plot3 = roughCircleBuilder.buildCircle(5);
         owner.add(plot3);
         System.out.println(plot3.computeArea());
         
         System.out.println(owner.getTotalArea());
    }
}
