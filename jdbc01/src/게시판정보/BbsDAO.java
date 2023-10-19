package 게시판정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BbsDAO {	//member테이블에 crud를 하고 싶으면  MemberDAO를 사용하면 됨.
	//DAO : db access object
	//shop db member table에 접근해서 처리하는 객체
	public void update(int no, String title, String content ) {
		try {
			//1. 연결한 부품(커넥터, driver, 드라이버 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.커넥터 연결 성공!!");
		
			//2. 1번 설정 커네턱로 db연결하고 승인
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공!");
			//3. 2번에서 연결된 것을 가지고 sql 생성
			String sql = "update bbs set title = ?, content = ? where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title); 
			ps.setString(2, content); 
			ps.setInt(3, no);
			
			System.out.println("3. sql문 생성 성공!!");
			
			
			//4. 3번에서 생성된 sql문을 Mysql로 전송
			ps.execute();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //에러정보를 추적해서 프린트해줘.
			System.out.println("에러발생함.!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}// delete
	
	
	public void delete(int no) {
		try {
			//1. 연결한 부품(커넥터, driver, 드라이버 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.커넥터 연결 성공!!");
		
			//2. 1번 설정 커네턱로 db연결하고 승인
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공!");
			//3. 2번에서 연결된 것을 가지고 sql 생성
			String sql = "delete from bbs where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no); //물음표 번호 1번에 id로 저장한 변수를 넣어죠!
			
			System.out.println("3. sql문 생성 성공!!");
			
			
			//4. 3번에서 생성된 sql문을 Mysql로 전송
			ps.execute();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //에러정보를 추적해서 프린트해줘.
			System.out.println("에러발생함.!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}// delete
	
	public void insert(String title, String content, String writer) {
		//Java-DB연결 (JDBC) 4단계
		//1. 연결한 부품(커넥터, driver, 드라이버 설정
		try {
			//try/catch
			//외부자원연결(db, network, cpu, file, ....) 
			//너무 위험한 상황!
			//상황이 발생했을 때 어떻게 대처할지를 반드시 써주어야 함.
			Class.forName("com.mysql.cj.jdbc.Driver");
						//패키지.대표클래스
			System.out.println("1.커넥터 연결 성공!!");
		
			//2. 1번 설정 커네턱로 db연결하고 승인
			// 1) url - ip + port + db명
			// 2) id, pw
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공!");
			//3. 2번에서 연결된 것을 가지고 sql 생성
			String sql = "insert into bbs values (null, ?, ?, ?)";
			//String site = "http://www.naver.com"
			//해당부품으로 만들어주어야 한다.
			//sql ==> PreparedStatement
			//site ==> URL
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title); //물음표 번호 1번에 id로 저장한 변수를 넣어죠!
			ps.setString(2, content);
			ps.setString(3, writer);

			
			System.out.println("3. sql문 생성 성공!!");
			
			
			//4. 3번에서 생성된 sql문을 Mysql로 전송
			ps.execute();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //에러정보를 추적해서 프린트해줘.
			System.out.println("에러발생함.!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}// insert

}
