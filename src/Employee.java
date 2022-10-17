import java.util.Scanner;

public class Employee {

    static String name;
    static int salary;
    static int workHours;
    static int hireYear;

    static double tax = 0;
    static int bonus;
    static double raiseSalary;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Adiniz ve soyadıniz: ");
        name = scan.nextLine();

        System.out.print("Maasiniz: ");
        salary = scan.nextInt();

        System.out.print("Haftalik calisma saatiniz: ");
        workHours = scan.nextInt();

        System.out.print("Ise baslangic yiliniz: ");
        hireYear = scan.nextInt();

        tax(salary);
        bonus(workHours);
        raiseSalary(hireYear, salary);

        Employee employee = new Employee(name , salary , workHours , hireYear );

        System.out.println(employee);

    }

    public Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public static void tax(int salary){

        if (salary<1000){
            tax = 0;
        } else {
            tax = (salary/100)*3;
        }
    }

    public static void bonus(int workHours){

        if (workHours<=40){
            bonus = 0;
        } else {
            bonus = (workHours-40)*30;
        }
    }

    public static void raiseSalary(int hireYear, int salary){
        int howManyYear = 2021-hireYear;



        if (howManyYear<10){
            raiseSalary = salary/100*5;
        } if (howManyYear<20){
            raiseSalary = salary/100*10;
        } else {
            raiseSalary = salary/100*15;
        }
    }

    public String toString(){
        return "Adı ; "+ name +
                "\nMaaşı ; " + salary +
                "\nÇalışma saati ; " + workHours +
                "\nBaşlangıç yılı ; " + hireYear +
                "\nVergi ; " + tax +
                "\nBonus ; " + bonus +
                "\nMaaş artışı ; "+ raiseSalary +
                "\nVergi ve bonuslarla birlikte maaşı ; " + (salary + bonus + tax + raiseSalary) +
                "\nToplam maaş ; "+ (salary + bonus + raiseSalary);
    }

}
