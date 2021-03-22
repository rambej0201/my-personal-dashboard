package com.rss.mypersonaldashboard.entities;

import java.util.Calendar;

public class Dashboard {
    private StatusRailBar statusRailBar;
    private Calendar calendar;

    public Dashboard(StatusRailBar statusRailBar, Calendar calendar) {
        this.statusRailBar = statusRailBar;
        this.calendar = calendar;
    }

    public StatusRailBar getStatusRailBar() {
        return statusRailBar;
    }

    public void setStatusRailBar(StatusRailBar statusRailBar) {
        this.statusRailBar = statusRailBar;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
