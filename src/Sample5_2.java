public class Sample5_2 {
    public static void main(String[] args) {
        try {
            int[] test;
            test = new int[5];

            System.out.println("將值指定給test[10]");

            test[10] = 80;
            System.out.println("將80指定給test[10]");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of the range");
        }

        System.out.println("execute smoothly");
    }
}
