package springboot.mybatis.jwt.repository;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import springboot.mybatis.jwt.model.UserInfo;

@Repository
public interface UserInfoRepository
{
    @Select("SELECT * FROM user_info where username = #{username}")
    UserInfo findByUsername(String username);
}
