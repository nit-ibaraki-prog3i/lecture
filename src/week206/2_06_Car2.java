class Car {
    protected int num;
    private double gas;

    public Car() {
        num = 0; gas = 0.0;
    }
    public void setNum(int n) {
        num = n;
    }    
    public int getNum() {
        return num;
    }
    public void setGas(double g) {
        if(g >0  && g < 1000 ) {
            gas = g;
        } else {
            System.out.println("setGas: Out of range.");
        }
    }
    public double getGas() {
        return gas;
    }
    public void show() {
        System.out.println("show: (num) " + num + " (gas) " + gas);
    }
}

class RacingCar extends Car {
    private int course;
    public int getCourse() {
        return course;
    }
    public void setCourse(int c) {
        course = c;
    }
    public void show2() {
        System.out.println("show2: (num) " + num //+ " (gas) " + gas
                + " (course) " + course);
    }
}

class Pd6car2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setGas(500);
        c1.setGas(-100);
        c1.setNum(5678); c1.show();        
        RacingCar rc1 = new RacingCar();
        rc1.setCourse(7);
        rc1.setNum(1234);
        rc1.setGas(-200);
        rc1.setGas(300);
        rc1.show();
        rc1.show2();
    }
}
