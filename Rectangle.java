class Rectangle {
    private int width;
    private int height;
    public Rectangle(int w, int h) {
        this.width=w;
        this.height=h;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int newHeight) {
        height= newHeight;
    }
    public void setWidth(int newWidth) {
        width = newWidth;
    }
    public void setSize(int w, int h) {
        setWidth(w);
        setHeight(h);
    }
    public int calcArea() {
        return width*height;
    }
}
Rectangle r=new Rectangle(3,5);
r.calcArea();
System.out.println("Area: "+r.calcArea());

r.setSize(3,7);
System.out.println("Area: "+r.calcArea());