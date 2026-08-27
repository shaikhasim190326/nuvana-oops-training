package Asim.Inheritance;

public class Tester extends Employee {
    
String testingTool;

    public Tester(int id, String name, String basicSalary, String testingTool) {
        super(id, name, basicSalary);
        this.testingTool = testingTool;
    }

    void testApplication() {
        System.out.println(name + " is testing an application using " + testingTool);
    }

}
