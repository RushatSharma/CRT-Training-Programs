class ConstructorOverloading {
    int x;
    int y;

    ConstructorOverloading() {
        x = 0;
        y = 0;
    }

    ConstructorOverloading(int xVal, int yVal) {
        x = xVal;
        y = yVal;
    }

    void displayPoint() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        ConstructorOverloading p1 = new ConstructorOverloading();
        ConstructorOverloading p2 = new ConstructorOverloading(5, 10);

        p1.displayPoint();
        p2.displayPoint();
    }
}
