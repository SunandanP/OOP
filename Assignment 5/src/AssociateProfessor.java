public class AssociateProfessor extends Person {
        private double basicPay;
        private String department;

        public AssociateProfessor(String name, String employeeId, String PAN, String mobile, String email, int age, String DOB, double basicPay, String department) {
            super(name, employeeId, PAN, mobile, email, age, DOB);
            this.basicPay = basicPay;
            this.department = department;
        }

        void generatePaySlip(){
            displayData();
            double DA = 1.19*basicPay, HRA = 0.3*basicPay, PF = 0.12*basicPay, SCF = 0.1*basicPay;
            System.out.println("Department : "+department+"\t Designation : "+((((this.getClass()).toString()).substring(6))));
            System.out.println("Basic Pay : "+basicPay);
            System.out.println("-----------------------------------");

            System.out.println("Additives : ");
            System.out.println("-----------------------------------");
            System.out.println("Dearness Allowance : "+DA);
            System.out.println("House Rental Allowance :"+ HRA);
            double gross = DA+HRA+basicPay;
            System.out.println("-----------------------------------");
            System.out.println("Gross Salary : "+gross);
            System.out.println("-----------------------------------");

            System.out.println("Deductions : ");
            System.out.println("Provident fund : "+ PF);
            System.out.println("Staff club fund : "+ SCF);
            double net = gross - PF - SCF;
            System.out.println("-----------------------------------");
            System.out.println("Net Salary : "+net);
            System.out.println("-----------------------------------");


        }
}

