// Write a java pgm to define a base class 'bank' which holds various details of customers such as name, account number, balance and 
// member functions to read ,display and cal rate of interest earned by all the account holders
// derive 3 new classes namely, city bank, sbi bank, canara bank, from this base class which are offering different rate of interest.
// Extend a calculate method of base class within these derived classes to calculate and display the interest earned by all account holders of these banks.

import java.util.Scanner;

class bank 
{
    public String name, acc;
    public int year;
    public double intrate, bal, intamt;

    public void getdata() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        acc = sc.nextLine();
        System.out.print("Enter Year: ");
        year = sc.nextInt();
        System.out.print("Enter Balance: ");
        bal = sc.nextDouble();
        System.out.println();

    }

    public void printdata() 
    {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + acc);
        System.out.println("Year: " + year);
        System.out.println("Balance: " + bal);
        System.out.println();
    }

    public void interest() 
    {
        intamt = 0;
        intrate = 0;
        System.out.println();
    }
}

class SBIbank extends bank
{
    public void interest() 
    {
        intrate = 0.06;
        System.out.println("The Interest rate is: " + intrate);
        intamt = intrate*bal;
        System.out.println("The Interest earned is: " + intamt);
        System.out.println();
    }
}

class Citybank extends bank
{
    public void interest() 
    {
        intrate = 0.05;
        System.out.println("The Interest rate is: " + intrate);
        intamt = intrate*bal;
        System.out.println("The Interest earned is: " + intamt);
        System.out.println();
    }
}

class Canarabank extends bank
{
    public void interest() 
    {
        intrate = 0.09;
        System.out.println("The Interest rate is: " + intrate);
        intamt = intrate*bal;
        System.out.println("The Interest earned is: " + intamt);
        System.out.println();
    }
}

public class InheritanceMod
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers: ");
        int n = sc.nextInt();
        SBIbank [] c1 = new SBIbank[n];
        Citybank [] c2 = new Citybank[n];
        Canarabank [] c3 = new Canarabank[n];

        System.out.println("Welcome to SBI bank");
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter Details of customer "+(i+1));
            c1[i] = new SBIbank();
            c1[i].getdata();
            c1[i].printdata();
            c1[i].interest();
        }

        System.out.println("Welcome to City bank");
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter Details of customer "+(i+1));
            c2[i] = new Citybank();
            c2[i].getdata();
            c2[i].printdata();
            c2[i].interest();
        }

        System.out.println("Welcome to Canara bank");
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter Details of customer "+(i+1));
            c3[i] = new Canarabank();
            c3[i].getdata();
            c3[i].printdata();
            c3[i].interest();
        }
        System.out.println("Enter the year to find highest Interest Earner in SBI Bank: ");
        int y = sc.nextInt();

        double max = 0;
        int index = 0;
        for(int i=0; i<n; i++)
        {
            if(c1[i].year == y)
            {
                if(c1[i].intamt > max)
                {
                    max = c1[i].intamt;
                    index = i;
                }
            }
        }
        System.out.println("Details of the highest Interest Earner in SBI Bank: ");
        c1[index].printdata();
        c1[index].interest();
    }
}
