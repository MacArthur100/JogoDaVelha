public class JogoDaVelha {
    public static void main(String[] args) {
        // Define a matriz representando o jogo da velha
        char[][] matriz = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'O', 'O', 'X'}
        };

        // Verifica quem ganhou
        char ganhador = verificarGanhador(matriz);

        // Exibe o resultado
        if (ganhador != ' ') {
            System.out.println("Ganhador: " + ganhador);
        } else {
            System.out.println("Nenhum ganhador.");
        }
    }

    // Método que verifica o ganhador das diagonais
    public static char verificarGanhador(char[][] matriz) {
        // Verifica a diagonal principal
        if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {
            return matriz[0][0]; // X ou O
        }

        // Verifica a diagonal secundária
        if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]) {
            return matriz[0][2]; // X ou O
        }

        // Se não houver ganhador, retorna um caractere vazio
        return ' ';
    }
}