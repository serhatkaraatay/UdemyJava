public class Main {

    public static void main(String[] args) {
        String kanallar[] = {"Kanal 1", "Kanal 2", "Kanal 3", "Kanal 4", "Kanal 5"};
        Radyo radyo = new Radyo(kanallar);
        for(String kanal :radyo) {
            System.out.println(kanal);
        }
    }
}
