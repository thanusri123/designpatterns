package task7;
public class creationalpattern {
	public class Box implements Cloneable{
		   private String color;

		   public Box(String col){
		      setColor(col);
		   }

		   public Box clone(){
		      Box b=null;
		      try{
		         b=(Box)super.clone();
		      }catch(Exception e){

		      }
		      return b;
		   }

		   public String getColor() {
		      return color;
		   }

		   public void setColor(String color) {
		      this.color = color;
		   }
		}
public final static class MySingleton {
	   private static final MySingleton singleton=new MySingleton();

	   private MySingleton(){
	      System.out.println("singleton object created...");
	   }

	   public static MySingleton getInstance(){
	      return singleton;
	   }
	}


	public static void main(String[] args) {
	      MySingleton s1=MySingleton.getInstance();
	     // MySingleton s2=MySingleton.getInstance();
	      creationalpattern c=new creationalpattern();
	      Box box1=c.new Box("GREEN");
	      Box box2=box1.clone();
	      System.out.println("BOX 1: "+box1.getColor());
	      System.out.println("BOX 2: "+box2.getColor());
	      box2.setColor("BLUE");
	      System.out.println("BOX 2: "+box2.getColor());
	   }
 }

