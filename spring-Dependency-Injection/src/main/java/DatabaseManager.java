public class DatabaseManager {


    private DatabaseDal databaseDal;

    public DatabaseManager(DatabaseDal databaseDal) {
        this.databaseDal = databaseDal;
    }
    public void goster(){
        databaseDal.add();
    }
}
