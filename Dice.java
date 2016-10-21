class Dice {
    private int number = 0;
    public void roll() {   
        number = (int) (Math.random() * 6+1);
        System.out.println("Turn on " + number);
    }
    public int getNum() {
        return this.number;
    }
}