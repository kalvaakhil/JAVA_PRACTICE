public class ValidUser {

    public static void checkValidUser(int age) throws InValidAgeException {
        if(age>=18)
        {
            System.out.println("Eligible");
        }
        else{
            throw new InValidAgeException();
        }
    }
    public static void main(String[] args){
        try{
            checkValidUser(17);
        } catch (InValidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
