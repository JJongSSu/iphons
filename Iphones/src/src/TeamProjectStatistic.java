package src;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TeamProjectStatistic {

    public String StatisticFunction(Statement stmt) throws SQLException{

        // 이름별
        String QUERY = "Select * " + "from Name_Statistic ";
        ResultSet rs = stmt.executeQuery(QUERY); 
        System.out.println("이름별 답변 \n" + rs);

        // QUERY = 
        // "Select Unique_ID, NAME, SUM(Unique_A_ID),  " + 
        // "FROM Name_Statistics " + 
        // "INNER JOIN CarSurvey_User " + "ON Name_Statistics.Unique_ID = CarSurvey_User.Unique_ID "
        // + "INNER JOIN Question_Statistic " + 
        // "ON Question_Statistic.Q_Statistic = Name_Statistics.Q_Statistic "+ 
        // "GROUP BY Unique_ID " + 
        // "ORDER BY Unique_ID ";
        // ResultSet rs1 = stmt.executeQuery(QUERY); 
        // while (rs.next()) {
        //     String columLabel;
        //     System.out.print("Unique_ID: " + rs.getInt("Unique_ID"));
        //     System.out.print(", Name : " + rs.getString("Name"));
        //     System.out.print(", SUM : " + rs.getInt("SUM(Unique_A_ID"));
        // }
        // return null;


        // 항목별
        QUERY = 
        "select Question_Statistic.Unique_Q_ID, Count(Unique_A_ID) " +
        "FROM Question_Statistic " +
        "GROUP BY Unique_Q_ID "+
        "ORDER BY Unique_Q_ID ";
        ResultSet rss = stmt.executeQuery(QUERY); 
        while (rss.next()) {
            System.out.print("Unique_Q_ID: " + rss.getInt("Unique_ID"));
            System.out.print(", COUNT : " + rss.getString("Count(Unique_A_ID"));
        }
        return null;
    }

}