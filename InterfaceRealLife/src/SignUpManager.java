public class SignUpManager {
    private IUSerCheck iUSerCheck;

    public SignUpManager(IUSerCheck iUSerCheck) {
        this.iUSerCheck = iUSerCheck;
    }

    public void signUp(User user) {
        if(iUSerCheck.checkUser(user)) {
            System.out.println("Kullanıcı Kayıt oldu : " + user.getName());
        }else
            System.out.println("Kullanıcı kayıt olamadı");
        }


}
