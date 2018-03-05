1、controller如何返回json? <br/>
1)添加依赖 com.fasterxml.jackson.core jackson-core 2.5.4 com.fasterxml.jackson.core jackson-databind 2.5.4 <br/>
2)使用controller添加@ResponseBody注解

2、controller如何返回json? 不需要添加任何依赖,只需要在bean上添加@XmlRootElement,属性上添加@XmlRootElement("xml标签别名") 详情见Message2

3、测试一个身份证件识别
