public class Task2 {
    public static void main(String[] args) {
        String str = "Hello";
        char[] chars = str.toCharArray();
        char symbol = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (chars[i] == chars[j] & i != j) {
                    symbol = chars[j];
                    break;
                }
            }
        }
        System.out.println("Повторяющийся символ " + symbol);
    }
}
