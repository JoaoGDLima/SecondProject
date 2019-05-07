package secondproject;

public class SecondProject {

    private static final String archive = "game-reviews.csv";

    protected static class game {

        int year;
        String tittle;
        String plataform;
        String score_phrase;
        String score;
        String genre;
        String editors_choice;

    }

    public static void main(String[] args) {

        SimpleReader f = new SimpleReader(archive);
        String s = f.readLine();

        while (s != null) {
            System.out.println(s);
            s = f.readLine();
        }

    }
}
