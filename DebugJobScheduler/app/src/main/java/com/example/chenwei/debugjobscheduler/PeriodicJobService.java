package com.example.chenwei.debugjobscheduler;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import static com.example.chenwei.debugjobscheduler.MainActivity.TAG;

/**
 * Created by chenwei on 3/24/17.
 */

public class PeriodicJobService extends JobService {
    private static final int jobId = 1;
    private static final int INTERVAL_TIME = 1 * 60 * 1000; // 60s

    @Override
    public boolean onStartJob(JobParameters params) {
        Log.d(TAG, "onStartJob called");
        new AsyncTask<JobParameters, Void, JobParameters[]>() {
            @Override
            protected JobParameters[] doInBackground(JobParameters... jobParameters) {
                return jobParameters;
            }

            @Override
            protected void onPostExecute(JobParameters[] jobParameters) {
                for (JobParameters params : jobParameters) {
                    jobFinished(params, false);
                }
                startRepeatJob(PeriodicJobService.this);
            }
        }.execute(params);
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        Log.d(TAG, "onStopJob called");
        return true;
    }

    // Helper method
    public static void startRepeatJob(Context context) {
        ComponentName serviceName = new ComponentName(context, PeriodicJobService.class);
        JobInfo jobInfo = new JobInfo.Builder(jobId, serviceName)
                .setPersisted(true)
                .setPeriodic(INTERVAL_TIME) // 1 min
                .build();
        JobScheduler s = (JobScheduler) context.getSystemService(Context.JOB_SCHEDULER_SERVICE);
        int result = s.schedule(jobInfo);
        Log.d(TAG, "schedule job " + jobId + " " + ((result == JobScheduler.RESULT_SUCCESS) ? "ok" : "failed"));
    }
}
