public class Letter {
    // instance variables
    /* none yet */

    // constructor; since there are no instance variables to initialize,
    // this constructor has no parameters and has an empty body: { }
    String f;
    public Letter(String from) {
        f=from;
     }
    
    public void writeLetter(String n){
        greeting(n);
        specialMessage();
        closing();
        System.out.println("From, " + f);
    }
            

    public void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!");
    }
}