public class Driver {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 4, "Labrador");
        Cat cat = new Cat("Whiskers", 2, true);

        Vet vet = new Vet("Dr. Murphy");

        vet.vaccinate(dog);
        vet.vaccinate(cat);
    }
}
