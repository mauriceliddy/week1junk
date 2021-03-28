public class App{

    public static void main(String[] args) {
        System.out.println("hello World");
        doSomething("Maurice");
    }
   
    /**
     * 
     * @param name
     */
    public static void doSomething(String name) {
        System.out.println("Doing something now: " + name);
        
    }
 // second method in the second branch, called 
 public static void branchMethod(){
    System.out.println("Nothing going on in here really..");
}

   }