
class Student {
    String name;
    int marks;
    int rollNumber;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Subha";
        s1.marks = 85;
        s1.rollNumber = 101;

        s1.display();
    }
}
