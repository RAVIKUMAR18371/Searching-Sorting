package CSWsortingMerQui.src.Question8;

import java.util.ArrayDeque;
import java.util.Deque;

abstract class Employee implements I1{
    int EmpID;
    String fName;
    String lName;
    int salary;
    public Employee(int EmpID,String fName,String lName,int salary){
        this.EmpID=EmpID;
        this.fName=fName;
        this.lName=lName;
        this.salary=salary;
    }
    public void givebonus(double amount){
    try{
        if(amount<=0)
            throw new ArithmeticException("Bonus amount is less than or equal to zero");

    }
    catch(ArithmeticException e){
        System.out.println("Since the bonus amount provided is less than or equal to zero"+"nothing will be added");
        amount=0;
    }
    this.salary+=amount;
        Deque  deque= new ArrayDeque();
    }
}

