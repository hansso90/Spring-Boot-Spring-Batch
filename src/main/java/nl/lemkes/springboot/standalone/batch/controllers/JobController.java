package nl.lemkes.springboot.standalone.batch.controllers;

import nl.lemkes.springboot.standalone.batch.service.JobService;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.*;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Hans on 6-9-2016.
 */
@Controller
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public void start() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException
    {
       jobService.startUselessJob();
    }

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public BatchStatus status() throws NoSuchJobException {
        //Set<Long> runningExecutions = jobOperator.getRunningExecutions(exampleJob.getName());
       // return jobExplorer.getJobExecution(runningExecutions.iterator().next()).getStatus();
        return null;
    }

    @RequestMapping(value = "/stop", method = RequestMethod.GET)
    public void stop() throws NoSuchJobExecutionException, JobExecutionNotRunningException, NoSuchJobException
    {
        //Set<Long> executions = jobOperator.getRunningExecutions("");
        //jobOperator.stop(executions.iterator().next());
    }
}
