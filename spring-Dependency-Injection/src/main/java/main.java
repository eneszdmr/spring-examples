public class main {
    public static void main(String[] args) {

        DatabaseManager databaseManager= new DatabaseManager(new PostgreDal());
        databaseManager.goster();



    }
}
