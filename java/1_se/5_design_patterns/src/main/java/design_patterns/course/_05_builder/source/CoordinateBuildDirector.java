package design_patterns.course._05_builder.source;

public class CoordinateBuildDirector
{
    private CoordinateBuilder builder;

    public CoordinateBuildDirector(final CoordinateBuilder builder) {
        this.builder = builder;
    }

    public Coordinate construct() {
        return builder.setX(4)
                      .setY(5)
                      .build();
    }

    public static void main(final String[] arguments) {
        final CoordinateBuilder builder = new CoordinateBuilderImpl();

        final CoordinateBuildDirector coorBuildDirector = new CoordinateBuildDirector(builder);

        System.out.println(coorBuildDirector.construct());
    }
}
