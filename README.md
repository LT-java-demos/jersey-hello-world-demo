#Jersey hello world demo

##配置环境：
安装 JDK 8
- Mac
```
brew update
brew cask install java
```
- Linux
```
sudo apt-get update　
sudo apt-get install openjdk-8-jdk
```
安装Gradle
- Mac
```
$ brew install gradle
```
- Linux
```
sudo apt install gradle
```

##命令行运行
```
$ cd jersey-hello-world-demo
$ gradle build
$ gradle jettyRun
```
命令行会显示下列信息：
```
:compileJava UP-TO-DATE
:processResources UP-TO-DATE
:classes UP-TO-DATE
> Building 75% > :jettyRun > Running at http://localhost:8080/jersey-hello-world-demo
```

> 如果运行`gradle jettyRun`失败，查看`build.gradle`是否添加`jettyRunapply plugin: 'jetty'`

##验证结果
浏览器访问：[http://localhost:8080/jersey-hello-world-demo/hello](http://localhost:8080/jersey-hello-world-demo/hello)

>Hello world


