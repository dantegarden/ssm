package com.letinvr.autocode;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import javax.sql.DataSource;
import java.io.File;
import java.util.Arrays;

public class Generator {

    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://192.168.99.100:3306/ssm?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
    public static final String DB_USER = "root";
    public static final String DB_PWD = "123456";

    public static final String AUTHOR = "lij";
    public static final String PARENT_PACKAGE = "com.letinvr";
    public static final String OUTPUT_PATH = "d:/autocode_cache/";

    public static void main(String[] args) {
        String[] includes = (String[]) Arrays.asList("sys_code","sys_user").toArray();

        //获取桌面路径
        System.out.println("输出路径：" + OUTPUT_PATH);

        //1. 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setAuthor(AUTHOR)//设置作者
                .setIdType(IdType.AUTO)//设置id类型 主键自增
                //.setOutputDir("C:\\Users\\10334\\Desktop\\mp")//指定生成路径
                .setOutputDir(OUTPUT_PATH)//指定生成路径
                .setFileOverride(true)//多次生成文件覆盖
                .setBaseResultMap(true)//基本的SQL映射
                .setBaseColumnList(true) //基本列
                .setEnableCache(false)//生成基本的SQL片段
                .setActiveRecord(false)//是否支持ar 模式 会继承一个model
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        // .setEntityName("%sEntity");
        .setMapperName("%sMapper")
        .setXmlName("%sMapper")
        .setServiceName("%sService")
        .setServiceImplName("%sServiceImpl");
        // .setControllerName("%sAction")

        //2. 数据库配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)//设置数据库类型
                .setDriverName(DB_DRIVER)
                .setUrl(DB_URL)
                .setUsername(DB_USER)
                .setPassword(DB_PWD);

        //3. 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)//全局大写命名
                .setNaming(NamingStrategy.underline_to_camel)//下划线转驼峰式命名
                .setColumnNaming(NamingStrategy.underline_to_camel)
                //.setTablePrefix("tbl_")//设置表名前缀
                .setInclude(includes)//设置映射的表
                .setEntityLombokModel(true)//lombok配置
                .setEntityColumnConstant(true);//字段常量映射
        //.setEntityBuilderModel(true);
        // .setEntityBooleanColumnRemoveIsPrefix(true);


        //4. 包名策略配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(PARENT_PACKAGE)//指定父包
                .setMapper("dao.mapper")
                .setService("service")
                .setController("controller")
                .setEntity("dao.model.entity").setXml("xml");


        //5. 整合配置
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(globalConfig)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig);


        //6.执行
        autoGenerator.execute();
        System.out.println("生成完毕！");
    }
}
