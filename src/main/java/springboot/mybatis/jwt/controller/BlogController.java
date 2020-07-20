package springboot.mybatis.jwt.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.mybatis.jwt.model.Blog;
import springboot.mybatis.jwt.model.request_model.RequestBlog;
import springboot.mybatis.jwt.repository.BlogRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class BlogController
{

  Map<String,Object> map = new HashMap<String,Object>();
  @Autowired
  private BlogRepository blogRepository;
  @GetMapping("/blog")
  public ResponseEntity<Map<String,Object>> find()
  {
    ArrayList<Blog> allBlog = blogRepository.find();
    if(allBlog.isEmpty()) {
      map.put("message","Data not found");
      map.put("code",401);
    } else {
      map.put("message","Data has found");
      map.put("code",200);
      map.put("data",allBlog);
    }
    return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
  }
  @PostMapping("/search/{id}")
  public ResponseEntity<Map<String,Object>> find(@PathVariable("id") int id){
    ArrayList<Blog> blog = blogRepository.findById(id);
    if(blog.isEmpty()) {
      map.put("message","Data not found");
      map.put("code",401);
    } else {
      map.put("message","Data has found");
      map.put("code",200);
      map.put("data",blog);
    }
    return new ResponseEntity<Map<String, Object>>(map,HttpStatus.OK);
  }

  @PostMapping("/save")
  public ResponseEntity<Map<String,Object>> create(@RequestBody RequestBlog requestBlog)
  {
    ModelMapper mapper = new ModelMapper();
    Blog blogs = mapper.map(requestBlog, Blog.class);
    if(blogRepository.save(blogs)){
      map.put("message","Successful Save.");
      map.put("code",200);
    }else{
      map.put("message","Save failed.");
      map.put("code",401);
    }
    return new ResponseEntity<Map<String, Object>>(map,HttpStatus.OK);
  }

  @PostMapping("/update")
  public ResponseEntity<Map<String,Object>> update(@RequestBody Blog blog)
  {
    ModelMapper mapper = new ModelMapper();
    Blog blogs = mapper.map(blog, Blog.class);
    if(blogRepository.update(blogs)){
      map.put("message","Successful Update");
      map.put("code",200);
    }else{
      map.put("message","Update failed.");
      map.put("code",401);
    }
    return new ResponseEntity<Map<String, Object>>(map,HttpStatus.OK);
  }

  @PostMapping("/delete/{id}")
  public ResponseEntity<Map<String,Object>> delete(@PathVariable("id") int id){
    if(blogRepository.delete(id)) {
      map.put("message","Successful delete.");
      map.put("code",200);
    } else {
      map.put("message","Delete failed.");
      map.put("code",401);
    }
    return new ResponseEntity<Map<String, Object>>(map,HttpStatus.OK);
  }

}
