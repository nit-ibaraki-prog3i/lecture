class Pd02calc {
    public static void main(String[] args) {
        Calc c1, c2;
        c1 = new Calc();
        c2 = new Calc();
        c1.setX(100); c1.setY(200);
        c2.setX(5); c2.setY(30);
        c1.show();
        c2.show();
        System.out.println("c1のx: " + c1.getX());
        System.out.println("c2のy: " + c2.getY());        
    }
}
