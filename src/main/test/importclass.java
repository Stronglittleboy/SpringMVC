import org.junit.Test;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class importclass {
    @Test
    public void test01(){
        //翻译：内部资源视图解析器

        new InternalResourceViewResolver();
        new DispatcherServlet();
        new CharacterEncodingFilter();
    }
}
