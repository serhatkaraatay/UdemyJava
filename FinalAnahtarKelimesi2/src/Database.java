public  class Database { //Class sınıfının önünde de final kullanırsak o classtan alt sınıflar da türetemeyiz kalıtım olamaz.
    public final void baglantiKur( String username, String password) {
       // username = "root2"; //username ve password üzerinde değişiklik yapılmasını istemiyorsak final anahtar kelimesini kullanmalıyız
        System.out.println(username);
        System.out.println(password);
    }//
}
