package immutablepro;

public final class CreateImmutable {

    private final String name;
    private final int regNo;
    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }


   // To create an immutable class in Java, you must ensure that its state cannot be modified after object creation
   /*Custom Immutable Class: To build a custom immutable class from scratch,
            you must execute the following requirements:
            Declare class as final to prevent child classes from overriding behavior.
            Make all fields private and final so they are inaccessible directly and initialized only once.
            Provide no setter methods to block modification after construction.
            Perform defensive copies on any mutable argument (like collections) in the constructor and getter methods*/
    public CreateImmutable(String name, int regNo) {
        this.name = name;
        this.regNo = regNo;
    }

}
