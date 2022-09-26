import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://210.70.80.21:3306/1091JavaWP";
    static final String UID = "1091JavaWP";
    static final String PWD = "C8ie@6lo1";
    private Connection conn = null;
    private Statement stmt = null;
    static private ResultSet rs = null;

    public DBConn(){
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, UID, PWD);
            stmt = conn.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public String showAll(){
        String result = "";
        String sql = "SELECT * FROM user108021076";
        try{
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String userName = rs.getString("name");
                String passwd = rs.getString("password");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                result += ("ID: " + id + ", name: " + userName + ", passwd: " + passwd + ", email: " + email + ", Phone " + phone + "\n");
            }
        }catch (SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public void closeDB(){
        try{
            rs.close();
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("sayonara");
    }
}
