package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TeamProjectStatistic {

    public String StatisticFunction() throws SQLException{

        final String USER = "root";
        final String PASS = "tbrs00002b";
        final String DB_URL = "jdbc:mysql://localhost/iphones_datebase";
                
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement(); 

        // 이름별
        String QUERY = "select 이름_통계, Unique_A_ID, Unique_ID " + "from 이름별 " + "order by Unique_ID ";

        // 항목별
        String QUERY1 = "select 항목_통계, Unique_A_ID, Unique_Q_ID " + "from 질문별 " + "order by Unique_Q_ID ";

        return null;
    }

}