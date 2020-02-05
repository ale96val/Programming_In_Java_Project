public class Example {
    public static void main(String[] args) {

        A[] elements = new A[3];
        elements[0] = new B();
        elements[1] = new C();
        elements[2] = new B();

        for (A a : elements) {
            a.doSmth();
        }

    }
}

abstract class A {
    abstract void doSmth();
}

class B extends A {
    @Override
    void doSmth() {
        System.out.println("Hi!");
    }
}

class C extends A {
    @Override
    void doSmth() {
        System.out.println("Hello!");
    }
}
