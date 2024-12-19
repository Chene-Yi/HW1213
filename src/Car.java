class CarException extends Exception {
}


public class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0;
        System.out.println("已生產了汽車");
    }

    public void setCar(int n, double g) throws CarException {
        if (g < 0) {
            CarException e = new CarException();
            throw e;
        } else {
            num = n;
            gas = g;
            System.out.println("將車號設定為：" + num + "，汽油量設定為：" + gas);
        }
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}
