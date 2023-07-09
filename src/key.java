import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class key {
    private static final String ARQUIVO_SENHA = "senha.txt";
    private static String senha;

    public static void exibirSenha() {
        carregarSenha();
        System.out.println("Senha atual: " + senha);
        System.out.println();
    }

    public static void resetarSenha(Scanner scanner) {
        System.out.print("Digite a nova senha: ");
        senha = scanner.nextLine();
        salvarSenha();
        System.out.println("Senha resetada com sucesso!");
        System.out.println();
    }

    private static void carregarSenha() {
        try {
            FileReader fileReader = new FileReader(ARQUIVO_SENHA);
            BufferedReader reader = new BufferedReader(fileReader);

            senha = reader.readLine();

            reader.close();
        } catch (IOException e) {
            senha = "senha123"; // Senha padrão caso o arquivo não exista ou ocorra algum erro
        }
    }

    private static void salvarSenha() {
        try {
            FileWriter fileWriter = new FileWriter(ARQUIVO_SENHA);
            PrintWriter writer = new PrintWriter(fileWriter);

            writer.println(senha);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
