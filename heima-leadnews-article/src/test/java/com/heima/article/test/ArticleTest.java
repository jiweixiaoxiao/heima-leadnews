package com.heima.article.test;

import com.heima.article.ArticleJarApplication;
import com.heima.article.service.AppArticleService;
import com.heima.article.service.impl.AppArticleServiceImpl;
import com.heima.common.article.constans.ArticleConstans;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.user.pojos.ApUser;
import com.heima.utils.threadlocal.AppThreadLocalUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ArticleJarApplication.class)
@RunWith(SpringRunner.class)
public class ArticleTest {
    @Autowired
    private AppArticleService appArticleService;

    @Test
    public void testArticle() {
        ApUser apUser = new ApUser();
        apUser.setId(2l);
        AppThreadLocalUtils.setUser(apUser);
        ResponseResult result = appArticleService.load(ArticleConstans.LOADTYPE_LOAD_MORE,null);
        System.out.println(result.getData());

    }
}
