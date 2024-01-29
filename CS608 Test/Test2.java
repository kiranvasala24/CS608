public class Test2 {
    public static int sum_for(int n) {
               int i = 0, sum = 0;
               for (i = 0; i <= n; i++) {
                     sum += i;
                }
     return sum;
    }
    public static void main(String[] args) {
            System.out.println("Number: " + sum_for(3) + "\n");
         }
}

/* BYTECODE GENERATOR
 *  javap -c Test2.class
    Create a file named Bytecode.bc   
    javap -c Test2.class > Bytecode.bc
 */