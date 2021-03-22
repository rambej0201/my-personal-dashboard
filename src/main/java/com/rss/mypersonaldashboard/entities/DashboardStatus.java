package com.rss.mypersonaldashboard.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DashboardStatus {
    private String name;
    private String startDateStr;
    private String endDateStr;
    private Date startDate;
    private Date endDate;
    private String startDateStrOne;
    private String endDateStrOne;


    public DashboardStatus(String name, String startDateStr, String endDateStr) throws ParseException {
        this.name = name;
        this.startDateStr = startDateStr;
        this.endDateStr = endDateStr;
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        startDate = formatter.parse(startDateStr);
        endDate = formatter.parse(endDateStr);
        startDateStrOne = formatter.format(startDate);
        endDateStrOne = formatter.format(endDate);
    }

    public String getName() {
        return name;
    }

    public String getStartDateStrOne() {
        return startDateStrOne;
    }

    public String getEndDateStrOne() {
        return endDateStrOne;
    }
}
