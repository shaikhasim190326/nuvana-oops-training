package Asim.EmployeesDetails;

public class Employees {

    private String name;
    private String department;
    private String Salary;

    public Employees( String name, String department, String Salary){

        
        this.name = name;
        this.department = department;
        this.Salary = Salary;


    }


    public String getName(){

        return name;
    }       

    public void setName(String name){

        this.name = name;
    }

    public String getDepartment(){

        return department;
    }

    public void setDepartment(String department){

        this.department = department;
    }

    public String getSalary(){

        return Salary;
    }

    public void setSalary(String Salary){

        this.Salary = Salary;
    }




    
}
