/*
3  Binary and decimal

Create a program in which you define the following methods:

power(int, int):
Takes a base "b" and an exponent "e" from the user, and returns the result of b**e.

power2(int):
Takes an exponent "e" from the user and returns the result of 2**e. This method must call the previous one to find out the result.

binary2decimal(String):
Takes from the user a binary number (with digits 0 and 1) and returns the corresponding
number in decimal (base-10, with digits between 0 and 9). 
This method must call the previous one to find out the result.

decimal2binary(int):
The opposite of the previous one: takes a decimal number and returns the corresponding
binary number. Hint: instead of multiplying by 2, you will need to divide by two this time 
(the quotients and the last remainder will give you the binary number).

The program must offer a menu to the user with two options. The first one takes a binary number from the
user and returns the corresponding decimal number. The second one does the opposite: takes a decimal number
and returns a binary number. The program should use the methods defined.

*/

int power(int b, int e) {
    return b ** e;
}

int power2(int e) {
    return power(2, e);
}

int binary2decimal(String b) {
    int e = b.length() - 1;
    int r = 0;
    
    for (int i = 0; i < b.length() - 1; i++) {
        int p = b.charAt(i).parseInt(); 
        r = r + 2 ** e;
    }
}
