
public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
    //to fix this above two menthods. we will use two overridden methods and we will leave them empty.
    //now anyone choosing deluxe pizza will have automatically added above two methods.
    public void addExtraCheese(){}
    public void addExtraToppings(){}

    
}





//Extends: In Java, the extends keyword is used to indicate that the class which is being defined is derived from the base class using inheritance. So basically, extends keyword is used to extend the functionality of the parent class to the subclass. In Java, multiple inheritances are not allowed due to ambiguity.
//The super keyword refers to superclass (parent) objects. It is used to call superclass methods, and to access the superclass constructor. The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.