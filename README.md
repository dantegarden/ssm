# ssm

> 一个标准的用于前后分离的java快速开发平台
- 基于Maven模块化开发，可快速实现个性化业务模块

### 技术栈
- 核心框架：Spring5
- WEB框架：SpringMVC5
- ORM框架：MybatisPlus3
- 数据库： Mysql
- 数据库连接池：HikariCP
- ~~安全框架：Spring Security~~
- 模板框架：velocity（用于代码生成）
- 日志框架：slf4j + logback
- 开发工具：lombok
- 前端框架：vue2.5
- UI库：Element-UI
- 异步通信: axios

### 项目结构
- ssm：父级（聚合）模块
- ssm-common：公共通用模块
- ssm-dao：数据持久模块
- ssm-service：服务层模块
- ssm-web：控制层模块
- ssm-autocode：代码生成器


### 软件环境
- JDK1.8+
- MySQL5.6+
- Tomcat7.0+
- Maven3.0+
- Eclipse或者IDEA（IDE开发环境）

### 命名规范
-  获取单个对象的方法用 get 做前缀
-  获取多个对象的方法用 list 做前缀
-  获取统计值的方法用 count 做前缀
-  插入的方法用 save(推荐) 或 insert 做前缀
-  删除的方法用 remove(推荐) 或 delete 做前缀
-  修改的方法用 update 做前缀

### 本地部署
- 从git上下载代码
- 创建数据库，导入default.sql脚本
- 修改web模块下application.properties文件，修改数据库配置信息
- 可以使用maven的tomcat plugin启动项目，也可自己安装tomcat
- 通过http://localhost:8080/ssm访问

