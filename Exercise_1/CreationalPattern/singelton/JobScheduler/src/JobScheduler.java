
import java.util.LinkedList;
import java.util.Queue;

public class JobScheduler {
    private static JobScheduler instance;
    private Queue<Job> jobQueue;

    // Private constructor
    private JobScheduler() {
        jobQueue = new LinkedList<>();
        System.out.println("Job Scheduler initialized...");
    }

    // Lazy Singleton
    public static synchronized JobScheduler getInstance() {
        if (instance == null) {
            instance = new JobScheduler();
        }
        return instance;
    }

    public void scheduleJob(Job job) {
        jobQueue.offer(job);
        System.out.println("Job scheduled: " + job.getClass().getSimpleName());
    }

    public void runJobs() {
        while (!jobQueue.isEmpty()) {
            Job job = jobQueue.poll();
            job.execute();
        }
    }
}
