import java.util.*;
class Employee
{
int emp_id;
String name,department;
float bs,ta,hra,total_salary;
void show()
{
System.out.print("\n \n \n \t \t \t  EMPLOYEE DETAILS \n");
System.out.print(" \n employee id = " + emp_id + " \n name = " + name + " \n department = "+ department +" \n basic salary = " + bs + " \n total amount = " + ta + " \n hourly amout " + hra);
}
void calculate_total_salary()
{
total_salary=bs+ta+hra;
System.out.print(" \n total salary  = " + total_salary);
}
}
public class Main
{
public static void main(String array[])
{
Employee e1=new Employee();
Scanner Sc=new Scanner(System.in);
System.out.print("enter a value of employee id");
e1.emp_id=Sc.nextInt();
System.out.print("enter a value of employee name");
e1.name=Sc.next();
System.out.print("enter a value of department");
e1.department=Sc.next();
System.out.print("enter a value of basic salary");
e1.bs=Sc.nextFloat();
System.out.print("enter a value of total amount");
e1.ta=Sc.nextFloat();
System.out.print("enter a value of hourly salary");
e1.hra=Sc.nextFloat();
e1.show();
e1.calculate_total_salary();
}
}
