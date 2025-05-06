package org.example.util;

import java.util.concurrent.atomic.AtomicLong;

public class GeneradorID {
    private final static AtomicLong atomicLong = new AtomicLong(0);

    public static long generacionId(){
        return atomicLong.incrementAndGet();
    }
}
