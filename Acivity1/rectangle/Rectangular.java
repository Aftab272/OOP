class Rectangular {
    private int length, width;

    public Rectangular() {
        length = 5;
        width = 2;
    }

    public Rectangular(int l, int w) {
        length = l;
        width = w;
    }

    public void setlength(int l) {
        length = l;
    }

    public void setwidth(int w) {
        width = w;
    }

    public int getlength() {
        return length;
    }

    public int getwidth() {
        return width;
    }

    public int area() {
        return (length * width);
    }
}
