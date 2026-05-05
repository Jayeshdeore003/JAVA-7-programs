import java.util.Scanner;

 class InputDemo {
    public static void main(String[] args) {
        // Using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Command Line Arguments
        if (args.length > 0) {
            System.out.println("Command Line Arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        } else {
            System.out.println("No command line arguments passed.");
        }

        sc.close();
    }
}