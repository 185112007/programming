package design_patterns.course._09_memento.source.impl;

import design_patterns.course._09_memento.source.abstracts.AbstractGameObject;
import design_patterns.course._09_memento.source.enums.GameObjectType;

public class Wall implements AbstractGameObject
{
    private GameObjectType type;

    public Wall(GameObjectType type)
    {
	this.type = type;
    }

    public GameObjectType getType()
    {
	return type;
    }
}
