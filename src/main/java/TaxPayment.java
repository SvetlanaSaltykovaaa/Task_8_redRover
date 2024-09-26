public class TaxPayment {
    private Employee employee;
    private double tax;

    public TaxPayment[] getTaxPayment(Employee[] arrayOfEmployees) {
        TaxPayment[] taxPayments = new TaxPayment[arrayOfEmployees.length];

        for (int i = 0; i < arrayOfEmployees.length; i++) {
            TaxPayment taxPayment = new TaxPayment();
            setSalaryWithChildren(arrayOfEmployees[i]);
            if (arrayOfEmployees[i].getSalary() > 10000) {
                taxPayment.setTax(arrayOfEmployees[i].getSalary() * 0.23);
            } else if (arrayOfEmployees[i].getSalary() < 5000) {
                taxPayment.setTax(arrayOfEmployees[i].getSalary() * 0.13);
            } else {
                taxPayment.setTax(arrayOfEmployees[i].getSalary() * 0.23);
            }
            taxPayments[i]  = taxPayment;
        }
        return taxPayments;
    }

    public void setSalaryWithChildren(Employee employee) {
        if (employee.getCountOfChildren() > 0) {
            employee.setSalary(employee.getSalary() - employee.getCountOfChildren() * 1000);
        }
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}





