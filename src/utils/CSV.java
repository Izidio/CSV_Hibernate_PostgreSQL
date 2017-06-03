package utils;

import entidade.Retail;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Izidio Carvalho
 */
public class CSV {

    public static void main(String[] args) throws FileNotFoundException, IOException {

    }

    //metodo que ler o CSV
    public static List file_CSV() throws FileNotFoundException, IOException {
        int n = 0;
        int i = 0;
        BufferedReader br = new BufferedReader(new FileReader("src/Retail.csv"));
        String line = "";
        List lista = new ArrayList();
        System.out.println("Iniciando leitura do arquivo CSV");

        while ((line = br.readLine()) != null) {

            // "," ou ";" de acordo com o arquivo
            String[] row = line.split(";");
            lista.add(new Retail(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7]));
            if (i == n) {
                System.out.println("lendo CSV -> " + n);
                n+=1000;
            }
            i++;
        }
        System.out.println("Aquivos lidos com Sucesso!");
        System.out.println("Quantidade: " + lista.size());
        return lista;
    }

}
