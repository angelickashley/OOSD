public class Vet {
    private String name;

    public Vet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void vaccinate(Animal animal) {
        System.out.println(name + " is vaccinating.");

        if (animal instanceof Dog) {
            System.out.println("Dog has been vaccinated: " + animal);
        }
        if (animal instanceof Cat) {
            System.out.println("Cat has been vaccinated: " + animal);
        }
    }
}
