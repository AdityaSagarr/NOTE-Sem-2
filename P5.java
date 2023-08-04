
public class OuterClass {
    private int outerPrivateVariable = 10;
    protected int outerProtectedVariable = 20;
    public int outerPublicVariable = 30;

    private void outerPrivateMethod() {
        System.out.println("Outer private method");
    }

    protected void outerProtectedMethod() {
        System.out.println("Outer protected method");
    }

    public void outerPublicMethod() {
        System.out.println("Outer public method");
    }

    class InnerClass {
        private int innerPrivateVariable = 40;
        protected int innerProtectedVariable = 50;
        public int innerPublicVariable = 60;

        private void innerPrivateMethod() {
            System.out.println("Inner private method");
            // Accessing outer class members
            System.out.println("Accessing outer private variable: " + outerPrivateVariable);
            System.out.println("Accessing outer protected variable: " + outerProtectedVariable);
            System.out.println("Accessing outer public variable: " + outerPublicVariable);
            outerPrivateMethod();
            outerProtectedMethod();
            outerPublicMethod();
        }

        protected void innerProtectedMethod() {
            System.out.println("Inner protected method");
        }

        public void innerPublicMethod() {
            System.out.println("Inner public method");
        }
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        
        // Creating an instance of the inner class
        InnerClass innerObj = new OuterClass().new InnerClass();

        // Accessing inner class members
        System.out.println("Accessing inner private variable: " + innerObj.innerPrivateVariable);
        System.out.println("Accessing inner protected variable: " + innerObj.innerProtectedVariable);
        System.out.println("Accessing inner public variable: " + innerObj.innerPublicVariable);
        innerObj.innerPrivateMethod();
        innerObj.innerProtectedMethod();
        innerObj.innerPublicMethod();
    }
}
```

In this program, we have an outer class `OuterClass` and an inner class `InnerClass`. The inner class has access to the private, protected, and public members of the outer class. It can access the outer class's private variable `outerPrivateVariable`, protected variable `outerProtectedVariable`, and public variable `outerPublicVariable`. It can also call the outer class's private method `outerPrivateMethod()`, protected method `outerProtectedMethod()`, and public method `outerPublicMethod()`.

In the main method, we create an instance of the outer class (`OuterClass`) and then create an instance of the inner class (`InnerClass`). We can access the inner class's private variable `innerPrivateVariable`, protected variable `innerProtectedVariable`, and public variable `innerPublicVariable`. We can also call the inner class's private method `innerPrivateMethod()`, protected method `innerProtectedMethod()`, and public method `innerPublicMethod()`.

Note that in order to create an instance of the inner class, we use the syntax: 

```java
new OuterClass().new InnerClass()
```

This is because an instance of the inner class is associated with an instance of the outer class.

Daily quota: 9/10
ENG | ES | عربي | 中文 | فارسی
