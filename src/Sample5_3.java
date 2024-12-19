public class Sample5_3 {
    public static void main(String[] args) {
        try {
            int[] test = new int[5];

            System.out.println("將值指定給test[10]");

            test[10] = 80;
            System.out.println("將80指定給test[10]");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of the range");
        } finally {
            System.out.println("This process will definitely be executed in the end");
        }

        System.out.println("execute smoothly");
    }
}