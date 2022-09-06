package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TeamProjectMain {
    public static void main(String[] args) throws SQLException{

        Scanner scanner = new Scanner(System.in);

        final String USER = "root";
        final String PASS = "tbrs00002b";
        final String DB_URL = "jdbc:mysql://localhost/";
                
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement(); 

        System.out.println("원하시는 항목을 선택하세요 : 통계(s), 설문(p), 종료(q)");
        System.out.println("-------------------------------------------");
        String answer = scanner.nextLine();

        if ("s".equals(answer)){
            TeamProjectStatistic statistic = new TeamProjectStatistic();
            statistic.StatisticFunction(stmt);
        }
        else if ("p".equals(answer)){
            TeamProjectPoll poll = new TeamProjectPoll();
            poll.PollFunction(stmt);
        }
        else if ("q".equals(answer)){
            System.out.println("감사합니다. 시스템을 종료합니다.");
            return;
        }
        else{
            System.out.println("잘못 입력하셨습니다.");
        }
        
    }
}
