import java.io.IOException;
import java.util.Scanner;


public class StudentFileManager {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileOperations file = new FileOperations();
		
		int choice;
		
		do {
			System.out.println("\n===== Student File Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice) {
            case 1:
            	System.out.println("Enter roll number: ");
            	int roll = sc.nextInt();
            	sc.nextLine();
            	
            	System.out.println("Enter Name: ");
            	String name = sc.nextLine();
            	
            	System.out.println("Enter marks: ");
            	int marks = sc.nextInt();
            	
            	Student student = new Student(roll, name, marks);
            	
            	file.addStudent(student);
            	break;
            	
            case 2:
            	file.displayStudent();
            	break;
            	
            case 3:
            	System.out.println("ThankYou! GoodBye.");
            	break;
            	
            default:
            	System.out.println("Invalid choice");
            }
            
		} while(choice != 3);
		
		sc.close();
		
	}

}
