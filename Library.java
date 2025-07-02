interface Library {
    void registerAccount();
    void requestBook();
}
class Kiduser implements Library{
    int age;
    String Booktype;

    Kiduser(int age,String Booktype){
        this.age = age;
        this.Booktype = Booktype;
    }

    public void registerAccount(){
        if(age < 12){
            System.out.println("You have successfully registered under a Kids Account");
        }else{
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    public void requestBook(){
        if(Booktype.equals("Kids") && age < 12){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
class AdultUser implements Library{
    int age;
    String Booktype;

    AdultUser(int age,String Booktype){
        this.age = age;
        this.Booktype = Booktype;
    }

    public void registerAccount(){
        if(age > 12){
            System.out.println("You have successfully registered under an Adult Account");
        }else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }
    public void requestBook(){
        if(Booktype.equals("Fiction") && age > 12){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }else{
            System.out.println("“Oops, you are allowed to take only adult Fiction books");
        }
    }
}
class TestLibrary{
    public static void main(String[] args){
        Kiduser k = new Kiduser(7,"Kids");
        k.registerAccount();
        k.requestBook();

        AdultUser a = new AdultUser(25,"Fiction");
        a.registerAccount();
        a.requestBook();
    }
}
