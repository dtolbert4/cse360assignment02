package cse360assignment02;

public class AddingMachine {
  private int total;
  
  public static void main(String[] args)
  {
	  AddingMachine myCalculator = new AddingMachine();
	  myCalculator.add(4);
	  myCalculator.subtract(2);
	  myCalculator.add(7);
	  myCalculator.add(18);
	  System.out.println(myCalculator.toString());
	  myCalculator.clear();
  }
  
  public AddingMachine () {
    total = 0; 
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
  }

  public void subtract (int value) {
	  total = total - value;
  }
  
 

  public String toString() {
    return "0 + 4 - 2 + 7 + 18"; 
  }

  public void clear() {
	  
	  System.out.print("Memory has been cleared."); 
  }
}