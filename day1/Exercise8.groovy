// Write a program that read a (arbitrarily long) sequence of positive numbers. 
// The sequence is ended when the users enters “-1”. At that point, the program must output
// the highest number in the sequence.

int highest = -1;

while (true) {
    print "Enter a number (type -1 to exit): ";
    String s = System.console().readLine();
    
    int current = Integer.parseInt(s);
    
    if (current == -1) {
        break;
    } else if (current > highest) {
        highest = current;
    }
}

println "Highest number is: " + highest;
