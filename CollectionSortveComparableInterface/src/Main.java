import java.util.*;

class BuyuktenKucugeString implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        //   return o2.compareTo(o1);
        return -o1.compareTo(o2);
    }
}

class Player implements Comparable<Player> {
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "||||| Id: " + id + " Isim: " + isim + " |||||";
    }

    @Override
    public int compareTo(Player player) {
        if (this.id < player.id) {
            return -1;
        } else if (this.id > player.id) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class KucuktenBuyugePlayer implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() < o2.getId()) {
            return -1;
        } else if (o1.getId() > o2.getId()) {
            return 1;
        } else {
            return 0;
        }
    }
}

class BuyuktenKucugePlayer implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() < o2.getId()) {
            return 1;
        } else if (o1.getId() > o2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class StringeGoreSiralaPlayer implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
//        if(o1.getIsim().compareTo(o2.getIsim())>0){
//            return 1;
//        }
//        else if(o1.getIsim().compareTo(o2.getIsim())<0){
//            return -1;
//        }
//        else{
//            return 0;
//        }
        return o1.getIsim().compareTo(o2.getIsim());
    }

}

public class Main {
    public static void main(String[] args) {
//    List<String> list_string = new ArrayList<String>();
//    list_string.add("Java");
//    list_string.add("C++");
//    list_string.add("Python");
//    list_string.add("JavaScript");
//    list_string.add("Php");
//    Collections.sort(list_string, new BuyuktenKucugeString());
//
//    for(String s: list_string){
//        System.out.println(s);
//    }
        List<Player> list_players = new ArrayList<Player>();
        list_players.add(new Player("Murat", 2));
        list_players.add(new Player("Emre", 1));
        list_players.add(new Player("Karim", 10));
        list_players.add(new Player("Yusuf", 4));
//       Collections.sort(list_players);
//        Collections.sort(list_players,new KucuktenBuyugePlayer());
//        Collections.sort(list_players,new BuyuktenKucugePlayer());
//        Collections.sort(list_players,new StringeGoreSiralaPlayer());
        Collections.sort(list_players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return -o1.getIsim().compareTo(o2.getIsim());
            }
        });



        for (Player player : list_players) {
            System.out.println(player); //toString metodu override edilmediyse referans adresini yazdirir
        }
//        Set<Player> treeset = new TreeSet<Player>();
//        treeset.add(new Player("Murat",2));
//        treeset.add(new Player("Emre",1));
//        treeset.add(new Player("Karim",10));
//        treeset.add(new Player("Yusuf",4));
//        for (Player player : treeset) {
//            System.out.println(player);
//        }
    }
}
