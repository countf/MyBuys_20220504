# MyBuys_20220504
<h1>目前能用页面 主页 login registers custmers inserData</h1>

## Not allowed to load local resource 浏览器加载图片失败
##### (1) 如果是tomcat运行的项目，需要配置tomcat虚拟路径：把文件存放路径目录映射到tomcat中，方法如下：a.找到tomcat的配置文件（\conf\server.xml）并打开b.在【host】与【/host】之间加入：<Context path="/file" docBase="E:\test" debug="0" reloadable="true"/>其中：【path】就是映射的路径，【docBase】就是你的文件所在路径c.调用方法：【E:\test】下有一张test.jpg的图片 【img 标签中的src改为“/file/test.jpg”】
