package springboot.mybatis.jwt.repository.provider;

import org.apache.ibatis.jdbc.SQL;

public class BlogProvider {

  public String select() {
	return new SQL(){{
	  SELECT("*");
	  FROM("blog");
	}}.toString();
  }
}
