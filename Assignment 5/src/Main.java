public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("Sunandan","143","DSW1233","9549040310","sunandanphalke@gmail.com",19,"23/04/2003",75000,"Information Technology");
        p.generatePaySlip();
        AssociateProfessor associateProfessor = new AssociateProfessor("Sunandan","143","DSW1233","9549040310","sunandanphalke@gmail.com",19,"23/04/2003",75000,"Information Technology");
        associateProfessor.generatePaySlip();
        AssistantProfessor assistantProfessor = new AssistantProfessor("Sunandan","143","DSW1233","9549040310","sunandanphalke@gmail.com",19,"23/04/2003",75000,"Information Technology");
        assistantProfessor.generatePaySlip();
    }
}
