public class App {
    public static void main(String[] args) {

        double[] array = new double[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;

        for (double v : array) {
            if (max < v)
                max = v;
            if (min > v)
                min = v;
            avg += v / array.length;
        }

        System.out.println("Максимальное значение " +  String.format("%.2f",max));
        System.out.println("Минимальное значение " + String.format("%.2f",min));
        System.out.println("Среднее значение " + String.format("%.2f",avg));
    }
}
