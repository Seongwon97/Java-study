package myPackage;
import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Employee[] employee = new Employee[100];
		String name,ssn;
		int employeeNum=0;
		double salary;
		char yn;
		do {
			employee[employeeNum]=new Employee();
			System.out.print("Enter the name: ");
			name=keyboard.nextLine();
			name=keyboard.nextLine();
			System.out.print("Enter the salary: ");
			salary = keyboard.nextDouble();
			employee[employeeNum]=new Employee(name,salary);
			
			try {
				System.out.print("Enter the SSN: ");
				ssn=keyboard.nextLine();
				ssn=keyboard.nextLine();
				if(ssn.length()!=9)
					throw new SSNLengthException();
				for(int i=0;i<9;i++) {
					if((ssn.charAt(i)>'9')||(ssn.charAt(i)<'0'))
							throw new SSNCharacterException();
				}
				employee[employeeNum].setSsn(ssn);
				employeeNum++;
			}catch(SSNLengthException e) {
                System.out.println(e.getMessage());
            }

            catch(SSNCharacterException e) {
                System.out.println(e.getMessage());  
            }	
            System.out.println("Again? (y/n)");
            yn = keyboard.next().charAt(0);
        }while (yn == 'y');
		double average=0;
		for(int i=0;i<employeeNum;++i) {
			average=average+employee[i].getSalary();
		}
		average=average/employeeNum;
		for(int i=0;i<employeeNum;++i) {
			employee[i].writeOutput();
			if(employee[i].getSalary() > average)
                System.out.println("Above");
            else if(employee[i].getSalary() < average)
                System.out.println("Below");
            else
                System.out.println("Average");
		}
	}

		

}
