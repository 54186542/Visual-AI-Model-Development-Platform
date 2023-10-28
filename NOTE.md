## 2023/10/28

### 测试网络请求
    - 注解学习(放到Mapping注解的方法参数列表中)
        - @RequestParam("name") String name
            - 用来接收前端form表单的数据
        - @ModelAttribute User user
            - 可以实现form表单的数据映射
        - @RequestBody User user
            - 实现Post请求的数据映射**（不能是form表单，一个大坑，早上埋了好久）**

### 测试文件上传
    - 相关类
        - MultipartFile
            - 解释
                - 是springboot用来处理文件上传的一个类
            - 相关API
                - getOriginalFilename() -- 获取原始文件的文件名
                - getBytes() -- 将文件转换成字节数组
                - getInputStream() -- 将文件转换成字节输入流
                - getContentType() -- 获取上传文件的内容类型（MIME类型）
                - transferTo(File dest) -- 将文件下载到指定文件路径
            - 注意事项
                - springboot默认单个文件上传（1MB），多文件上传（10MB），需要更改默认配置，不然会报错
                - 相关配置
                    ```
                        spring:
                            mvc:
                                servlet:
                                    multipart:
                                        max-file-size: 10MB  		# 设置单个文件最大大小为10MB
                                        max-request-size: 100MB  	# 设置多个文件大小为100MB

                    ```
            - System类
                - 相关API(这个十分关键)
                    - System.getProperty("user.dir") -- **获取当前你写代码的那个文件目录**，后面跟你想要的文件夹（File.separator+"upload"）
            - File类
                - 相关API
                    - File.separator -- 获取操作系统的分割符(Linux \,Unix /,Windows \or/)
            