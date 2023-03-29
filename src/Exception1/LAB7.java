package Exception1;

public class LAB7 {
    public static void main(String[] args) {
        System.out.println("Main method call method doThis()");
        try {
            doThis();
        }
        catch (Exception e){
            System.out.println("Main method recive exception " + e.getMessage());

        }
    }

    public static void doThis() throws Exception{
        System.out.println("Method doThis() call method doThat()");
        doThat();
    }

    public static void doThat() throws Exception{
        throw new MyException("Hello MyException");
    }
}
