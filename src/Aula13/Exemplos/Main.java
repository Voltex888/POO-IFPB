package Aula13;

import java.io.*;
import java.util.Scanner;

public class Main {
    static void main() {
        try (FileReader fr = new FileReader("./arquivo.txt");
        BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null{
                System.out.println(line);
            }
            fr.readAllAsString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
