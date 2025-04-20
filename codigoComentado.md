Exercício Estrutura de Dados 2º semestre - Sistemas para Internet - FATEC

Código Comentado

Vamos explicar o código original que verifica um ganhador em um jogo da velha
Aqui está o código original, adicionado de comentários linha a linha para detalhar o que cada parte faz:

// Declaração da classe pública chamada JogoDaVelha
public class JogoDaVelha {  

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {  
        
        // Define a matriz representando o jogo da velha
        char[][] matriz = {  
            {'X', 'O', 'X'},  // Primeira linha da matriz
            {'O', 'X', 'O'},  // Segunda linha da matriz
            {'O', 'O', 'X'}   // Terceira linha da matriz
        };  

        // Verifica quem ganhou ao passar a matriz para o método verificarGanhador
        char ganhador = verificarGanhador(matriz);  

        // Exibe o resultado do ganhador, se houver
        if (ganhador != ' ') {  
            System.out.println("Ganhador: " + ganhador);  // Mostra o ganhador encontrado (X ou O)
        } else {  
            System.out.println("Nenhum ganhador.");  // Mensagem caso não haja ganhador
        }  
    }  

    // Método que verifica o ganhador das diagonais da matriz
    public static char verificarGanhador(char[][] matriz) {  
        // Verifica a diagonal principal da matriz (canto superior esquerdo ao canto inferior direito)
        if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {  
            return matriz[0][0]; // Retorna o valor do ganhador (X ou O) da diagonal principal
        }  

        // Verifica a diagonal secundária da matriz (canto superior direito ao canto inferior esquerdo)
        if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]) {  
            return matriz[0][2]; // Retorna o valor do ganhador (X ou O) da diagonal secundária
        }  

        // Se não houver ganhador, retorna um caractere vazio
        return ' ';  
    }  
}
