## 一、项目概述

MyBuys 是基于 **SSM\(Spring\+SpringMVC\+MyBatis\)** 搭建的传统 JavaWeb 电商后台管理项目，适配 Tomcat 部署，实现**厂商管理、品牌管理、图片上传、用户注册登录**等基础电商后台功能，采用 Maven 依赖管理，前端 HTML\+JSP，数据库 MySQL。

## 二、项目架构目录

```Plain Text
MyBuys_20220504
├── src/main
│   ├── java/com/neuedu                # Java源码根包
│   │   ├── controller                 # 控制器层（所有请求接口）
│   │   │   ├── BrandContrller.java        # 品牌接口
│   │   │   ├── ManufacturerContrller.java # 厂商接口
│   │   │   ├── imageContrller.java        # 图片上传接口
│   │   │   ├── UserContrller.java         # 用户登录注册接口
│   │   │   ├── registerContrller.java     # 注册控制器
│   │   │   ├── indexContrller.java        # 首页跳转
│   │   │   ├── gotoContrller.java         # 页面跳转控制器
│   │   │   └── test01.java                # 自定义测试接口
│   │   ├── dao                       # Mapper持久层（MyBatis接口）
│   │   ├── entity                    # 实体类（厂商/品牌/用户/图片POJO）
│   │   └── service                   # 业务层（接口+impl实现类）
│   ├── resources                     # 配置文件目录
│   │   ├── db.properties             # MySQL数据库连接配置
│   │   ├── log4j.properties          # 日志配置
│   │   ├── mybatis.xml              # MyBatis全局配置
│   │   └── spring.xml               # Spring容器整合配置
│   └── webapp                       # 前端资源+部署目录
│       ├── static                   # 静态资源
│       │   ├── css / js / font      # 样式、脚本、字体
│       │   ├── image / picture      # 上传图片存储目录
│       ├── WEB-INF
│       │   ├── jsp                  # jsp页面
│       │   └── web.xml              # web项目部署描述符
│       ├── index.html/login.html     # 前端静态页面
│       └── test.html                # 测试页面
├── test_20220418.sql                # 项目数据库初始化脚本
├── pom.xml                          # Maven依赖配置
└── .gitignore                       # git忽略配置
```

## 三、技术栈

### 后端

- 核心框架：SSM（Spring5 \+ SpringMVC \+ MyBatis3）

- 数据库：MySQL5\.7\+

- 安全加密：Apache Shiro（密码 SHA\-1 加盐加密）

- JSON 序列化：Alibaba FastJSON

- 项目构建：Maven3

- 部署容器：Tomcat8\.5\+

- 日志：Log4j

### 前端

- 页面：原生 HTML \+ JSP

- 静态资源：CSS、JS、Font 字体

- 文件上传：SpringMVC MultipartFile 实现本地磁盘存储

## 四、核心功能模块

1. **Manufacturer 厂商管理**：单条查询、全量查询、增删改查

2. **Brand 品牌管理**：绑定所属厂商 ID，品牌 CRUD

3. **图片上传模块**：前端上传图片至`webapp/static/image/picture`，数据库保存图片路径

4. **用户模块**：注册、登录，Shiro SHA\-1 \+ 用户名加盐密码加密

5. **测试接口**：test01 控制器内置各类功能测试接口（加密、文件删除、路径获取等）

## 五、环境部署步骤

### 1\. 数据库初始化

1. 本地安装 MySQL，新建数据库`mybuys`

2. 执行项目根目录`test_20220418.sql`，自动生成数据表（厂商、品牌、用户、图片表）

### 2\. 修改数据库配置

打开`resources/db.properties`，修改 MySQL 账号密码：

```properties
jdbc.driver=com.mysql.cj.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/mybuys?useSSL=false
jdbc.username=你的数据库账号
jdbc.password=你的数据库密码
```

### 3\. Maven 导入依赖

```bash
# IDEA内刷新Maven，自动下载pom.xml所有依赖
# 或命令行 mvn clean install
```

### 4\. Tomcat 部署运行

1. IDEA 配置 Tomcat8\.5，部署项目上下文

2. 启动 Tomcat，默认访问地址：`http://localhost:8080/项目名/index.html`

#### 4\.1 【重要】Tomcat 外置图片虚拟路径配置（图片回显必配）

> 项目支持图片存储在**项目工程外的本地磁盘目录**，若图片不在项目`webapp`内部，必须配置 Tomcat 虚拟映射，否则前端 img 标签 404 无法加载预览图片。
>
>

##### 配置步骤

1. 找到 Tomcat 安装目录：`tomcat/conf/server.xml`并打开；

2. 在`<Host> </Host>`标签中间添加 Context 标签配置：

```xml
<!-- path：前端访问虚拟路由前缀，docBase：图片真实本地磁盘存放路径 -->
<Context path="/file" docBase="E:\test" reloadable="false"/>
```

- `path="/file"`：固定前端访问前缀，不可随意修改；

- `docBase="E:\test"`：替换为项目实际图片保存目录；

> 适配本项目开发路径示例：
>
>

```xml
<Context path="/file" docBase="D:/study/java/javaweb/untitled/MyBuys_20220504/src/main/webapp/static/image" reloadable="false"/>
```

3. 修改配置文件后**重启 Tomcat 配置生效**。

##### 前端页面使用规则

磁盘真实路径：`E:\test\test.jpg`
页面 img 标签写法：

```html
<img src="/file/test.jpg"/>
```

浏览器访问地址：`http://localhost:8080/file/test.jpg`

##### 补充说明

1. 图片保存在项目`webapp/static`内部时**无需配置虚拟路径**，直接使用`src="/static/image/xxx.jpg"`访问；

2. Linux 生产环境：docBase 改为服务器绝对路径，例：`docBase="/usr/local/mybuys/upload"`，path 保持`/file`不变。

## 六、现有测试接口（test01 控制器）

> 接口统一后缀`.do`，Rest 风格返回 JSON / 文本
> \| 接口地址 \| 功能说明 \|
> \| \-\-\-\- \| \-\-\-\- \|
> \| `/testManManufacturerService.do` \| 根据 ID=1 查询单条厂商，返回 JSON \|
> \| `/testBrdBrandService.do` \| 根据厂商 ID=1 查询关联品牌列表 \|
> \| `/hash.do` \| Shiro SHA\-1 加盐密码加密（用户名 \+ 明文密码加密） \|
> \| `/imagePath_test.do` \| 根据图片主键 ID 查询数据库存储的图片路径 \|
> \| `/test02.do?file=xxx` \| 单文件上传至 D 盘本地路径 \|
> \| `/test03.do` \| 获取项目部署真实磁盘路径 \|
> \| `/delete.do` \| 删除指定路径本地图片 \|
>
>

## 七、扩展方向

1. 图片上传优化：统一存至项目`static/picture`，动态获取容器真实路径

2. 完善分页：厂商 / 品牌列表分页查询

3. 前后端分离：替换 JSP 为 Vue，接口统一 JSON 返回

4. 图片云端存储：替换本地存储为 OSS 对象存储

## 八、注意事项

1. 文件上传路径：开发环境默认本地 D 盘路径，生产环境改用`ServletContext.getRealPath()`动态路径

2. 密码加密规则：`SimpleHash("SHA-1",用户名,明文密码)`，盐值 = 用户名

3. 静态资源访问：`/static/xxx`直接浏览器访问图片、css、js 资源

