class Student {
    String name;
    int roll;
    String department;

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Department: " + department);
    }
}

class StudentInfo {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Subhadeep";
        s1.roll = 101;
        s1.department = "IT";

        s1.displayInfo();
    }
}