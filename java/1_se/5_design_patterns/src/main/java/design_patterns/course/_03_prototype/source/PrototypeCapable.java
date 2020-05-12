package design_patterns.course._03_prototype.source;

public interface PrototypeCapable
{
    public PrototypeCapable shallowCopy();
    public PrototypeCapable deepCopy();
}
