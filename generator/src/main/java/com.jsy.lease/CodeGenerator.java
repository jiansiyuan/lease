package com.jsy.lease;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;
import com.jsy.lease.BaseEntity;
import static com.baomidou.mybatisplus.generator.config.builder.GeneratorBuilder.strategyConfig;

public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/lease?useUnicode=true&characterEncoding=utf-8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=GMT%2b8",
                        "root", "123456")
                .globalConfig(builder -> {
                    builder.author("jsy") // 设置作者
                            .outputDir("generator\\src\\main\\java")
                            .enableSpringdoc()

                            ;

                })
                .packageConfig(builder ->{
                        builder.parent("com.jsy.lease") // 设置父包名
                                .entity("model.entity")
                                .service("web.admin.service")
                                .mapper("web.admin.mapper")
                                .serviceImpl("serviceImpl")
                                .controller("controller")
                                .pathInfo(Collections.singletonMap(
                                        OutputFile.xml,
                                        System.getProperty("user.dir") + "/generator/src/main/java/com/jsy/xml"
                                ))
                                ;}
                )
                .strategyConfig(builder -> {
                    builder.entityBuilder().enableFileOverride()
                            .enableLombok()
                            .superClass(BaseEntity.class)
                            .enableTableFieldAnnotation()
                            .mapperBuilder().enableFileOverride()
                            .enableBaseResultMap()
                            .serviceBuilder().enableFileOverride()
                            .formatServiceFileName("%sService")
                            .controllerBuilder().enableFileOverride()
                            .enableRestStyle();
                })
                .templateConfig(builder -> {
                    builder.entity("templates/entity.java");
                })

                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
