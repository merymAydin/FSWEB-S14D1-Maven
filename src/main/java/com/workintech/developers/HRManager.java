package com.workintech.developers;

public class HRManager extends Employee {

    public JuniorDeveloper[] juniorDevelopers;
    public MidDeveloper[] midDevelopers;
    public SeniorDeveloper[] seniorDevelopers;

    private int juniorCount = 0;
    private int midCount = 0;
    private int seniorCount = 0;

    public HRManager(int id, String name, int salary) {
        super(id, name, salary);

        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    public void addEmployee(JuniorDeveloper dev) {
        if (juniorCount < juniorDevelopers.length) {
            juniorDevelopers[juniorCount++] = dev;
        } else {
            System.out.println("Junior developer array dolu!");
        }
    }

    public void addEmployee(MidDeveloper dev) {
        if (midCount < midDevelopers.length) {
            midDevelopers[midCount++] = dev;
        } else {
            System.out.println("Mid developer array dolu!");
        }
    }

    public void addEmployee(SeniorDeveloper dev) {
        if (seniorCount < seniorDevelopers.length) {
            seniorDevelopers[seniorCount++] = dev;
        } else {
            System.out.println("Senior developer array dolu!");
        }
    }

}
