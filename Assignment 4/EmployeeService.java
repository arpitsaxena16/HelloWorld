class EmployeeService {

	public static void main(String[] s){

			
			Employee e1 = new Employee(1000, "Gagan", Month.JAN, Year.Y2016);

			System.out.println("Employee Details are as follows : ");
			System.out.println(e1.id);
			System.out.println(e1.name);
			System.out.println(e1.joiningMonth);
			System.out.println(e1.joiningYear);

		}

}