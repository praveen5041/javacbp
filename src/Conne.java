import java.sql.*;
public class Conne {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","system","root504");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from emp");
        while(rs.next()){
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
        }
        System.out.println("Hello, World!");
        con.close();
    }
}
