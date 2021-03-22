package com.rss.mypersonaldashboard.services;

import com.rss.mypersonaldashboard.entities.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DashboardServiceImpl implements DashboardService {

    List<DashboardStatus> dashboardStatusList;

    public DashboardServiceImpl() {

        dashboardStatusList = new ArrayList<>();
        for (int y = 0; y < 4; y++){
            try{
                dashboardStatusList.add(new DashboardStatus("environmentStatus"+String.valueOf(y), "03/12/2021", "03/12/2021"));
                dashboardStatusList.add(new DashboardStatus("devOne"+String.valueOf(y), "03/12/2021", "03/16/2021"));
                dashboardStatusList.add(new DashboardStatus("qualityAssuranceStatus"+String.valueOf(y), "03/17/2021", "03/19/2021"));
                dashboardStatusList.add(new DashboardStatus("prodStatus"+String.valueOf(y), "03/20/2020", "03/19/2021"));

            } catch (Exception exception){
                exception.printStackTrace();
            }
        }

    }

    @Override
    public StatusRailBar currentDashboardRail() {
        StatusRailBar statusRailBar = new StatusRailBar(dashboardStatusList);
        return statusRailBar;
    }

}
