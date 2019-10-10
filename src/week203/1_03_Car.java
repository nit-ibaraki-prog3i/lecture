class Car {
    private int num;
    private double gas;
    
    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("車を作成しました。（引数付き）");
    }
    public void show() {
        System.out.println("num: " + num);
        System.out.println("gas: " + gas);
    }
    public void setCar(int n) {
        num = n;
        System.out.println("numを設定します。");   
    }
    public void setCar(double g) {
        gas = g;
        System.out.println("gasを設定します。");
    }
    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("numとgasを両方設定します。");
    }
}

class Pd3car1 {
    public static void main(String[] args) {
        Car car1, car2;
        car1 = new Car();
        car1.show();
        car2 = new Car(6789, 40);
        car2.show();

        car1.setCar(1234);
        car1.show();
        car2.setCar(30.5);
        car2.show();
        car1.setCar(4567, 10.5);
        car1.show();
    }
}

