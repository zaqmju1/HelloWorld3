package Hello;

public class HelloMain {

    // Print program
    public static void main(String[] args) {
        
        System.out.println("Here ye : important announcement -- on branch ");
        
        System.out.println("Hello World");
        
        // Alice addition
        System.out.println("Hi Alice");
        // Bob's addition
        System.out.println("Hi Bob");
        
        // Charlie addition
        System.out.println("Hi Charlie");
        // Denise's addition
        System.out.println("Hello Denise");
        
        // Display free memory
        int mb = 1024*1024;
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Current free memory:" + runtime.freeMemory() / mb);
        
        // Added content
        System.out.println("Goodbye");
    }

}
