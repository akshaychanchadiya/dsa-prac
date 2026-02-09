public static class Employee {
    String name;
    int Salary;

 void printDetails() {
 System.out.println("Name: " + name);
 System.out.println("Salary: " + Salary);
 System.out.println();
 }
 }
 
 public static void main(String[] args) {
 
 Employee e1 = new Employee();
 e1.name = "A";
 e1.Salary = 50000;

 Employee e2 = new Employee();
 e2.name = "B";
 e2.Salary = 30000;

 e1.printDetails();
 e2.printDetails();

 }
