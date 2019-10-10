class Pd3car2 {
    public static void main(String[] args) {
        //コンストラクタの動作確認
        Car car1, car2;
        car1 = new Car(10.5);
        car1.show();
        car2 = new Car(-15.0);
        car2.show();
        //引数なしsetCarの動作確認
        car1.setCar();
        car1.show();
    }
}

class Pd03calc {
    public static void main(String[] args) {
        //コンストラクタの動作確認
        Calc c3, c4;
        c3 = new Calc();
        c3.show();
        c4 = new Calc(100, 200);
        c4.show();
        //setX, setYの動作確認
        c3.setX();
        c4.setY();
        c3.show();
        c4.show();
    }
}

class Pd03person {
    public static void main(String[] args) {
        //クラスPersonの動作確認
        Person p1, p2;
        p1 = new Person("Steve", 56);
        p2 = new Person();
        p1.speak();
        p2.speak();
    }
}
