

public class SingletonJobSchedulerDemo {
    public static void main(String[] args) {
        JobScheduler scheduler1 = JobScheduler.getInstance();

        scheduler1.scheduleJob(new EmailJob("john@example.com"));
        scheduler1.scheduleJob(new DataBackupJob("InterviewDB"));

        JobScheduler scheduler2 = JobScheduler.getInstance();
        scheduler2.scheduleJob(new EmailJob("support@example.com"));

        System.out.println("Running jobs using scheduler2...");
        scheduler2.runJobs();

        System.out.println("Are both schedulers same? " + (scheduler1 == scheduler2));
    }
}
