public class Worker implements Runnable{
    private String name;
    private int taskId;
    public Worker(String name, int taskId) {
        this.name = name;
        this.taskId = taskId;
    }
    @Override
    public void run() {
        System.out.println("Worker " + name + " " + taskId + ". işe başladı..");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Worker " + name + " " + taskId + ". işi bitirdi..");
    }

}
