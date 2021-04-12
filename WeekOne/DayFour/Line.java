public class Line {

    public Line(double first, double second, double third, double fourth) {
        
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;

    }

    public double getSlope() {

        if (first == second) {

            throw new ArithmeticException();

        }
        return (fourth - third) / (second - first);
    }

    public double getDistance() {
        return Math.sqrt((second - first) * (second - first) + (fourth - third) * (fourth - third));
    }

    public boolean parallelTo(Line l) {
        if (Math.abs(getSlope() - l.getSlope()) < .0001)
            return true;
        return false;
    }

    private double first, second, third, fourth;
}