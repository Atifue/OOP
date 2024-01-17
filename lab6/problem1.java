public class problem1{
  public static void main(String[] args){
    double salary = .01; 
    int day = 1;
    System.out.println("Day \tSalary");
    while(salary < 10000){
      System.out.println(day + "\t" + salary);
      day++;
      salary *= 2;
    }
    System.out.println(day + "\t" + salary);

  }
}
