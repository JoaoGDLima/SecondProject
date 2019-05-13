package secondproject;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SecondProject {

    private static final String archive = "game-reviews.csv";

    public static void main(String[] args) {

        SimpleReader f = new SimpleReader(archive);
        String s = f.readLine();

        // Árvore binária para receber o ano e um vetor com os demais dados
        Map<Integer, Controle> map = new TreeMap<Integer, Controle>();

        while (s != null) {
            s = f.readLine();
            String[] vets = s.split(";");
            String nome = vets[0].toString();
            String avaliacao = vets[2].toString();
            Double score = Double.parseDouble(vets[3].toString());
            int ano = Integer.parseInt(vets[6].toString());

            Controle control = null;
            // Vetor na posição 6 contém o ano
            if (!map.containsKey(ano)) {
                control = new Controle(score, nome);
            } else {
                control = map.get(ano);
            }

            control.contReview();
            control.contMediocres(avaliacao);
            control.somaScore(score);
            control.verificaMelhorJogo(score, nome);
            control.verificaPiorJogo(score, nome);
            map.put(ano, control);

            s = f.readLine();
        }

        // Teste
        Set<Integer> anos = map.keySet();

        for (int ano: anos) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Dados do ano " + ano);
            System.out.println("-------------------------------------------------------------");            
            System.out.println("Número de reviews:" + map.get(ano).reviews + "");
            System.out.println("Percentual de 'Mediocre':" + map.get(ano).mediocres + " : " + map.get(2016).percMediocre());
            System.out.println("média aritmética:" + map.get(ano).mediaScore() + "");
            System.out.println("Desvio padrão:" + map.get(ano).desvioPadrao());
            System.out.println("Melhor jogo: " + map.get(ano).melhorJogo + ": " + map.get(2016).scoreMelhor);
            System.out.println("Pior jogo:" + map.get(ano).piorJogo + ": " + map.get(2016).scorePior);
            System.out.println("-------------------------------------------------------------");
        }

    }
}
