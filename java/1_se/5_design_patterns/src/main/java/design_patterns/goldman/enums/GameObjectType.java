package design_patterns.goldman.enums;

// Mevcut oyun nesnesi türlerini tanımlayan numaralamalar.

import java.io.Serializable;

// Numaralandırma, sınırlı sayıda nesne türünü tanımlamanız gerektiğinde kullanılır.
/**
 * Oyuna katılan nesne türleri (haritada çizilecektir)
 */
public enum GameObjectType implements Serializable{

    MONSTER(5),
    TREASURE(4),
    EXIT(3),
    WALL(2),
    GOLDMAN(1),
    NOTHING(-1);

    private GameObjectType(int indexPriority) {
        this.indexPriority = indexPriority;
    }
    
    private int indexPriority;// Aynı karede birden fazla nesne varsa, haritada önceliği görüntülemek için dizin

    public int getIndexPriority() {
        return indexPriority;
    }
    
}
