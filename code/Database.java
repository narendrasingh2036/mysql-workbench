package database;


public class Database {

    public static void main(String[] args)  {
        try{
            
            new mysqlmain().setVisible(true);
            
           }catch(Exception e){
               System.out.print(e.getMessage());
           }
    }
    
}
