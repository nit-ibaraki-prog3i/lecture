//ここに番号と名前

class Length {
    protected int height; //高さ
    protected int width;  //幅
    //heightのアクセッサ
    public void setHeight(int h) {
        height = h;
    }
    public int getHeight() {
        return height;
    }
    //widthのアクセッサ
    public void setWidth(int w) {
        width = w;
    }
    public int getWidth() {
        return width;
    }
}

class Pd6Length {
    public static void main(String[] args) {
        //四角形のインスタンスで面積を求める
        Rectangle r1 = new Rectangle();
        r1.setHeight(10);
        r1.setWidth(20);
        r1.area();
        //三角形のインスタンスで面積を求める
        Triangle t1 = new Triangle();
        t1.setHeight(30);
        t1.setWidth(15);
        t1.area();
    }
}
