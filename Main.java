import java.io.*;

public class Main {
    public static void main(String[] args) {

        
        Girafa g1 = new Girafa("Gertrudes", 7, 5.2, 900, "Folhas de árvores e brotos");

        // --- Serialização---
        try (FileOutputStream fos = new FileOutputStream("girafa.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(g1);
            System.out.println("Objeto girafa serializado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // --- Desserialização ---
        try (FileInputStream fis = new FileInputStream("girafa.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Girafa g2 = (Girafa) ois.readObject();
            System.out.println("Objeto girafa desserializado com sucesso!");
            System.out.println("--- Informações da Girafa ---");
            g2.mostrarInfo();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
