class Car {
    private int num;
    private double gas;

    public void show() {
        System.out.println("num: " + num);
        System.out.println("gas: " + gas);
    }

    public void setNum(int n) {
        num = n;
        System.out.println("ナンバーを" + num + "にしました。");
    }

    public int getNum() {
        System.out.println("ナンバーを返します。");
        return num;
    }
}

class Pd02car1 {
    public static void main(String[] args) {
        Car car1, car2;
        car1 = new Car();
        car2 = new Car();

        car1.show();
        car2.show();

        car1.setNum(1234);
        car1.show();
        car2.show();

        car2.setNum(5678);
        System.out.println("car2のnum: " + car2.getNum());
    }
}
