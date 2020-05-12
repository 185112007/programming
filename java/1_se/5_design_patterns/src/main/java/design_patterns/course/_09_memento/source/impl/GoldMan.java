package design_patterns.course._09_memento.source.impl;

import design_patterns.course._09_memento.source.abstracts.AbstractGameObject;
import design_patterns.course._09_memento.source.enums.GameObjectType;

public class GoldMan implements AbstractGameObject
{
    private GameObjectType type;

    public GoldMan(GameObjectType type)
    {
	this.type = type;
    }

    public GameObjectType getType()
    {
	return type;
    }
}
