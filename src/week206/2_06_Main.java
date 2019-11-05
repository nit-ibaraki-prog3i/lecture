class Pd6Base {
    public static void main(String[] args) {
        //Baseはフィールドnumに自由に値を設定できる
        Base b1 = new Base();
        b1.setNum(12);
        b1.showNum();
        b1.setNum(5);
        b1.showNum();
        //Evenはnumに偶数のみ設定できる
        Even e1 = new Even();
        e1.setEven(12);
        e1.showNum();
        e1.setEven(5);
        e1.showNum();
        //Oddの動作確認
        Odd o1 = new Odd();
        o1.setOdd(12);
        o1.showNum();
        o1.setOdd(5);
        o1.showNum();
    }
}
