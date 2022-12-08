import java.util.ArrayList;
public class Main {
    private final ArrayList<Double> coordinates;
    public Main(ArrayList<Double> coordinates) {
        this.coordinates = coordinates;
    }
    public double sumCoordinates() {
        return coordinates.stream()
                .mapToDouble(a -> a)
                .sum();
    }
    public double productCoordinates(){
        return coordinates.stream()
                .mapToDouble(a -> a)
                .reduce(1, (a, b) -> a * b);
    }
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        int n = 5;
        for (int i = 0; i < n-1; i++) {
            list.add(1+Math.random()*10);
        }
        Main complex = new Main(list);
        System.out.println(complex.sumCoordinates());
        System.out.println(complex.productCoordinates());
    }
}
