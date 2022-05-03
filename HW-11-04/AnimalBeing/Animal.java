package AnimalBeing;

public class Animal {

    String type;
    double weight;
    String name;

    public Animal() {
    }

    public Animal(String type, double weight, String name) {
        this.type = type;
        this.weight = weight;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
