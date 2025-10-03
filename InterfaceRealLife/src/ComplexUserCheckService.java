public class ComplexUserCheckService implements IUSerCheck {
    public boolean checkUser(User user) {
        if(user.getAge()>18 && user.getName().startsWith("Mu")) {
            return true;
        }else{
            return false;
        }
    }

}
