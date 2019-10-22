class Pd4car3 {
    public static void main(String[] args) {
        Car car1, car2;
        car1 = new Car(1234, 25.5);
        car2 = new Car(6789, 40);
        car1.show();
        car2.show();
        car1.moveGas(car2);
        car1.show();
        car2.show();
        car2.setCar(15.5);
        car2.moveGas(car1);
        car1.show();
        car2.show();
    }
}

class Pd4data1 {
    public static void main(String[] args) {
    Data ins1, ins2;
    //インスタンスを生成する
    ins1 = new Data(4, "foo");
    ins2 = new Data(10, "bar");
    //情報を出力してみる
    ins1.show();
    ins2.show();
    //add を実行して出力してみる
    ins1.add(ins2);
    ins1.show();
    }
}

class Pd4note1 {
    public static void main(String[] args) {
        Notepad ins1, ins2;
        //2つインスタンスを作って内容を確認する
        ins1 = new Notepad("title1", "note1");
        ins2 = new Notepad("title2", "note2");
        ins1.show();
        ins2.show();
        //addで結合して結果を確認する
        ins1.add(ins2);
        ins1.show();
    }
}
