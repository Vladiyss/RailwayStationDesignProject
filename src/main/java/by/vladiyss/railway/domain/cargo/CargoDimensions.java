package by.vladiyss.railway.domain.cargo;

import by.vladiyss.railway.Runner;

public class CargoDimensions {

    private final double length;
    private final double width;
    private final double height;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public CargoDimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        Runner.logger.debug("Created --- " + this.toString());
    }

    public CargoDimensions(CargoDimensions cargoDimensions) {
        this.length = cargoDimensions.getLength();
        this.width = cargoDimensions.getWidth();
        this.height = cargoDimensions.getHeight();
        Runner.logger.debug("Created --- " + this.toString());
    }

    public double getArea() {
        return length * width;
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "CargoDimensions: " + "length=" + length + ", width=" + width + ", height=" + height + '.';
    }
}
