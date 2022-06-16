public class review {
    //    [//]: # (1a. Make a class called review and create a public static method that takes in a double
//    called radius, so that you can find the circumference of a circle. &#40;Circumference Equation:
//    C = 2πr&#41;)
    public static void main(String[] args) {

    }

    public static double review(Double radius) {
        return 2 * Math.PI * radius;
    }
//    [//]: # (1b. make the circumference method work with integers and doubles by using method
//    overloading)

    public static double review(Integer radius) {
        return 2 * Math.PI * radius;
    }

    //    [//]: # (2. Create a public static method called `total` with two `double` parameters named
//            'bill' and 'tipPercentage'.)
    public static double total(double bill, double tipPercentage) {
        return bill + bill * tipPercentage / 100;
    }

    //    [//]: # (3. Create a public static method called `even` which takes in an int[]
//    and souts out the even numbers)
    public static void even(int[] arr) {
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.println(arr[j]);
            }
        }
    }
}

//    [//]: # (4. Create a package called **carShop**. Inside **carShop** create a
//            new class called **Car**. Make instance fields that can't be accessed outside **Car**.)
//    }
//    [//]: # (   These fields should be of type `String` named `model`, `make`, `color`,
//    and an `int` named `year`. Create a constructor that sets the `model`, `make`, `color`, and `year`. Write
//    getters and setters for each property.&#40;Remember we can generate these by right clicking -> 'Generate' ->
//    Getters and Setters&#41;)