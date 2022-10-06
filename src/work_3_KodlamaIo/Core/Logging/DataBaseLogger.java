package work_3_KodlamaIo.Core.Logging;

public class DataBaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Db. loglandı. : " + message);
    }
}
