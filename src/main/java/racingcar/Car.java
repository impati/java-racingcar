package racingcar;

public class Car {

    private int distance;
    private String name;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }
    public int getDistance() {
        return distance;
    }

    public void forward() {
        distance++;
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(distance + 1);
    }
}
