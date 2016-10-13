class BrazilCoffee {
    String origin;
    int degreeOfRoast;
    int grade;
    BrazilCoffee(String o) {
        origin=o;
    }
    public void roast() {
        System.out.println("roasting..."+origin);
    }
    public void grind() {
        System.out.println("grinding..."+origin);
    }
    public void brew() {
        System.out.println("brewing..."+origin);
    }
}
