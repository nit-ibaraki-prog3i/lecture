class Car {
    private int num;
    private double gas;
    private Date buydate;

    public Car() {
        num = 0; gas = 0.0;
        buydate = new Date();
    }
    public Car(int n, double g) {
        num = n; gas = g;
        buydate = new Date();        
    }
    public void setBuyDate(Date d) {
        buydate = d;
    }
    public Date getBuyDate() {
        return new Date(buydate);
    }
    public Date getBuyDate2() {
        return buydate;
    }
    public void show() {
        System.out.println("(num)" + num + " (gas)" + gas);
        System.out.print("(Buy Date)"); buydate.show();
    }
    public void setCar(int n, double g) {
        num = n; gas = g;
    }
}

class Date {
    private int year;
    private int month;
    private int day;
    public Date() {
        year = 1970; month = 1; day = 1;
    }
    public Date(int y, int m, int d) {
        year = y; month = m; day = d;
    }
    public Date(Date d) {
        this(d.year, d.month, d.day);
    }
    public void setYMD(int y, int m, int d) {
        year = y; month = m; day = d;
    }
    public void show() {
        System.out.printf("%4d/%2d/%2d\n", year, month, day);
    }
}

class Pd5car1 {
    public static void main(String[] args) {
        Date d1; Car c1;
        d1 = new Date(); d1.show();
        d1 = new Date(2015, 5, 15); d1.show();
        
        c1 = new Car(1234, 50); c1.show();
        d1 = c1.getBuyDate2();
        d1.setYMD(2013, 7, 8); c1.show();
        d1 = c1.getBuyDate();
        d1.setYMD(2015, 4, 24); c1.show();
    }
}

class Pd5car1s {
    public static void main(String[] args) {
        Date d1; Car c1;
        c1 = new Car(1234, 50); c1.show();

        d1 = new Date(2016, 5, 23);
        c1.setBuyDate(d1); c1.show();
    }
}
