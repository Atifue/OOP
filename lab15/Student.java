import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Student {
    private String name, email, address, mobilePhone, homePhone;
    private int id;
    private LocalDate dob;
    private Department dept;

    public Student(){
        id = 0;
        name = null;
        dept = Department.NONE;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public Department getDepartment(){
        return dept;
    }

    public String getAddress(){
        return address;
    }

    public LocalDate getDob(){
        return dob;
    }

    public String getEmail(){
        return email;
    }

    public String getMobilePhone(){
        return mobilePhone;
    }

    public String getHomePhone(){
        return homePhone;
    }

    public Student setName(String name){
        if(name == null || name.length() < 2){
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
        return this;
    }

    public Student setId(int id){
        if(id < 1){
            throw new IllegalArgumentException("Invalid ID");
        }
        this.id = id;
        return this;
    }

    public Student setDepartment(Department dept){
        this.dept = dept;
        return this;
    }

    public Student setAddress(String address){
        this.address = address;
        return this;
    }

    public Student setDob(LocalDate dob){
        this.dob = dob;
        return this;
    }

    public Student setEmail(String email){
        this.email = email;
        return this;
    }

    public Student setMobilePhone(String mobilePhone){
        this.mobilePhone = mobilePhone;
        return this;
    }

    public Student setHomePhone(String homePhone){
        this.homePhone = homePhone;
        return this;
    }

    public void print(){
        if(name != null){
            System.out.println("Name \t\t\t|\t\t\t" + name);
        }
        if(id >= 1){
            System.out.println("Id \t\t\t|\t\t\t" + id);
        }
        if(dob != null){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
            System.out.println("DOB (MM/DD/YYYY) \t|\t\t\t" + dob.format(formatter));
        }
        if(dept != null)
        System.out.println("Department \t\t|\t\t\t" + dept.getName());
        if(email != null){
            System.out.println("Email \t\t\t|\t\t\t" + email);
        }
        if(address != null){
            System.out.println("Address \t\t|\t\t\t" + address);
        }
        if(mobilePhone != null){
            System.out.println("Mobile Phone \t\t|\t\t\t" + mobilePhone);
        }
        if(homePhone != null){
            System.out.println("Home Phone \t\t|\t\t\t" + homePhone);
        }
    }

    public static Student.Builder builder(){
        return new Student.Builder();
    }

    public static class Builder{
        private Student student = new Student();

        public Student.Builder name(String name){
            if(name == null || name.length() < 2){
                throw new IllegalArgumentException("Name invalid");
            }
            student.setName(name);
            return this;
        }

        public Student.Builder id(int id){
            if(id < 1){
                throw new IllegalArgumentException("Invalid ID");
            }
            student.setId(id);
            return this;
        }

        public Student.Builder email(String email){
            student.setEmail(email);
            return this;
        }

        public Student.Builder dob(LocalDate dob){
            student.setDob(dob);
            return this;
        }

        public Student.Builder department(Department dept){
            student.setDepartment(dept);
            return this;
        }
        public Student.Builder address(String address){
            student.setAddress(address);
            return this;
        }
        public Student.Builder mobilePhone(String mobilePhone){
            student.setMobilePhone(mobilePhone);
            return this;
        }
        public Student.Builder homePhone(String homePhone){
            student.setHomePhone(homePhone);
            return this;
        }

        public Student build(){
            if(student.getName() == null || student.getId() == 0 || student.getDepartment() == Department.NONE){
                return null;
            }
            return student;
        }
    }


}
