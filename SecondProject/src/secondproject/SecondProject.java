/*
Tarefa 2 - sumarizar para cada ano de lançamento:

+ número de reviews deste ano
+ percentual de ‘Mediocre’ reviews (sobre o número de reviews deste ano)
+ média aritmética dos scores
+ desvio padrão populacional dos scores
+ melhor jogo (basta indicar um entre os de maior score)
+ pior jogo (basta indicar um entre os de menor score)

Ao final: qual o ano em que foi lançado um maior número de jogos do gênero ‘Action’?
 */
package SecondProject;

public class SecondProject {

    private static final String archive = "C:\\Users\\MatheusFrey\\Downloads\\game-reviews.csv";

    public static void main(String[] args) {

        SimpleReader f = new SimpleReader(archive);

        String s = f.readLine();

        while (s != null) {
            System.out.println(s);
            s = f.readLine();
        }
    }
}
