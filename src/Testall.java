/**
* @Author: Jiehang CAO
* @Description: This is to test all Exercises.
* @Date: 6:52 PM 2018/10/13
*/
public class Testall {
    public static void main(String[] args) {
        /**
         * Test Book class
         */
        System.out.println("Test for Exercise 1");
        Book book1 = new Book("Dear Basketall",2017,"2016-414-8-24");
        System.out.println(book1.toString());
        System.out.println("-------------------------");
        /**
         * Test BankAccount class
         */
        System.out.println("Test for Exercise 2");
        BankAccount b1 = new BankAccount(1966092,100,20);
        System.out.println(b1.toString());
        System.out.println("-------------------------");
        /**
         * Test EmployeeSalary
         */
        System.out.println("Test for Exercise 3");
        EmployeeSalary e1 = new EmployeeSalary("Kobe",2400,0.2);
        System.out.println("Now: "+e1.toString());
        e1.increaseSalary(1);
        System.out.println("After: "+e1.toString());
        System.out.println("-------------------------");
        System.out.println();

    }
}
