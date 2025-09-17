class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double ratePerHour) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateSalary() { return hoursWorked * ratePerHour; }
}