class Employee {
    int id;
    String name;
    double salary;

    void setData(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setData(101, "Jayesh", 30000);
        e.display();
    }
}