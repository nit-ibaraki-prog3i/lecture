class Pd5car2 {
    public static void main(String[] args) {
        Date d1, d2; Car c1;
        d1 = new Date(2015, 5, 15);
        d2 = new Date(2017, 5, 15);

        c1 = new Car(1234, 50); c1.show();
        c1.setBuyDate(d1);
        c1.setExpireDate(d2); c1.show();

        d1 = c1.getExpireDate2();
        d1.setYMD(2020, 5, 15); c1.show();
        d1 = c1.getExpireDate();
        d1.setYMD(2015, 4, 24); c1.show();
    }
}

class Pd5data1 {
    public static void main(String[] args) {
        Data ins1, ins2;
        Add add1;
        //インスタンスを生成する
        ins1 = new Data(4, "foo");
        ins2 = new Data(10, "bar");
        add1 = new Add();
        //インスタンスの参照を引数で渡す
        add1.setD1(ins1);
        add1.setD2(ins2);
        add1.show();
    }
}

class Pd5data2 {
    public static void main(String[] args) {
        Data ins1, ins2;
        Add add1;
        //インスタンスを生成する
        ins1 = new Data(4, "foo");
        ins2 = new Data(10, "bar");
        add1 = new Add();        
        add1.setD1(ins1);
        add1.setD2(ins2);
        add1.show();
        //以降は課題5-3で使う
        //add1 の d1 と d2 の参照入れ替える 
        //add1.swap();
        //add1.show();
    }
}

class Pd5data3 {
    public static void main(String[] args) {
        Data ins1, ins2;
        Add add1;
        //インスタンスを生成する
        ins1 = new Data(4, "foo");
        ins2 = new Data(10, "bar");
        add1 = new Add();        
        add1.setD1(ins1);
        add1.setD2(ins2);
        add1.show();
        //addD1D2でインスタンスを結合する
        Data ins3 = add1.addD1D2();
        ins3.show();
        add1.show();
    }
}
