package model.triangle;

import model.ShapeType;

public class RectangularTriangle extends Triangle {
    public RectangularTriangle(double firstCathet, double secondCathet) {
        super(ShapeType.RECTANGULAR_TRIANGLE, firstCathet, secondCathet,
                Math.hypot(firstCathet, secondCathet));
    }

    @Override
    public double getSquare() {
        return firstSide * secondSide / 2;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append("\nПервый катет: ").append(firstSide);
        builder.append("\nВторой катет: ").append(secondSide);
        builder.append("\nГипотенуза: ").append(thirdSide);
        builder.append("\nПериметр: ").append(getPerimeter());
        builder.append("\nПлощадь: ").append(getSquare());
        return builder.toString();
    }
}
