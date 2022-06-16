//[//]: # (4. Create a package called **carShop**. Inside **carShop** create a
//        new class called **Car**. Make instance fields that can't be accessed outside **Car**.)
//

public class Car {
    public static void main(String[] args) {

    }
    String model = null;
    String make = null;
    String color = null;
    Integer year = null;

    public Car(String model, String make, String color, Integer year) {
        this.model = model;
        this.make = make;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
//        [//]: # (   These fields should be of type `String` named `model`, `make`, `color`,
//        and an `int` named `year`. Create a constructor that sets the `model`, `make`, `color`, and `year`. Write
//        getters and setters for each property.&#40;Remember we can generate these by right clicking -> 'Generate' ->
//        Getters and Setters&#41;)
//
//        [//]: # (5. Inside **carShop** create another class called **Customer** and make
//        instance fields that can't be accessed outside **Customer**,)
//
//        [//]: # (   these fields should be string called `firstName` and `lastName`.
//        Create a constructor that sets)
//
//        [//]: # (   `firstName` and `lastName`. Write getters and setters for each property.)