package duke.task;

public class Event extends Task {
    private static final String EVENT_TYPE = "E";
    private String timestamp;
    private String timestampHeader;

    public Event (String errand, String timestamp, String timestampHeader) {
        super(errand);
        this.timestamp = timestamp;
        this.timestampHeader = timestampHeader;
    }

    @Override
    public String getTaskType() {
        return EVENT_TYPE;
    }

    /*
    @Override
    public void printTaskItem() {
        super.printTaskItem();
        this.printAt();
    }
     */

    @Override
    public String getTaskItem() {
        return this.description + " /" + this.timestampHeader + " " + this.timestamp;
    }

    private void printAt() {
        String trialingAt = " (" + timestampHeader + ": " + timestamp + ")";
        System.out.print(trialingAt);
    }
}
