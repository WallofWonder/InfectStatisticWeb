# backend

### 指南：

#### 准备工作
- 创建mysql数据库，命名为infectstatisticwebdb
- 在创建的数据库中运行src\main\resources\sql下的.sql文件
- 将backend文件夹作为idea工程打开
- 将src\main\resources\application.yml中的数据库账号密码改为你本地的

#### 运行
- 右键src\main\java\com\infect\backend\BackendApplication.java运行
- 在浏览器输入localhost:8888/hello，若返回一个json格式的helloworld数据，则说明运行成功

#### 接口说明
- 各省累计确诊：localhost:8888//statistics/provinces/confirmed 
- 各省现有确诊：localhost:8888//statistics/provinces/currentconfirmed
- 某省所有城市疫情：localhost:8888/cities/list/{省名拼音}
