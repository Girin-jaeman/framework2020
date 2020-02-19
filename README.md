# ibatis와 스프링 연동.
ibatis 쓰기 이전의 소스 코드는  주석처리 했음에 유의. 
[pre]
[code]
public class Emp01Dao2Impl implements Emp01Dao {
	SqlMapClient sqlMapClient;
	//I BATIS	
	//sqlmapclient는 트랜잭션 처리를 안해줌 트랜잭션은 개발자가 수동으로!
	//스타트 트랜잭션이나 엔드트랜잭션을 하고 그 사이에 쿼리를 날림.
	//셀렉트문의 경우 예외임 인서트에서 해야하나 예시를 위해 여기에 넣음.
	//쿼리 및 커밋은 end transaction이 이루어지기 전까지 대기 함. 
	//만일 커밋이 이루어지지 않고 엔드 되어버리면 롤백으로 넘어감.
	//mybatis의 경우 aop를 이용함.
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}
	
	@Override
	public List<Emp01Vo> selectAll() throws SQLException {
		List<Emp01Vo> list=null;
		sqlMapClient.startTransaction();
		try {
			sqlMapClient.commitTransaction();
			list= sqlMapClient.queryForList("selectAll");
		}catch (Exception e) {
		}
		sqlMapClient.endTransaction();
		return list;
	}
  [code]
  [pre]
