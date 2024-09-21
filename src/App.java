public class App {
    public static void main(String[] args) throws Exception {
        // Questão 1
        System.out.println("O valor da variável soma é " + questaoUm(12) + ".");
        // Questão 3
        double[] faturamentos = {0, 1500.50, 0, 2200.75, 0, 3000.40, 0, 500.25, 0, 2800.65, 0, 4000.85, 0};
        questaoTres(faturamentos);
    }

    public static int questaoUm(int index){
        int sum = 0;
        int k = 1;
        while(sum < index){
            k = k + 1;
            sum = sum + k;
        }
        return sum;
    }

    public static void questaoTres(double[] faturamentos){
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;
        for (double faturamento : faturamentos) {
            if (faturamento > 0) { // Ignorar dias sem faturamento
                // Questão 3 - requisito 1
                menorFaturamento = calculaMenorFaturamento(faturamento, menorFaturamento);
                // Questão 3 - requisito 2 
                maiorFaturamento = calculaMaiorFaturamento(faturamento, maiorFaturamento);
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }
        
        double mediaFaturamento = somaFaturamento / diasComFaturamento;
        int diasAcimaDaMedia = 0;
        // Questão 3 - requisito 3 
        diasAcimaDaMedia = calculaDiasComFaturamentoAcimaDaMedia(faturamentos, mediaFaturamento, diasAcimaDaMedia);

        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }

    public static double calculaMenorFaturamento(double faturamento, double menorFaturamento){
        if (faturamento < menorFaturamento) {
            menorFaturamento = faturamento;
        }
        return menorFaturamento;
    }

    public static double calculaMaiorFaturamento(double faturamento, double maiorFaturamento){
        if (faturamento > maiorFaturamento) {
            maiorFaturamento = faturamento;
        }
        return maiorFaturamento;
    }

    public static int calculaDiasComFaturamentoAcimaDaMedia(double[] faturamentos, double mediaFaturamento, int diasAcimaDaMedia){
        for (double faturamento : faturamentos){
            if (faturamento > mediaFaturamento){
                diasAcimaDaMedia++;
            }
        }
        return diasAcimaDaMedia;
    }
}
