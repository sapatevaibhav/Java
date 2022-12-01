class Employee {
        String Emp_name, Address, Mail_id;
        int Emp_id;
        long Mobile_number;
}

class Programmer extends Employee {
        int basic_pay = 100000;
}

class TeamLead extends Employee {
        int basic_pay = 150000;
}

class AssistantProjectManager extends Employee {
        int basic_pay = 200000;
}

class ProjectManager extends Employee {
        int basic_pay = 300000;
}