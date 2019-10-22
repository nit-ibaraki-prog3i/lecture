class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
    }
    public Car(int n, double g) {
        num = n;
        gas = g;
    }
    public void show() {
        System.out.println("(num)" + num + " (gas)" + gas);
    }
    public void setCar(int n) {
        num = n;
    }
    public void setCar(double g) {
        gas = g;
    }
    public void setCar(int n, double g) {
        num = n;
        gas = g;
    }
    public int compareGas(Car c) {
        int result = 0;
        if(this.gas > c.gas) result = 1;
        if(this.gas < c.gas) result = -1;
        if(this.gas == c.gas) result = 0;
        return result;
    }
}

class Pd4car1 {
    public static void main(String[] args) {
        Car car1, car2;
        car1 = new Car(1234, 25.5);
        car2 = new Car(6789, 40);
        car1.show();
        car2.show();

        car2 = car1;
        car1.show();
        car2.show();

        car1.setCar(4567, 10.5);
        car1.show();
        car2.show();

        //car2 = null;
        //car2.show();

        car2 = new Car(6789, 40);        
        System.out.println("compareGasの結果: " + car1.compareGas(car2));
        System.out.println("compareGasの結果: " + car2.compareGas(car1));
        car1.setCar(40.0);
        System.out.println("compareGasの結果: " + car1.compareGas(car2));
    }
}

