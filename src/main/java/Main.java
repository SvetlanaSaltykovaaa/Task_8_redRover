public class Main {

    static void intToString(int number) {
        String result = number + "";
        String[] array = result.split("");
        for (int i = 0; i < array.length; i++) {

            String one = switch (array[i]) {
                case "0" -> " ноль";
                case "1" -> " один";
                case "2" -> " два";
                case "3" -> " три";
                case "4" -> " четыре";
                case "5" -> " пять";
                case "6" -> " шесть";
                case "7" -> " семь";
                case "8" -> " восемь";
                case "9" -> " девять";
                default -> throw new IllegalStateException("Unexpected value: " + array[i]);
            };
            System.out.print(one);
        }

    }

    public static void main(String[] args) {
        //  intToString(256);
        Employee employee = new Employee();
        employee.setSalary(10100);
        employee.setCountOfChildren(2);

        Employee employee1 = new Employee();
        employee1.setSalary(4999);
        employee1.setCountOfChildren(0);

        Employee[] employees = {employee, employee1};

        TaxPayment taxPayment = new TaxPayment();
        TaxPayment[] taxPayments = taxPayment.getTaxPayment(employees);

        for (TaxPayment a : taxPayments) {
            System.out.println(a.getTax());
        }

    }
}

