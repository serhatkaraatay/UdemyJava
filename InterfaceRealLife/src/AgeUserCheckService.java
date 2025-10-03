public class AgeUserCheckService implements IUSerCheck {
    //Methodlar olacak
    public boolean checkUser(User user) {
        if(user.getAge()>18) {
            return true;
        }else{
            return false;
        }
    }
}
