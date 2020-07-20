package springboot.mybatis.jwt.model.request_model;

public class RequestBlog {
  private String title;
  private String content;

  public RequestBlog(String title, String content) {
    this.title = title;
    this.content = content;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return "RequestBlog{" +
            "title='" + title + '\'' +
            ", content='" + content + '\'' +
            '}';
  }
}
