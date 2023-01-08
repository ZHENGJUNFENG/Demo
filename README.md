### Description

1. 安装JDK8
2. 安装maven3.6以上仓库
3. 编译命令
   mvn clean -DskipTests install
4. 启动主类
   com.example.demo.DemoApplication
5. postman调用路径 http://127.0.0.1:8080/api/uploadData
   传参数 body
   {
   "msg":"789"
   }

6. 查看项目路径下的logs的uploadData-test.log
   记录了请求数据

