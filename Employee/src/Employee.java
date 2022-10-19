import java.util.StringJoiner;

public class Employee {
    public double salary;
    public double hours;
    String role;

    public Employee(double salary, double hours, String role){
        this.salary=salary;
        this.hours=hours;
        this.role=role;
    }

    public Employee workSmart(){ //rather than returning void we return Employee so that we can use method chaining
        if(this.salary<80000){
            this.salary+=20000;
        }else{
            this.salary += this.salary;
            // *= 2
            StringJoiner joinPrefix = new StringJoiner(" "); // passing comma(,) as delimiter
            joinPrefix.add("Senior");
            joinPrefix.add(this.role);
            //this.role  = "Senior" + this.role;
            this.role = String.valueOf(joinPrefix);
        }
        return this;
    }

    public void workHard(){
        if(this.hours + 4 <= 24){
            this.hours+=4;
        }
    }

    public void printInfo(){
        System.out.println("Salary: "+this.salary);
        System.out.println("Hours worked per day: "+this.hours);
        System.out.println("Role: "+this.role);
    }

}
