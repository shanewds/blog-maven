# blog-maven
基本的ssm框架的maven版本

<1>windows7下安装maven步骤
   第一步:首先电脑要安装jdk,具体步骤如下:
            环境变量配置步骤
             安装完JDK后配置环境变量  计算机→属性→高级系统设置→高级→环境变量
          1.系统变量→新建 JAVA_HOME 变量 。
          变量值填写jdk的安装目录（eg. E:\Java\jdk1.7.0)
          2.系统变量→寻找 Path 变量→编辑
            在变量值最后输入 %JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;
          （注意原来Path的变量值末尾有没有;号，如果没有，先输入；号再输入上面的代码）
 
         3系统变量→新建 CLASSPATH 变量
            变量值填写   .;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar（注意最前面有一点）
           系统变量配置完毕
         4. 环境检测
            （1）JDK配置成功，在dos命令下运行javac
            （2）JRE配置成功，在dos命令下运行java -version
   第二步:下载Maven的安装包，下载链接：http://maven.apache.org/download.cgi
       点击 apache-maven-3.2.2-bin.zip 链接下载 3.2.2版本的mavn包。
       下载后的文件为apache-maven-3.2.2-bin.zip 压缩包，将其解压到一个固定的文件夹。放在某一个磁盘下如:E:\server\apache-maven-3.2.2
       而maven仓库所存放的位置是:E:\server\RepMaven; 修改E:\server\apache-maven-3.2.2\conf\settings.xml 
       添加仓库的位置<localRepository>E:\server\RepMaven</localRepository>
       
       在下面的系统变量框点新建，加入如下内容：
           MAVEN_HOME
           E:\server\apache-maven-3.2.2 注意这里是maven的安装路径
       然后编辑Path变量在最后增加 ;%MAVEN_HOME%\bin;
       
       验证是否安装成功。点击windows左下角的"开始"，在搜索框中输入cmd，然后回车就可以打开windows的命令提示符窗口，
       然后输入 echo %M2_HOME% 命令查看设置的环境变量，输入mvn -v 查看maven的版本，如果安装成功则显示maven版本;
