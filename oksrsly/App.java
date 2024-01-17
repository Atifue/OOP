import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.TreeMap;
// fix the formatting on the exit
public class App {
  public static void main(String [] args) throws FileNotFoundException {
    FileInputStream stream = new FileInputStream("students.txt");
    Scanner scanner = new Scanner(stream);
   // System.out.println(new File("students.txt").getAbsolutePath());

    TreeMap<Integer, Student> container = new TreeMap<>();

    while(scanner.hasNextLine()){
      String values = scanner.nextLine();
      String arr[] = values.trim().split(",");

    
      int id = Integer.parseInt(arr[0]);
      String firstName = arr[1];
      String lastName = arr[2];
      double gpa = Double.parseDouble(arr[3]);

      Student student = new Student(id, firstName, lastName, gpa);
      
      container.put(id, student);

    }
    int x = 0;
    while(true){
      try{
        System.out.print("Avaliable menu items: \n   1. Print all students \n   2. Add a new student \n   3. Delete an existing student\n   4. Find new student with id\n   5. Quit the App \n       Your choice [1-5]? ");
        Scanner first = new Scanner(System.in);
        x = first.nextInt();
        if(x > 5 || x < 1){
          System.out.println("Illegal menu item selected!\n");
          continue;
        }
        
    }
    catch(Exception e){
      System.out.println("Illegal menu item selected!\n");
      continue;
    }
    
    
      if(x == 5){
        File file = new File("students.txt");
        FileOutputStream stream1 = new FileOutputStream(file);
        PrintStream ps = new PrintStream(stream1, false, StandardCharsets.US_ASCII);
        for(var c : container.values()){
          ps.println(c.getId() + "," + c.getFirstName() + "," + c.getLastName() + "," + c.getGpa());
        }
        ps.close();
        System.exit(0);
      }
      if(x == 1){
        System.out.println("We have " + container.size() + " students as follows...");
        System.out.println("+----+---------------------+---------------------+------+");
        System.out.println("| Id |       FirstName     |         LastName    |  Gpa |");
        System.out.println("+----+---------------------+---------------------+------+");
        for(var d : container.values()){
          System.out.print(d);
      }
      System.out.println("+----+---------------------+---------------------+------+");
        continue;
      }
      int id1 = 0;
      String name1, name = null;
      if(x == 2){
        while(true){
        try{
        System.out.print("Enter student id [1-99]: ");
        Scanner id = new Scanner(System.in);
        id1 = id.nextInt();
        if(container.containsKey(id1)){
          System.out.println(" ---> A student with id = " + id1 + " already exists!");
          continue;
        }
        if(id1 > 99 || id1 < 1){
          System.out.println("  --> id must be >= 1 && <= 99!");
          continue;
        }
        
      }
      catch(Exception e){
        System.out.println("  --->  id must be an integer!"); 
        continue;
      }
      break;
      }
      
      while(true){
      System.out.print("Enter first name: ");
      Scanner n = new Scanner(System.in);
      String n1 = n.nextLine();
      name1 = n1.trim();
      if(name1.length() < 2 || name1 == null){
        System.out.println("  --> Firstname must have at least 2 characters!");
        continue;
      }
      break;
    }
      while(true){
      System.out.print("Enter last name: ");
      Scanner n = new Scanner(System.in);
      String n1 = n.nextLine();
      name = n1.trim();
      if(name.length() < 2 || name == null){
        System.out.println("  --> LastName must have at least 2 characters!");
        continue;
      }
      break;
    }
    double d = 0;
    while(true){
      try{
    System.out.print("Enter student gpa [0.0 - 4.0]: ");
    Scanner n = new Scanner(System.in);
    d = n.nextDouble();
    if(d > 4.0 || d < 0){
     System.out.println("  --> gpa must be >= >= 0.0 && <= 4.0!");
     continue;
    }
  }
  catch(Exception e){
    System.out.println(" --> gpa must be a number!");
    continue;
  }
    break;
  }
    System.out.println("Added 1 student....");
    System.out.println("+----+---------------------+---------------------+------+");
    System.out.println("| Id |       FirstName     |         LastName    |  Gpa |");
    System.out.println("+----+---------------------+---------------------+------+");
    // add a line here for formatting
    System.out.print(String.format("|%3d | %19s | %19s | %3.2f |\n", id1, name1, name, d));
    System.out.println("+----+---------------------+---------------------+------+");
    Student newstudent = new Student(id1, name1, name, d);
    container.put(id1, newstudent);
    continue;
    }
    if(x == 3){
      int input3 = 0;
      while(true){
        try{
          System.out.print("Enter student id [1-99]: ");
          Scanner i3 = new Scanner(System.in);
          input3 = i3.nextInt();
          if(input3 > 99 | input3 < 1){
            System.out.println("  --> id must be >= 1 && <= 99!");
            continue;
          }
          break;
        }
        catch(Exception e){
          System.out.println("  --->  id must be an integer: ");
          continue;
        }
      }
      if(container.containsKey(input3)){
        System.out.println("Deleting 1 student...");
        Student removed = container.get(input3);
        System.out.println("+----+---------------------+---------------------+------+");
        System.out.println("| Id |       FirstName     |         LastName    |  Gpa |");
        System.out.println("+----+---------------------+---------------------+------+");
        System.out.print(String.format("|%3d | %19s | %19s | %3.2f |\n", removed.getId(), removed.getFirstName(), removed.getLastName(), removed.getGpa()));
        System.out.println("+----+---------------------+---------------------+------+");
        container.remove(input3);
        continue;
      }
      else{
        continue;
      }
    }
    if(x == 4){
      int input4 = 0;
      while(true){
        try{
          System.out.print("Enter student id [1-99]: ");
          Scanner i4 = new Scanner(System.in);
          input4 = i4.nextInt();
          if(input4 > 99 | input4 < 1){
            System.out.println("  --> id must be >= 1 && <= 99!");
            continue;
          }
          break;
        }
        catch(Exception e){
          System.out.println("  --->  id must be an integer: ");
          continue;
        }
      }
        if(container.containsKey(input4)){
        System.out.println("Student with id: " + input4 + " found:");
        Student found = container.get(input4);
        System.out.println("+----+---------------------+---------------------+------+");
        System.out.println("| Id |       FirstName     |         LastName    |  Gpa |");
        System.out.println("+----+---------------------+---------------------+------+");
        System.out.print(String.format("|%3d | %19s | %19s | %3.2f |\n", found.getId(), found.getFirstName(), found.getLastName(), found.getGpa()));
        System.out.println("+----+---------------------+---------------------+------+");
        continue;
      }
      else{
        System.out.println("User does not exist.");
        continue;
      }
    }
  }
    
  }  
}
