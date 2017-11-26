package com.automation.dao;

public class SwitchDAO {
    private static boolean state = false;

    public boolean getSwitchState() {
        return SwitchDAO.state;
    }

    public void setSwitchState(boolean state) {
        SwitchDAO.state = state;
    }
}
