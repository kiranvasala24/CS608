public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("Number of Command Line Argument = "+args.length);
        for(int i = 0; i< args.length; i++) {
        System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
        }
    }
}
    

/*
 * javac CommandLineArguments.java
 * java CommandLineArguments "A" "B" "C"
 * Number of Command Line Argument = 3
 * Command Line Argument 0 is A
 * Command Line Argument 1 is B
 * Command Line Argument 2 is C
 * 
 */