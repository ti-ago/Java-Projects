package application;
import util.LimparTela;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
        String filePath = "/home/tiago/GitHub/Java-Projects/jogoForca/src/util/words.txt";
        List<String> words = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                words.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        Random random = new Random();
        String randomWord = words.get(random.nextInt(words.size()));
        System.out.println(randomWord);
        char[]chosenWord = new char[randomWord.length()];
        char[]gameWord = new char[randomWord.length()];
        for (int i = 0, n = randomWord.length(); i < n; i++) {
           chosenWord [i] = randomWord.toUpperCase().charAt(i);
           gameWord [i] = '_';
        }      
        int errors = 0, point = 0;
        System.out.println();
        boolean hit = false;
        while (errors < 6){
            LimparTela.limparTela();
            System.out.println("JOGO DA FORCA");
            System.out.println(gameWord);
            System.out.println("Escolha uma letra");      
            String letter = scanner.next().toUpperCase();   
            for (int i = 0, n = chosenWord.length; i<n; i++){
                if (chosenWord[i] == letter.charAt(0) && gameWord[i] == '_'){
                    gameWord[i] = letter.charAt(0);
                    hit = true;
                }
                if (gameWord[i] != '_'){
                    point++;
                }
            }
            if (!hit){
                errors++;
            }
            System.out.println(gameWord);
            if (point == chosenWord.length){
                System.out.println("VICTORY");
                scanner.close();
                System.exit(0);
            }
            hit = false;
            point = 0;
        }
        System.out.println("LOSE");
        scanner.close();
        System.exit(0);
    }       
    
}


