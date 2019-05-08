## 简介
本项目为`Springboot`的`maven`多模块示例

## 模块介绍
- `common-module`为公共模块，可以放对外`HTTP`接口的`DTO`、常用的工具包等
- `api-module`为`API`模块，为对外`HTTP`接口的服务实现

## 分支介绍
- [master](https://github.com/ruanjiehui/springboot-multi-module-demo/)和[boot-is-parent](https://github.com/ruanjiehui/springboot-multi-module-demo/tree/boot-is-parent)为父项目继承`Springboot`项目的示例
- [boot-is-not-parent](https://github.com/ruanjiehui/springboot-multi-module-demo/tree/boot-is-not-parent)为父项目没有继承`Springboot`项目的示例，可以用于继承自定义的父项目

## 使用
### 项目打包
各个示例都只需要在`springboot-multi-module-demo`所在的目录执行`mvn clean package`即可完成打包，在`springboot-multi-module-demo/api-module/target`目录下会有可执行的`jar`包

### 项目运行
1. 使用`java -jar api-module-1.0-SNAPSHOT.jar`即可运行项目
2. 在浏览器地址栏输入`http://127.0.0.1:8080/users`后按回车，可以看到页面上只有`[]`，因为没有任何数据