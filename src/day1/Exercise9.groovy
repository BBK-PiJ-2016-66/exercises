// Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered.
// At that point, print ”Yes” if the numbers were consecutive and increasing and ”No” otherwise.
// Sequences ”1,2,3,4,-1” and ”5,6,7,8,9,10,11,-1” should output ”Yes”, but ”2,3,5,6,7,-1”,
// ”10,9,8,7,-1”, and ”1,1,2,3,4,5,-1” should output ”No”.

Boolean increasing = false;

print "Enter a number: ";
String s = System.console().readLine();

int previous = Integer.parseInt(s);

while (true) {
    print "Enter next number (type -1 to exit): ";
    s = System.console().readLine();
    
    int current = Integer.parseInt(s);
    
    if (current == -1) {
        break;
    } else if (current == previous + 1) {
        previous = current;
        increasing = true;
    }
}

println increasing ? "Yes" : "No";
