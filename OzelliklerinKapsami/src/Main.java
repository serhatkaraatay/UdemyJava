public class Main {
    public static void main(String[] args) {
        KapsamSinifi kapsamSinifi = new KapsamSinifi();
        kapsamSinifi.onileCarp();
        KapsamSinifi2.DahiliSinif kapsam = new KapsamSinifi2().new DahiliSinif();
        kapsam.OnileCarp();
        //kapsam.a bu şekilde kullanamayız private değeri göremeyiz
    }
}
