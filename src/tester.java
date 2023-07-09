import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class tester {
    public static void main(String[] args) {
        // Obter informações sobre o sistema operacional
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        System.out.println("Sistema operacional: " + osBean.getName());
        System.out.println("Arquitetura: " + osBean.getArch());
        System.out.println("Versão: " + osBean.getVersion());
        System.out.println();

        // Obter informações sobre a memória
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Memória Total: " + formatBytes(totalMemory));
        System.out.println("Memória Livre: " + formatBytes(freeMemory));
        System.out.println("Memória Máxima: " + formatBytes(maxMemory));
        System.out.println();

        // Obter informações sobre a placa de vídeo
        // Dependendo do sistema operacional e das bibliotecas disponíveis,
        // pode ser necessário usar bibliotecas adicionais para obter informações detalhadas sobre a placa de vídeo.

        // Obter informações sobre o processador
        int availableProcessors = osBean.getAvailableProcessors();
        String processorName = System.getProperty("os.arch");
        System.out.println("Processador: " + processorName);
        System.out.println("Número de processadores disponíveis: " + availableProcessors);
    }

    // Função auxiliar para formatar o tamanho da memória em bytes, kilobytes, megabytes ou gigabytes
    public static String formatBytes(long bytes) {
        String[] units = { "bytes", "KB", "MB", "GB" };
        int index = 0;
        double size = bytes;
        while (size >= 1024 && index < units.length - 1) {
            size /= 1024;
            index++;
        }
        return String.format("%.2f %s", size, units[index]);
    }
}
