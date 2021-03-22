package com.rss.mypersonaldashboard.api;

import com.rss.mypersonaldashboard.entities.StatusRailBar;
import com.rss.mypersonaldashboard.services.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ControllerDashboard {
    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/home")
    public String home(){
        return "sampling the rest call setup";
    }

    @GetMapping("/currentDashboardStatusRail")
    public StatusRailBar currentDashboardStatusRail(){
        return this.dashboardService.currentDashboardRail();
    }

    /*
    @GetMapping("/testing")
    public ModelAndView currentDashBoardStatus(){
        ModelAndView mv = new ModelAndView();
        StatusRailBar st = dashboardService.currentDashboardRail();
        mv.addObject("currently", st);
        return mv;
    }
     */

}
