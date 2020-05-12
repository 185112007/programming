package com.javarush.task.task17.task1707;

public class IMF {
	private static IMF imf;
    private static Object lock = new Object();
    
    public static IMF getFund() {
     
        synchronized(lock){
            if(imf==null){
                imf = new IMF();
            }
        }
        return imf;
    }

    private IMF() {
    }
}
