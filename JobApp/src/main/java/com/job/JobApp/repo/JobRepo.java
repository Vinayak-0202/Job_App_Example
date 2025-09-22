package com.job.JobApp.repo;

import com.job.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    private List<JobPost> jobs = new ArrayList<>(Arrays.asList(
       new JobPost(101,"Java Developer","Must Have good Experience in core Java",2,new ArrayList<String>(Arrays.asList("java","Python"))))
    );

    public List<JobPost> getAllJobs(){
        System.out.println("Inside the jobRepo getAllJobs().");
        return jobs;
    }

    public void addJob(JobPost job){
        System.out.println("Inside the addJob() in Repo.");
        jobs.add(job);
    }
}
