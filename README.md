# InfectStatisticWeb
结对作业2——疫情统计可视化

## 作业链接

作业要求：[https://edu.cnblogs.com/campus/fzu/2020SpringW/homework/10456](https://edu.cnblogs.com/campus/fzu/2020SpringW/homework/10456)

作业仓库：[https://github.com/WallofWonder/InfectStatisticWeb](https://github.com/WallofWonder/InfectStatisticWeb)



## 开发成员：

学号：221701233 

博客园链接：[https://home.cnblogs.com/sillyby/](https://home.cnblogs.com/sillyby/)

学号：221701234

博客园链接：[https://www.cnblogs.com/QEEZ/](https://www.cnblogs.com/QEEZ/)

## 项目介绍

springboot + vue 前后端分离的疫情统计可视化web应用

功能：

- [x] 全国疫情统计数据可视化，通过地图显示疫情的大致分布
- [x] 具体省份的疫情数据可视化，折线图展示疫情趋势
- [x] 指定省份的各市疫情数据概览
- [ ] 疫情新闻概览
- [ ] 同程查询
- [ ] 谣言鉴别

### 技术栈

**后端：**

springboot

mybatis

dozer

Slf4j

mysql

**前端：**

vue

echarts

## 构建和运行

从本仓库下载最新的源代码

项目结构如下：

```
|-- InfectStatisticWeb
    |-- .gitignore
    |-- codestyle.md
    |-- README.md
    |-- backend  		  	//后端
    |-- frontend			//前端
```



#### 后端

语言支持： java8.0以上

数据库：mysql8.0

- 将backend文件夹作为工程导入IDE
- 创建mysql数据库，命名为infectstatisticwebdb
- 在创建的数据库中运行src\main\resources\sql下的.sql文件
- 更新maven依赖
- 在src\main\resources\application.yml设置本地的数据库账号密码
- 右键src\main\java\com\infect\backend\BackendApplication.java调试或运行
- 等待数据库初始化完成
- 在浏览器输入`localhost:8888/hello`，若返回一个json格式的helloworld数据，则说明运行成功

#### **前端**

确保已经安装node和npm

开发者使用的版本:

node v12.15.0

npm 6.13.4

- 控制台进入frontend文件夹，导入npm依赖：

    ```undefined
    > npm install
    ```

- 运行

    ```
    > npm run serve
    
    控制台预期输出结果参考:
    > frontend@0.1.0 serve D:\GitHub_Projects\InfectStatisticWeb\frontend
    > vue-cli-service serve
    
     INFO  Starting development server...
    98% after emitting CopyPlugin
    
     DONE  Compiled successfully in 5603ms                                                                        1:40:20 PM
    
      App running at:
      - Local:   http://localhost:xxxx/
      - Network: http://192.168.0.7:xxxx/
    
      Note that the development build is not optimized.
      To create a production build, run npm run build.
    ```

- 在浏览器地址栏输入控制台打印的Local或者Network地址即可显示界面

## 部署

下载release包并解压缩（最新版本1.0.0）

包含两个文件

```
|-- InfectStatisticWeb-frontend-1.0.0.rar //前端
|-- InfectStatisticWeb-backend-1.0.0.jar //后端
```

- **后端**

    控制台进入后端jar包所在目录，输入命令运行，**默认运行在8888端口**：

    ```
    > java -jar InfectStatisticWeb-backend-1.0.0.jar
    
    控制台最后预期输出参考:
    2020-03-14 13:53:03.960  INFO 11344 --- [           main] com.infect.backend.BackendApplication    : Started BackendApplication in 7.812 seconds (JVM running for 8.263)
    ```

- **前端**

    将前端的rar压缩文件解压到Tomcat根目录的webapps文件夹下

    启动tomcat服务器

    在浏览器地址栏输入http://localhost:xxxx/InfectStatisticWeb-frontend即可访问本应用（xxxx是你本地tomcat服务器的端口号）
