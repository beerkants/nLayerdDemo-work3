package work_3_KodlamaIo.Core.Logging;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Dosyaya loglandı. : " + message);
    }
}
