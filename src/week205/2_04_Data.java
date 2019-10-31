//整数と文字列の値を持つクラス
class Data {
    private int num;
    private String str;
    //引数付きコンストラクタ
    public Data(int n, String s) {
        num = n;
        str = s;
    }
    //フィールドを出力する
    public void show() {
        System.out.printf("num: %d, str: %s\n", num, str);
    }
    //フィールドを結合する
    public void add(Data d) {
        num = num + d.num;
        str = str + d.str;
    }
}

//動作を確認するクラス
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
