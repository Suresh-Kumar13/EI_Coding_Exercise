public class DataBackupJob implements Job {
    private String dbName;

    public DataBackupJob(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public void execute() {
        System.out.println("Backing up database: " + dbName);
    }
}