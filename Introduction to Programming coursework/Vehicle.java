public class Vehicle implements Comparable<Vehicle> {
    public String type;
    public double speed;

    public Vehicle() {
        this.type = "bicycle";
        this.speed = 20.0;
    }

    public Vehicle(String type, double speed) {
        this.type = type;
        this.speed = speed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void speedUp() {
        this.speed = this.speed * 2;
    }

    public void speedDown() {
        this.speed = this.speed / 2;
    }

    @Override
    public int compareTo(Vehicle other) {
        int comparison = (int) Math.ceil(this.speed - other.speed);
        if (comparison == 0) {
            comparison = this.type.compareTo(other.type);
        }
        return comparison;
    }
}