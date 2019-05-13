package secondproject;

import java.util.Map;
import java.util.TreeMap;

public class SecondProject {

    private static final String archive = "game-reviews2.csv";

    public static void main(String[] args) {

        SimpleReader f = new SimpleReader(archive);
        String s = f.readLine();
        Map<Integer, String[]> map = new TreeMap<Integer, String[]>();
    
        while (s != null) {
            
            s = f.readLine();
            
            String[] vets = s.split(";");
            
            map.put(Integer.parseInt(vets[6].toString()), vets);
            
            s = f.readLine();
        }
        System.out.println(map.toString());
    }
}
