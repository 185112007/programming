package design_patterns.course._05_builder.source;

public interface CoordinateBuilder
{
    Coordinate build();

    CoordinateBuilder setX(final int x);

    CoordinateBuilder setY(final int y);
}
