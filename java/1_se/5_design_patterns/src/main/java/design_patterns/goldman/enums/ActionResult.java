package design_patterns.goldman.enums;

/**
 * Bir oyuncu haritada hareket ettikten sonra ortaya çıkabilecek eylem türleri
 */
public enum ActionResult {

    NO_ACTION,// hiçbir şey olmuyor
    DIE,// oyuncu ölür
    WIN,// oyuncu kazandı
    MOVE,// oyuncu hareketi
    COLLECT_TREASURE// altın topladı
}
