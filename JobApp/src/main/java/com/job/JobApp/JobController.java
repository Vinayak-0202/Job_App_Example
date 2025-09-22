package com.job.JobApp;

import com.job.JobApp.model.JobPost;
import com.job.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @RequestMapping({"/", "home"})
    public String home(){
        System.out.println("Inside Home");
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        System.out.println("Inside Add Job.");
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        System.out.println("Inside handelForm.");
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("view")
    public String viewAllJobs(Model m){
        List<JobPost>allJobs = service.getAllJobs();
        m.addAttribute("jobPosts", allJobs);
        return "viewalljobs";
    }

}
