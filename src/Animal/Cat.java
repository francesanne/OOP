package Animal;

public class Cat extends Animal{
    final String name; //final - other way to name a cat not to be changed
    int age;

    //CONSTRUCTOR - how u create an object
    Cat(String name){ //set private so that name of cat can't be changed in main
        this.name=name;
    }

    public String getName(){ //public getter will allow change of name of cat even if constructor is set to private or final variable declaration
        return name;
    }
}



