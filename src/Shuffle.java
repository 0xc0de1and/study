public class Shuffle {
    public static void main(String[] args) {
        int[] shuffle = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 100; j++) {
                int rand = (int) (Math.random() * 10);
                int tmp = shuffle[0];
                shuffle[0] = shuffle[rand];
                shuffle[rand] = tmp;
            }

            for (int j = 0; j < 10; j++) {
                System.out.print(shuffle[j]);
            }
            System.out.println();
        }
    }
}
