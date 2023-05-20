import static javax.swing.JOptionPane.DEFAULT_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String personagem = JOptionPane.showInputDialog(null,"Digite um personagem de Naruto");
        String nomeImagem = "";
        String origem = "";

        switch (personagem) {
            case "naruto":  
                origem = "aldeia da folha";
                nomeImagem = "naruto-icone";
                break;
            case "sasuke":                        
                origem = "aldeia da folha";
                nomeImagem = "sasuke-icone";
                break;
            case "kakashi":
                origem = "aldeia da folha";
                nomeImagem = "kakashi-icone";
                break;
            default: 
                origem = "Desconhecida";
                nomeImagem = "";
                break;

        }

        String caminhoDaImagem = String.format("C:/Users/santi/OneDrive/Área de Trabalho/Naruto/naruto/src/imagens/%s.jpg", nomeImagem);
        ImageIcon icone = new ImageIcon(caminhoDaImagem);

        String informacoesPersonagem = String.format("personagem: %s\norigem: %s", personagem, origem);

        showConfirmDialog(null, informacoesPersonagem, "Descriçao", DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icone);

    }
}
