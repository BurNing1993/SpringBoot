package com.joey.admin.listener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.File;


/**
 * 应用启动做一个一次性事情
 * 创建静态文件目录
 * @author Joey
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Value("${app.static-path-prefix}")
    private String staticPathPrefix;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        File dir = new File(staticPathPrefix);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }
}

