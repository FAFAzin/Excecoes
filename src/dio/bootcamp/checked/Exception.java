package dio.bootcamp.checked;

import javax.swing.*;
import java.io.*;

public class Exception {
    public static void main(String[] args) {
        String nomeDoArquivo = "filmes e series.txt";


        try {
            imprimirArquivoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,
                    "ERRO!, revise o nome do arquivo!");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado, entre em contato com o suporte!" + e.getCause());
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }


        System.out.println("Apesar da Exception ou não, o programa continua...");
    }

    public static void imprimirArquivoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        br.close();

    }
}
