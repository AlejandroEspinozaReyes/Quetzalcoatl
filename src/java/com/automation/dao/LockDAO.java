package com.automation.dao;

public class LockDAO {
    private static final int STATE_UNKNOWN = -1;  // No information gotten
    private static final int STATE_OPPEN = 1;  // Pin and Lock oppened
    private static final int STATE_UNLOCKED = 2;  // Lock oppened pin closed
    private static final int STATE_LOCKED = 3;  // Pin and Locker closed
    private static final int STATE_MOVING = 4;

    private static Integer state = -1;

    public Integer getLockState() {
        return LockDAO.state;
    }

    public void setLockState(Integer state) {
        if (state < 0 || state > STATE_MOVING) {
            LockDAO.state = STATE_UNKNOWN;
        }

        LockDAO.state = state;
    }
}