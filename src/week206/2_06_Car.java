class Car {
    public int num;
    private double gas;

    public Car() {
        num = 0; gas = 0.0;
    }
    private void setNum(int n) {
        num = n;
    }    
    public int getNum() {
        return num;
    }
    public void setGas(double g) {
        if(g >0  && g < 1000 ) {
            gas = g;
        } else {
            System.out.println("Out of range.");
        }
    }
    public double getGas() {
        return gas;
    }
    public void show() {
        System.out.println("(num)" + num + " (gas)" + gas);
    }
}

class Pd6car1 {
    public static void main(String[] args) {
        Car c1 = new Car(); c1.show();
        c1.setGas(500); c1.show();
        c1.setGas(-100); c1.show();

        c1.num = 1234;
        //c1.setNum(5678); //Error 
        c1.show();
    }
}
