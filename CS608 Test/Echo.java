public class Echo {
    public static void main (String[] args) {
        for (String s: args) {
            System.out.println(s);
        }
    }
}

/*
 * 
 * javac Echo.java
 * java Echo Drink Hot Java
    Drink
    Hot
    Java
 *
 * java Echo "Drink Hot Java"
    Drink Hot Java
 * 
 * 
 * javadoc Echo.java 
 * javap -c Echo.class
 * javap -c Echo.class >Bytecode.bc

 */