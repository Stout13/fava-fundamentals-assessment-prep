public class DealershipApp {
    public static void main(String[] args) {
        Car ford = new Car("Mustang", "Ford", "red", 1998);
        Customer Bob = new Customer("Bob", "Dole");
        System.out.println(Describable.describe(Bob, ford));
    }
}
