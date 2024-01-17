public class Student {
  private int id;
  private String firstName, lastName;
  private double gpa;

  public Student(int id, String firstName, String lastName, double gpa){
    setId(id);
    setFirstName(firstName);
    setGpa(gpa);
    setLastName(lastName);
  }

  public Student setId(int id){
    if(id < 1 || id > 99)
      throw new IllegalArgumentException("Invalid range for ID");
    
    this.id = id;  
    return this;
  }

  public Student setFirstName(String firstName){
    if(firstName == null || firstName.length() < 2)
      throw new IllegalArgumentException("Invalid name");
    
    this.firstName = firstName;
    return this;
  }
  public Student setLastName(String lastName){
    if(firstName == null || firstName.length() < 2)
      throw new IllegalArgumentException("Invalid name");
    
    this.lastName = lastName;
    return this;
  }

  public Student setGpa(double gpa){
    if(gpa < 0 || gpa > 4.0)
      throw new IllegalArgumentException("Invalid gpa");
    this.gpa = gpa;
    return this;
  }

  public int getId(){
    return id;
  }

  public double getGpa(){
    return gpa;
  }

  public String getLastName(){
    return lastName;
  }

  public String getFirstName(){
    return firstName;
  }

  public String toString(){
    return String.format("|%3d | %19s | %19s | %3.2f |\n", id, firstName, lastName, gpa);
  }


}
