package Asim.Inheritance;

public class Developer extends Employee {

    String programmingLanguage;

    public Developer(int id, String name, String basicSalary, String programmingLanguage) {
        super(id, name, basicSalary);
        this.programmingLanguage = programmingLanguage;
    }

    void developApplication() {
        System.out.println(name + " is developing an application using " + programmingLanguage);
    }




    
}
