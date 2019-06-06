package edu.gdut.auto.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    //图片存放根路径
    @Value("${file.rootPath}")
    private String ROOT_PATH;
    //图片存放根目录下的子目录
    @Value("${file.userPicPath}")
    private String User_Pic_Path;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        /**
         * 用户图片，静态资源映射
         */
        registry.addResourceHandler("/userPic/**").addResourceLocations("file:"+ROOT_PATH+User_Pic_Path);
        super.addResourceHandlers(registry);
    }
}
