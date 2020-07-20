package springboot.mybatis.jwt.repository;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import springboot.mybatis.jwt.model.Blog;

import java.util.ArrayList;

@Repository
public interface BlogRepository {

  @Select(SQL.SELECTED)
  ArrayList<Blog> find();

  @Select(SQL.FIND_BY_ID)
  ArrayList<Blog> findById(int id);

  @Insert(SQL.INSERT)
  boolean save(Blog blog);

  @Update(SQL.UPDATE)
  boolean update(Blog blog);

  @Delete(SQL.DELETE)
  boolean delete(int id);

  interface SQL {
    String SELECTED = "SELECT * FROM blog";
    String FIND_BY_ID = "SELECT * FROM blog WHERE id = #{id}";
    String INSERT = "INSERT INTO blog (title, content) VALUES (#{title}, #{content})";
    String UPDATE="UPDATE blog SET " +
            "title = #{title}, " +
            "content = #{content}  " +
            "WHERE id = #{id}";
    String DELETE = "DELETE FROM blog WHERE id = #{id}";
  }
}
