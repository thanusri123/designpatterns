package task7;

public class Behavioralpattern {
	public abstract class SortingAlgorithm {
		   public void sortingTemplate(int[] data){
		      selectionSort(data);
		      mergeSort(data);
		   }
		   public abstract void selectionSort(int[] data);
		   public abstract void mergeSort(int[] data);
		}

		public class AlgorithmType extends SortingAlgorithm {
		   @Override
		   public void selectionSort(int[] data) {
		      System.out.println("Selection sort algorithm Type 1");
		   }

		   @Override
		   public void mergeSort(int[] data) {
		      System.out.println("Merge sort algorithm Type 1");
		   }

		}

		public class AlgorithmType2 extends SortingAlgorithm {

		   @Override
		   public void selectionSort(int[] data) {
		      System.out.println("Selection sort algorithm Type 2");
		   }

		   @Override
		   public void mergeSort(int[] data) {
		      System.out.println("Merge sort algorithm Type 2");
		   }
		}
		public class Soldier {
			   private SoldierBehavior behavior;
			   private String type;

			   public Soldier(SoldierBehavior behavior, String type) {
			      super();
			      this.behavior = behavior;
			      this.type = type;
			   }

			   public void stance() {
			      System.out.println(type);
			      behavior.stance();
			   }
			}


			public interface SoldierBehavior {
			   public void stance();
			}


			public class AggresiveMode implements SoldierBehavior {

			   public void stance() {
			      System.out.println("Attack enemy at sight.");
			   }
			}

			public class DefensiveMode implements SoldierBehavior {

			   public void stance() {
			      System.out.println("Attack only when attacked.");

			   }
			}
		 public static void main(String[] args) {
		      int[] data = { 45, 23, 89, 3423, 77, 33, 78, 322 };
		      Behavioralpattern p=new Behavioralpattern();
		      SortingAlgorithm  s1= p.new AlgorithmType();
		      s1.sortingTemplate(data);;
		      SortingAlgorithm s2 = p.new AlgorithmType2();
		      s2.sortingTemplate(data);
		      Behavioralpattern p1=new Behavioralpattern();
		          Soldier s11 = p1.new Soldier(p1.new DefensiveMode(), "Batman");
		          Soldier s21 = p1.new Soldier(p1.new AggresiveMode(), "Spiderman");
		          Soldier s3 = p1.new Soldier(p1.new DefensiveMode(), "Superman");
		          s11.stance();
		          s21.stance();
		          s3.stance();
		       }
		   
}
