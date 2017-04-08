Java:

JavaFX:
------------

In eclipse I have troubles with not having access to fx libraries - solved by going to preferencies for particular project and in build path add rule allowing access to those libraries.
More comprehensive solution would be install some e(fx)clipse plugin but it can have some side effects...i added a bookmark in browser with more information.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Interview questions:

Can we instantiate abstract class? yes we can, but it will be instance of anonymous subclass in other class
Exact answer is: - You can't instantiate your abstract class, however you can instantiate a concrete subclass of your abstract class

abstract class my {
    public void mymethod() {
        System.out.print("Abstract");
    }
}

class poly {
    public static void main(String a[]) {
        my m = new my() {};                       // here without curly brackets it is a compile error  
        m.mymethod();
    }
}

----

Class cannot be both abstract and final! Being final it cannot be subclassed.
