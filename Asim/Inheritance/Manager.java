package Asim.Inheritance;

public class Manager extends Employee {

    int teamSize;
    


    public Manager(int id, String name, String basicSalary, int teamSize) {
        super(id, name, basicSalary);
        this.teamSize = teamSize;

    }

    void conductMeeting() {
        System.out.println(name + " is conducting a meeting with a team size of " + teamSize);
    }

}
