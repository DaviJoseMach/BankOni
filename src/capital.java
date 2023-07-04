import java.text.DecimalFormat;

public class capital {
    private static double capital = 1000.0; // Capital inicial

    public static void main(String[] args) {
        mostrarCapital();
    }

    public static void mostrarCapital() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Capital disponível: R$" + decimalFormat.format(capital));
    }
}
