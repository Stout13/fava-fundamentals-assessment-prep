public interface Describable {
//    [//]: # (6. Create an interface named **Describable**)
//

public static String describe(Customer customer, Car ticket) {

    return "Hey there " +  customer.getFirstName() + " " + customer.getLastName() + ", it looks like your " + ticket.color +" " + ticket.year +" " + ticket.make +" " + ticket.model + " " + "is ready!";
}
//            [//]: # (   -Specify an instance method named `describe` that accepts a String 'details'
//    parameters and returns a string)
//
//            [//]: # ()
//            [//]: # (   -Make your *Customer* class implement the *Describable* interface)
//
//            [//]: # ()
//            [//]: # (   -The implementation of the `describe` method on the Customer class should
//            return something like the following message:)
//            ```
//    Hey there firstName lastName, it looks like your color, year, make, model is ready to go!`
//            ```

}