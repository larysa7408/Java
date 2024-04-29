package lesson.lesson_44;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson44 {
    public static void main(String[] args) {
        File file = new File("file.bin");
        System.out.println(file.exists());

        //byte array input stream
        byte[] buf = {65, 66, 67, 68, 69, 70};
        ByteArrayInputStream inputStream = new ByteArrayInputStream("Hello".getBytes());
        int x;
        while ((x = inputStream.read()) != -1) {
            System.out.print(x + " ");
        }
        // file output stream
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(buf);

        } catch (IOException e) {
            e.printStackTrace();
        }
        // file input stream
        int bufSize = Long.valueOf(file.length()).intValue();

        byte[] inputBuffer = new byte[bufSize];

        try (FileInputStream fis = new FileInputStream("file.bin")) {
            fis.read(buf);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(inputBuffer));


        String[] text = {"line 1", "line 2", "line 3"};
        File textFile = new File("filetext.txt");

        //write: file reader
        try (FileWriter writer = new FileWriter(textFile)) {
            for (String str : text) {
                writer.write(str + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int charBufSize = Long.valueOf(textFile.length()).intValue();
        char[] charBuf = new char[charBufSize];

        // read: file reader
        try (FileReader reader = new FileReader(textFile)) {
            reader.read(charBuf);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new String(charBuf));

        //read by line using package nio
        List<String>lines = null;
        try {
           lines = Files.readAllLines(Paths.get("components.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e){
            e.printStackTrace();
        }
        List<String>components=new ArrayList<>();
        for (String line : lines){
            String[]fiends=line.split(",");
            System.out.println(Arrays.toString(fiends));

        }
    }
}
