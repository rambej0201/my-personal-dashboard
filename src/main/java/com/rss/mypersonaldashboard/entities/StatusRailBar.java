package com.rss.mypersonaldashboard.entities;

import java.util.List;

public class StatusRailBar {

    List<DashboardStatus> dashboardStatusList;

    public StatusRailBar(List<DashboardStatus> dashboardStatusList) {
        this.dashboardStatusList = dashboardStatusList;
    }

    public List<DashboardStatus> getDashboardStatusSampleList() {
        return dashboardStatusList;
    }
}
