package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializacaoExemplo {
    public static void main(String[] args) {
        String arquivo = "pessoa.ser";

        //Serializar objeto
        Pessoa pessoa = new Pessoa("João", 25);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(pessoa);
            System.out.println("Objeto serializado: " + pessoa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
