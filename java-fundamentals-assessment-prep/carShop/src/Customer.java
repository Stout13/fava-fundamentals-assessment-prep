public class Customer implements Describable{
    public static void main(String[] args) {

    }

    public Customer(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    private String firstName = null;
    private String lastName = null;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
//        [//]: # (5. Inside **carShop** create another class called **Customer** and make
//        instance fields that can't be accessed outside **Customer**,)
//
//        [//]: # (   these fields should be string called `firstName` and `lastName`.
//        Create a constructor that sets)
//
//        [//]: # (   `firstName` and `lastName`. Write getters and setters for each property.)

