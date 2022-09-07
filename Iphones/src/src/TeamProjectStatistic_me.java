package src;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TeamProjectStatistic_me {

    public String StatisticFunction(Statement stmt) throws SQLException{

        // 이름별
        String QUERY = "select Unique_ID, Name, 1, 2, 3, 4 " + "from CarSurvey_Answer ";
        ResultSet rs = stmt.executeQuery(QUERY);

        // 항목별
        String QUERY1 = "select 항목_통계, Unique_A_ID, Unique_Q_ID " + "from Question_Statistic ";
        ResultSet rs1 = stmt.executeQuery(QUERY);
        // 질문ID, answerID, 이름별 통계
        
        return null;
    }

}