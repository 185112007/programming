package design_patterns.course._06_abstract_factory.source;

public interface AbstractFactory
{
    public StaticObject getStaticObject();
    public MovingObject getMovingObject();
}
