import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Map<String, String> acoes = new HashMap<>();
        acoes.put("AAPL", "Apple Inc.");
        acoes.put("MSFT", "Microsoft Corporation");
        acoes.put("AMZN", "Amazon.com, Inc.");
        acoes.put("GOOGL", "Alphabet Inc.");
        acoes.put("FB", "Facebook, Inc.");
        acoes.put("TSLA", "Tesla, Inc.");
        acoes.put("JPM", "JPMorgan Chase & Co.");
        acoes.put("JNJ", "Johnson & Johnson");
        acoes.put("V", "Visa Inc.");
        acoes.put("PG", "Procter & Gamble Company");
        acoes.put("WMT", "Walmart Inc.");
        acoes.put("VZ", "Verizon Communications Inc.");
        acoes.put("KO", "Coca-Cola Company");
        acoes.put("PFE", "Pfizer Inc.");
        acoes.put("BRK-A", "Berkshire Hathaway Inc.");
        // ... Adicione outras ações aqui

        List<AcaoComprada> acoesCompradas = new ArrayList<>();
        double capital = 1000.00; // Defina o capital inicial aqui

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite o comando (/help para ver todos os comandos disponíveis): ");
            String comando = scanner.nextLine();
            if ("/acoes".equalsIgnoreCase(comando)) {
                exibirAcoes(acoes);
            } else if ("/sair".equalsIgnoreCase(comando)) {
                break;
            } else if (comando.startsWith("/comprar")) {
                comprarAcao(comando, acoes, acoesCompradas, capital);
            } else if (comando.startsWith("/vender")) {
                venderAcao(comando, acoesCompradas, capital);
            } else if ("/port".equalsIgnoreCase(comando)) {
                mostrarAcoesCompradas(acoesCompradas, acoes);
                mostrarCapital(capital);
            } else if ("/limpar".equalsIgnoreCase(comando)) {
                limparPortfolio(acoesCompradas);
            } else if ("/capital".equalsIgnoreCase(comando)) {
                mostrarCapital(capital);
            } else if (comando.matches("\\d+")) {
                int opcao = Integer.parseInt(comando);
                selecionarAcao(opcao, acoes);
            } 
            else if ("/help".equalsIgnoreCase(comando)) {
                exibirComandosDisponiveis();
            }
            else if ("/multi".equalsIgnoreCase(comando)) {
                    jogarCaraOuCoroa(scanner, capital);
            }

            else {
                System.out.println("Comando inválido!");
                System.out.println();
            }
        }
        scanner.close();
    }

    public static void jogarCaraOuCoroa(Scanner scanner, double capitalAtual) {
    System.out.print("Digite o valor para jogar 'cara ou coroa': ");

    // Verificar se a entrada é um número válido
    double valorJogo;
    while (true) {
        try {
            valorJogo = scanner.nextDouble();
            break;
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido. Digite um número válido: ");
            scanner.nextLine(); // Limpar o buffer de entrada
        }
    }
    scanner.nextLine(); // Limpar o buffer de entrada

    if (valorJogo > capitalAtual) {
        System.out.println("Você não possui dinheiro suficiente para jogar.");
        System.out.println();
    } else {
        Random random = new Random();
        boolean cara = random.nextBoolean();
        System.out.println("Jogando 'cara ou coroa'...");
        System.out.println();

        if (cara) {
            System.out.println("Caiu CARA!");
            capitalAtual -= valorJogo;
            System.out.println("Você perdeu R$" + valorJogo);
        } else {
            System.out.println("Caiu COROA!");
            double novoCapital = capitalAtual + valorJogo;
            System.out.println("Seu capital foi multiplicado de R$" + capitalAtual + " para R$" + novoCapital);
            capitalAtual = novoCapital;
        }
        System.out.println();
    }
}


    public static void exibirComandosDisponiveis() {
        System.out.println("Comandos disponíveis:");
        System.out.println("/acoes - Exibir a lista de ações disponíveis");
        System.out.println("/comprar <número da ação> <quantidade> - Comprar uma quantidade específica de ações");
        System.out.println("/vender <número da ação> <quantidade> - Vender uma quantidade específica de ações");
        System.out.println("/port - Exibir as ações compradas");
        System.out.println("/capital - Exibir o capital total");
        System.out.println("/multi - <quantidade que deseja apostar> - Aposta uma determinada quantia do seu capital");
        System.out.println("/limpar - Limpa seu portfolio");
        System.out.println("/sair - Encerrar o programa");
        System.out.println();
    }

    public static void exibirAcoes(Map<String, String> acoes) {
        System.out.println("Ações disponíveis:");
        int contador = 1;
        for (Map.Entry<String, String> entry : acoes.entrySet()) {
            System.out.println(contador + ". " + entry.getKey() + " - " + entry.getValue());
            contador++;
        }
        System.out.println();
    }

    public static void selecionarAcao(int opcao, Map<String, String> acoes) {
        if (opcao >= 1 && opcao <= acoes.size()) {
            String acaoSelecionada = getAcaoPorIndice(opcao, acoes);
            exibirInformacoesAcao(acaoSelecionada);
        } else {
            System.out.println("Opção inválida!");
            System.out.println();
        }
    }

    public static String getAcaoPorIndice(int indice, Map<String, String> acoes) {
        int contador = 1;
        for (Map.Entry<String, String> entry : acoes.entrySet()) {
            if (contador == indice) {
                return entry.getKey();
            }
            contador++;
        }
        return null;
    }

    public static void exibirInformacoesAcao(String acao) {
        Random random = new Random();
        double valorMaximo = random.nextInt(1000) + random.nextDouble();
        double valorMinimo = random.nextInt((int) valorMaximo);
        double valorAtual = random.nextInt((int) (valorMaximo - valorMinimo)) + valorMinimo;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Nome da ação: " + acao);
        System.out.println("Valor máximo nos últimos 2 minutos:   R$" + decimalFormat.format(valorMaximo));
        System.out.println("Valor mínimo nos últimos 2 minutos: R$" + decimalFormat.format(valorMinimo));
        System.out.println("Valor atual: R$" + decimalFormat.format(valorAtual));
        System.out.println();
    }
    


    public static void comprarAcao(String comando, Map<String, String> acoes, List<AcaoComprada> acoesCompradas, double capitalAtual) {
        String[] partes = comando.split("\\s+");
        if (partes.length == 3) {
            String acaoSelecionada = getAcaoPorIndice(Integer.parseInt(partes[1]), acoes);
            if (acaoSelecionada != null) {
                int quantidade = Integer.parseInt(partes[2]);
                double valorAcao = obterValorAcao(acaoSelecionada);
                double valorTotal = valorAcao * quantidade;

                if (valorTotal > capitalAtual) {
                    System.out.println("Você não possui dinheiro suficiente para comprar essa quantidade de ações.");
                    System.out.println();
                } else {
                    AcaoComprada acaoComprada = new AcaoComprada(acaoSelecionada, quantidade);
                    acoesCompradas.add(acaoComprada);
                    capitalAtual -= valorTotal;
                    System.out.println("Ação " + acaoSelecionada + " comprada! Quantidade: " + quantidade);
                    System.out.println();
                }
            } else {
                System.out.println("Opção inválida!");
                System.out.println();
            }
        } else {
            System.out.println("Comando inválido!");
            System.out.println();
        }
    }

    public static void venderAcao(String comando, List<AcaoComprada> acoesCompradas, double capitalAtual) {
        String[] partes = comando.split("\\s+");
        if (partes.length == 3) {
            String acaoSelecionada = getAcaoPorIndice(Integer.parseInt(partes[1]), acoesCompradas);
            if (acaoSelecionada != null) {
                int quantidade = Integer.parseInt(partes[2]);
                AcaoComprada acaoComprada = getAcaoComprada(acaoSelecionada, acoesCompradas);
                if (acaoComprada != null && acaoComprada.getQuantidade() >= quantidade) {
                    acaoComprada.setQuantidade(acaoComprada.getQuantidade() - quantidade);
                    double valorAcao = obterValorAcao(acaoSelecionada);
                    double valorTotal = valorAcao * quantidade;
                    capitalAtual += valorTotal;
                    System.out.println("Ação " + acaoSelecionada + " vendida! Quantidade: " + quantidade);
                    System.out.println();
                } else {
                    System.out.println("Você não possui essa quantidade de ações.");
                    System.out.println();
                }
            } else {
                System.out.println("Opção inválida!");
                System.out.println();
            }
        } else {
            System.out.println("Comando inválido!");
            System.out.println();
        }
    }

    public static String getAcaoPorIndice(int indice, List<AcaoComprada> acoesCompradas) {
        int contador = 1;
        for (AcaoComprada acao : acoesCompradas) {
            if (contador == indice) {
                return acao.getNome();
            }
            contador++;
        }
        return null;
    }

    public static AcaoComprada getAcaoComprada(String nome, List<AcaoComprada> acoesCompradas) {
        for (AcaoComprada acao : acoesCompradas) {
            if (acao.getNome().equals(nome)) {
                return acao;
            }
        }
        return null;
    }

    public static double obterValorAcao(String acao) {
        // Simulação de obtenção do valor da ação a partir de uma API ou fonte externa
        Random random = new Random();
        double valorMaximo = random.nextInt(1000) + random.nextDouble();
        double valorMinimo = random.nextInt((int) valorMaximo);
        return random.nextInt((int) (valorMaximo - valorMinimo)) + valorMinimo;
    }

    public static void mostrarAcoesCompradas(List<AcaoComprada> acoesCompradas, Map<String, String> acoes) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Portfolio:");
        for (AcaoComprada acao : acoesCompradas) {
            System.out.println(acao.getNome() + " - Quantidade: " + acao.getQuantidade() +
                    " - Valor Atual: R$" + decimalFormat.format(obterValorAcao(acao.getNome())));
        }
        System.out.println();
    }

    public static void mostrarCapital(double capitalAtual) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Capital atual: R$" + decimalFormat.format(capitalAtual));
        System.out.println();
    }

    public static void limparPortfolio(List<AcaoComprada> acoesCompradas) {
        acoesCompradas.clear();
        System.out.println("Portfolio limpo!");
        System.out.println();
    }
}

class AcaoComprada {
    private String nome;
    private int quantidade;

    public AcaoComprada(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
