package secondproject;

public class SecondProject {

    private static final String archive = "game-reviews.csv";

    protected static class game {

   

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
