package Aula11.Lista07.q2;

import java.util.List;

public abstract class BackupService {
    public static void realizarBackup(
            Armazenamento origem,
            Armazenamento destino,
            List<String> caminhos){

        for(String c : caminhos){

            byte[] dados =
                    origem.ler(c);

            if(dados != null){
                destino.gravar(c,dados);
            }

        }

    }

}
}
