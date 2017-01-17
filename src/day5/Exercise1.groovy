/* 

1  Dividing integers

Create a Java class called Calculator. The class should implement the following methods, each of them printing the result on the screen.

• add(int, int)
• subtract(int, int)
• multiply(int, int)
• divide(int, int)
• modulus(int, int)

Note that you will will need to cast the parameters into double to perform exact division.

Write a small Groovy or Java Decaf program that uses all the methods of Calculator.

*/

class Calculator {

    public void add(int a, int b) {
        double r = (double) a + (double) b;
        println r;
    }

    public void subtract(int a, int b) {
        double r = (double) a - (double) b;
        println r;
    }

    public void multiply(int a, int b) {
        double r = (double) a * (double) b;
        println r;
    }

    public void divide(int a, int b) {
        double r = (double) a / (double) b;
        println r;
    }

    public void modulus(int a, int b) {
        double r = (double) a % (double) b;
        println r;
    }
}

Calculator c = new Calculator();

int a = 3;
int b = 2;

c.add(a, b);
c.subtract(a, b);
c.multiply(a, b);
c.divide(a, b);
c.modulus(a, b);

