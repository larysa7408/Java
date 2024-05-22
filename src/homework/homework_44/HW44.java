package homework.homework_44;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW44 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "money_in.txt";
        String lessOutputFileName = "less.txt";
        String moreOutputFileName = "more.txt";

        Map<String, Integer> userTransactions = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String user = parts[0];
                    int amount = Integer.parseInt(parts[1]);
                    userTransactions.merge(user, amount, Integer::sum);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter lessWriter = new BufferedWriter(new FileWriter(lessOutputFileName));
             BufferedWriter moreWriter = new BufferedWriter(new FileWriter(moreOutputFileName))) {

            for (Map.Entry<String, Integer> entry : userTransactions.entrySet()) {
                String user = entry.getKey();
                int totalAmount = entry.getValue();

                if (totalAmount < 2000) {
                    lessWriter.write(user + ":" + totalAmount + "\n");
                } else {
                    moreWriter.write(user + ":" + totalAmount + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The processing result is written in less.txt and more.txt");
    }
}
