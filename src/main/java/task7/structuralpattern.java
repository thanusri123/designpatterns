package task7;

import java.util.ArrayList;
import java.util.List;

public class structuralpattern {
	
	public class Employee {
	    private String name;
	    private String position;
	    private int wage;
	    private List<Employee> coworkers;
	    
	    public Employee(String name, String position, int wage) {
	        this.name = name;   
	        this.position = position;
	        this.wage = wage;
	        coworkers = new ArrayList<Employee>();
	    }
	    
	    public void addCoworker(Employee employee) {
	        coworkers.add(employee);
	    }
	    
	    public void removeCoworker(Employee employee) {
	        coworkers.remove(employee);
	    }
	    
	    public List<Employee> getCoworkers() {
	        return coworkers;
	    }
	    
	    public String toString() {
	        return "Employee details: || Name: " + name + ", Position: " + position + ", Wage: "
	             + wage + " ||";
	    }
	}                                 //end of composite
	
	                                    //bridge
	public interface FeedingAPI {
	    public void feed(int timesADay, int amount, String typeOfFood);
	}
	public class BigDog implements FeedingAPI {
	    public void feed(int timesADay, int amount, String typeOfFood) {
	        System.out.println("Feeding a big dog, " + timesADay + " times a day with " + 
	            amount + " g of " + typeOfFood);
	    }
	}

	public class SmallDog implements FeedingAPI {
	    public void feed(int timesADay, int amount, String typeOfFood) {
	        System.out.println("Feeding a small dog, " + timesADay + " times a day with " + 
	            amount + " g of " + typeOfFood);
	    }
	}
	public abstract class Animal {
	    protected FeedingAPI feedingAPI;
	    
	    protected Animal(FeedingAPI feedingAPI) {
	        this.feedingAPI = feedingAPI;
	    }
	    public abstract void feed();
	}public class Dog extends Animal{
	    private int timesADay, amount;
	    private String typeOfFood;
	    
	    public Dog(int timesADay, int amount, String typeOfFood, FeedingAPI feedingAPI) {
	        super(feedingAPI);
	        this.timesADay = timesADay;
	        this.amount = amount;
	        this.typeOfFood = typeOfFood;
	    }
	    
	    public void feed() {
	        feedingAPI.feed(timesADay, amount, typeOfFood);
	    }
	}                                  //end of bridge

	
    public static void main(String[] args) {
    	structuralpattern s=new structuralpattern();
		        Employee employee1 =s. new Employee("David", "Programmer", 1500);
		        Employee employee2 =s. new Employee("Scott", "CEO", 3000);
		        Employee employee3 = s.new Employee("Andrew", "Manager", 2000);
		        Employee employee4 = s.new Employee("Scott", "Janitor", 500);
		        Employee employee5 = s.new Employee("Juliette", "Marketing", 1000);
		        employee3.addCoworker(employee1);
		        employee2.addCoworker(employee3);
		        employee2.addCoworker(employee5);
		       // employee2.addCoworker(employee6);

		        System.out.println(employee2);
		        for (Employee headEmployee : employee2.getCoworkers()) {
		            System.out.println(headEmployee);
		            
		            for(Employee employee : headEmployee.getCoworkers()) {
		                System.out.println(employee);
		              System.out.println(" ") ; 
		                Animal bigDog = s.new Dog(3, 500, "Meat", s.new BigDog());
		                Animal smallDog =s. new Dog(2, 250, "Granules", s.new SmallDog());
		                
		                bigDog.feed();
		                smallDog.feed();
		            }
		        }
	}
}
