class SquareOfNum {
    int num = 25, sq;
    void square() {
        sq = num * num;
        System.out.println(sq);
    }
}

class SquareOfNumApp {
    public static void main(String[] args) {
        SquareOfNum sqnum = new SquareOfNum();
        sqnum.square();
    }
}
