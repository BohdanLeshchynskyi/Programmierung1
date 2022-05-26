package tv;

class Pixel {
    private String pixel;
    boolean on;

    Pixel(String pixel) {
        this.pixel = pixel;
    }

    @Override
    public String toString() {
        return on ? pixel : " ";
    }
}
