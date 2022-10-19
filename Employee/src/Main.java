public class Main {
    public static void main(String[] args){
        Employee e = new Employee(80001, 8.7, "Data Analyst");

        e.workHard();
        System.out.println(e.hours);

        e.workSmart().workSmart(); //chaining
        System.out.println(e.salary);

        System.out.println(e.role);
    }
}