import java.util.Scanner;

public class HelloWorld {
    /*
    String getName() {

    }
    */
    public void greet() {
        String greeting = "Hello";
        System.out.println(greeting + " world!");
    }

    public static void main(String[] args) {
        System.out.println("in main");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.next();

        System.out.printf("%s", name);

        /*
        for(String a : args) {
            System.out.println(a);
        }
         */
    }
}






//This is a C program
/*

int sum(int x, int y){
    return x + y;
}

void main(char** args){
    int x;
    x = 10;
    printf("%d", x);
}


 */


/*
Java has
    modules
    packages
    class - more powerful version of c structures
    methods - Java's version of functions
 */