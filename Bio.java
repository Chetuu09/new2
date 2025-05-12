import java.util.Scanner;
class Bio
{
	public static void main(String[] args)
		{
			Scanner a = new Scanner(System.in); // obj
			
			System.out.print("enter your name : "); 
			String name = a.nextLine();

			System.out.print("enter your edu : ");
			String edu = a.nextLine();

			System.out.print("enter ur YOP : ");
			double yop = a.nextShort();		// implicitliy changing the datatype

			System.out.print("enter ur cgpa : ");
			float cgpa = a.nextFloat();

			System.out.print("enter contact : ");
			long con = a.nextLong();

				System.out.println("Enter your name is : "+name);
				System.out.println("ur educaition is  : "+edu);
				System.out.println("ur year of the passing is : "+yop);
				System.out.println("ur cgpa is : "+cgpa);
				System.out.println("ur contact no is : "+con);

		}
}