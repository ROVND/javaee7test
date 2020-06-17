package com.hongdy.code;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.batch.runtime.JobExecution;
import java.util.Properties;

import static javax.batch.runtime.BatchRuntime.getJobOperator;

public class Main {

    public void test1(){
        BatchRuntime.getJobOperator().start("myJob", new Properties());
        JobOperator jobOperator = getJobOperator();
        Long executionId = jobOperator.start("myJob", new Properties());
        JobExecution jobExecution = jobOperator.getJobExecution(executionId);
        System.out.println();
        //https://blog.csdn.net/dnc8371/article/details/106704196
    }
}
