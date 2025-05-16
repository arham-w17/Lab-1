public class Multiples {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    counter++;
                }
                else if (i % 5 == 0) {
                    counter++;
                }

        }
        System.out.println(counter);
    }
}
