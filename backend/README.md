# backend

### 指南：

这是面向开发者的说明：

#### 准备工作
- 创建mysql数据库，命名为infectstatisticwebdb
- 在创建的数据库中运行src\main\resources\sql下的.sql文件
- 将backend文件夹作为idea工程打开
- 将src\main\resources\application.yml中的数据库账号密码改为你本地的

#### 运行
- 右键src\main\java\com\infect\backend\BackendApplication.java运行
- 在浏览器输入localhost:8888/hello，若返回一个json格式的helloworld数据，则说明运行成功

#### 接口说明
- 全国当日数据：localhost:8888/nations/all
- 各省当日累计确诊：localhost:8888/statistics/provinces/confirmed 
- 各省当日现有确诊：localhost:8888/statistics/provinces/currentconfirmed
- 某省当日疫情数据：localhost:8888/statistics/provinces/one/{省名}
- 某省当日所有城市疫情：localhost:8888/cities/list/{省名}
- 某省疫情趋势：localhost:8888/statistics/provinces/one/tends/{省名}
