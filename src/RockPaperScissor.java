import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        
        String[] options = {"pedra", "papel", "tesoura"};
        
        Random random = new Random();
        
        int numberOfGames = 10;
        
        for (int i = 0; i < numberOfGames; i++) {
            int randomNumber = random.nextInt(3);
            
            System.out.println("Escolha do jogador " + options[randomNumber]);
        }
        

    }
}
