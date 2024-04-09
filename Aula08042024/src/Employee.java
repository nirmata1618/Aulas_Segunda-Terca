public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    public double netSalary(){
        return this.grossSalary - this.tax;
    };
    public void increaseSalary(double percentage){
        this.grossSalary = this.grossSalary + (this.grossSalary * (percentage / 100));
    }

    @Override
    public String toString() {
        return this.name + ", $ " + this.netSalary();
    }
}
