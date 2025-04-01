import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Itens;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        List <Itens> itensLista = new ArrayList<>();

        System.out.print("Digite o caminho do arquivo: ");
        String caminho = sc.nextLine();

        File caminhoOriginal = new File(caminho);
        String caminhoOriginalSemArquivo = caminhoOriginal.getParent();

        if (caminhoOriginalSemArquivo != null){
            boolean sucesso = new File(caminhoOriginalSemArquivo + "\\out").mkdir();
        }

        String caminhoArquivoDeSaida = caminhoOriginalSemArquivo + "\\out\\sumario.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoOriginal))){

            String item = br.readLine();
            while(item != null) {
                String[] camposItem = item.split(",");

                String nome = camposItem[0];
                Double preco = Double.parseDouble(camposItem[1]);
                Integer quantidade = Integer.parseInt(camposItem[2]);

                itensLista.add(new Itens(nome, preco, quantidade));

                item = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivoDeSaida))) {
                for (Itens i: itensLista) {
                    bw.write(i.getNome() + ", " + i.valorTotal());
                    bw.newLine();
                }
                System.out.printf("%s CREATED!\n", caminhoArquivoDeSaida);
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());;
        }

        sc.close();
    }
}
