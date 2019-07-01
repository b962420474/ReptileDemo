import com.reptile.ConsolePipeline;
import com.reptile.GithubRepoPageProcessor;
import us.codecraft.webmagic.Spider;

public class Main {

    public static void main(String[] args) {
        Spider.create(new GithubRepoPageProcessor()).
                addUrl("http://blog.sina.com.cn/s/articlelist_1487828712_0_1.html").
                addPipeline(new ConsolePipeline()).
                thread(5).
                run();
    }
}
