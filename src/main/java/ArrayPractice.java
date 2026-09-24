public class ArrayPractice {
    public static void main(String[] args) {
        String[] browsers = {"Chrome", "Firefox", "Edge", "Safari"};

        // Пройдемся по массиву с помощью цикла
        for (int i = 0; i < browsers.length; i++) {
            System.out.println("Браузер: " + (i + 1) +" " + browsers[i]);
        }
    }
}