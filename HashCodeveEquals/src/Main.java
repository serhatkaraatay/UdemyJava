import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player{
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return"|||| ID:  " + id + " İsim: " + isim + " ||||";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && Objects.equals(isim, player.isim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isim, id);
    }
}
public class Main {
    public static void main(String[] args) {
        Set<Player> hashset = new HashSet<Player>();
        Player player1 = new Player("Mustafa",1);
        Player player2 = new Player("Mehmet",10);
        Player player3 = new Player("Emre",6);
        Player player4 = new Player("Mustafa",1); //player1 ve player 4 aynı değerlere sahip
        hashset.add(player1);
        hashset.add(player2);
        hashset.add(player3);
        hashset.add(player4);
        for(Player s: hashset){
            System.out.println(s);
        }
        //hashcode ve equals metotları override edilmemişse referanslara göre karşılaştırma yapar
        //hashcode ve equals metotları override edilirse değerlerine göre karşılaştırma yapar
        //bu yüzden player1 ve player4 aynı değerlere sahip olmasına rağmen hashset içerisinde 2 tane obje olarak yer alır

    }
}
