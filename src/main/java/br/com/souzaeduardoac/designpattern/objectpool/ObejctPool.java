package br.com.souzaeduardoac.designpattern.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObejctPool<T> {
    private long expirationTime;
    private Hashtable<T, Long> locked, unlocked;

    public ObejctPool() {
        expirationTime = 30000;
        locked = new Hashtable<T, Long>();
        unlocked = new Hashtable<T, Long>();
    }

    protected abstract T create();

    public abstract boolean validate(T o);

    public abstract void expire(T o);

    public synchronized T checkOut() {
        long now = System.currentTimeMillis();
        T t;
        if (unlockedHasElements()) {
            Enumeration<T> e = unlocked.keys();
            while (e.hasMoreElements()) {
                t = e.nextElement();
                if((now - unlocked.get(t)) > expirationTime) {
                    unlocked.remove(t);
                    expire(t);
                } else {
                    if(validate(t)) {
                        unlocked.remove(t);
                        locked.put(t, now);
                        return t;
                    } else {
                        unlocked.remove(t);
                        expire(t);
                    }
                }
                t = null;
            }
        }

        t = create();
        locked.put(t, now);
        return t;
    }

    private boolean unlockedHasElements() {
        return unlocked.size() > 0;
    }

    public synchronized void checkIn(T t) {
        locked.remove(t);
        unlocked.put(t, System.currentTimeMillis());
    }
}
