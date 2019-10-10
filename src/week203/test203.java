//ここに番号と名前

class Pd3test {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();
        car1.show(2);     //表示1
        car1.show(1);     //表示2
        car1.setCar();
        car1.show(3);     //表示3
        car1.setCar(-1);
        car1.show(2);     //表示4
        car1.setCar(41);
        car1.show(2);     //表示5
        car1.setCar(40);
        car1.show(3);     //表示6
    }
}
