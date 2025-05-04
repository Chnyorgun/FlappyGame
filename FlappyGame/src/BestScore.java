import java.io.*;

public class BestScore {
    private static final String FILE_PATH = "bestscore.txt";

    public static int getBestScore() {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                return 0;
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            reader.close();
            return Integer.parseInt(line);
        } catch (Exception e) {
            return 0;
        }
    }

    public static void saveBestScore(int score) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH));
            writer.write(String.valueOf(score));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
