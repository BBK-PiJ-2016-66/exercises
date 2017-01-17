/*
2  Checking arrays

Create a new Java class called ArrayChecker with two methods:

isSymetrical(int[ ): ] a method that returns true if the array of int provided as argument is symmetrical and false otherwise.

reverse(int[ ): ] a method that takes an array of int and returns another array of int of the same size and with the same numbers, but in opposite order.

Write a Groovy script that creates an object of class ArrayChecker and uses its methods to check whether a few arrays are symmetrical and, if they are not, reverses them.
*/

ArrayChecker checker = new ArrayChecker();

int[][] a = [
    [1, 2, 3, 4, 5, 6],
    [8, 5, 2, 2, 5, 8],
    [1, 2, 3, 2, 1],
    [1, 1],
    [1]
];

for (int i = 0; i < a.length; i++) {
    if (checker.isSymetrical(a[i])) {
        println "Array is symetric";
    } else {
        int[] b = checker.reverse(a[i]);
        print "Array [";
        for (int j = 0; j < b.length; j++) {
            print b[j] + ", ";
        }
        print "] is not symetric.";
    }
}
