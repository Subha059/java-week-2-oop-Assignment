
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method");
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Sum: " + c.add(10, 20));
        System.out.println("Sum: " + c.add(10, 20, 30));

        Child obj = new Child();
        obj.show();
    }
}
