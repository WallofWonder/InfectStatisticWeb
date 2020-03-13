# 代码规约

## 后端

### 命名规约

- 变量命名

    成员变量、局部变量都统一使用lowerCamelCase风格，必须遵从驼峰形式，不能以 `_` 或者 `$` 开始，布尔类型的值以`is`开头

    ```
    正例：userName / contentType / xmlFileReader / isAnimal
    反例：Username / ContentType / xmlfilereader / _name / $age
    ```

- 方法、类命名

    方法命名采用驼峰命名法，与成员变量、局部变量相同，getter、setter方法严格以get、set开头

    ```
    正例：getHttpMessage() / setName(String nname) / showAllStates()
    反例：returnHttpMessage() / Setname(String name) / showallstates()
    ```

    一般类命名使用UpperCamelCase风格，（领域模型的相关命名）DO / BO / DTO / VO等除外。

    ```
    public class Article / public class PasswordValidator
    ```

    特殊类的命名规则如下：

    - 抽象类以Abstract开头

        ```
        public abstract class AbstractClass
        ```

    - 异常类以Exception结尾

        ```
        public class NoMappingException extends Exception
        ```

    - 枚举类以Enum结尾

        ```
        public enum CardEnum
        ```

    - 如果接口提供了某种能力，以对应能力的形容词（通常为-able）做类名

        ```
        public class Translator extends Translatable
        ```

    > **建议：**如果使用到了设计模式，在类名中体现出具体模式，利于阅读者快速理解架构设计思想

    ```
    public class OrderFactory
    ```

- 常量

    常量、枚举变量命名全部大写，单词间用下划线隔开，力求语义表达完整清楚，不要嫌名字长。

      ```
      正例： MAX_STOCK_COUNT
      反例： MAX_COUNT
      ```

- 包命名

    统一使用小写，点分隔符之间有且仅有一个自然语义的英语单词。包名统一使用单数形式，但是类名如果有复数含义，类名可以使用复数形式。

    ```
    正例：应用工具类包名为com.alibaba.open.util、类名为MessageUtils（此规则参考spring的框架结构）
    ```

- 禁用不规范的缩写，避免望文不知义

    ```
    反例： AbstractClass → AbsClass；condition → condi
    ```

### 常量定义

- long或者Long初始赋值时，必须使用大写的L，不能是小写的l，小写容易跟数字1混淆，造成误解。

    ```
    正例：Long a = 2L
    反例：Long a = 2l
    ```

- 不要使用一个常量类维护所有常量，应该按常量功能进行归类，分开维护。大而全的常量类，非得使用查找功能才能定位到修改的常量，不利于理解和维护。

### 格式规约

- 缩进采用4个空格，禁止使用tab字符，若使用tab，则应在编辑器中设置将tab用4个空格替换。

- 每行最多字符数限制不超过 120个，超出需要换行，换行时遵循的原则如下：

    - 第二行相对第一行缩进 4个空格，从第三行开始对齐第二行。
    - 运算符与下文一起换行。
    - 方法调用的点符号与下文一起换行。
    - 在多个参数超长，逗号后进行换行。
    - 在括号前不要换行。

    ```
    StringBuffer sb = new StringBuffer();
    // 第二行相对第一行缩进 4个空格，从第三行开始对齐第二行。
    // 方法调用的点符号与下文一起换行。
    sb.append("zi").append("xin")
    	.append("huang") 
    	.append("huang")
    	.append("huang");
    
    // 反例：在括号前不要换行
    sb.append("zi").append("xin").append
    	("huang");
    
    // 运算符与下文一起换行。
    String str = "hello" + ....
    	+ "world"
    
    // 参数列表过长，逗号后进行换行。
    method(args1, args2, args3, ... argN,
    	argsX);
    ```

- 方法最大行数不宜超过60行，确保能在一屏显示完整的方法实现，针对逻辑较为复杂的方法，重构建议如下：

    - 发现方法中有重复代码的时候，可以将它封装成一个新的方法
    - 若方法可以分成好多个子功能，尽量将其抽取出来作为单独的方法

- 空行和换行规则

    - 大括号

        如果是大括号内为空，则简洁地写成`{}`即可，否则：

        - `{` 左侧不换行，右侧换行
        - `}` 左侧换行，右侧如果还有`else`、`while`等不换行，否则换行

        ```
        正例：
        // 大括号内为空，则简洁地写成{}即可
        public void emptyMethod() {}
        
        if (a == 1) {
        	...
        } else if {
        	...
        } else {
        	...
        }
        // 终止括号后换行
        do {
        	...
        } while (b != 1)
        
        反例：
        public void emptyMethod() {
        }
        
        if (a == 1) {
        	...
        } 
        else {
        	...
        }
        
        ```

    - 类之间，类变量和方法之间，方法与方法之间空一行提高可读性

        ```
        class User {
        
            public int id;
            public String name;
            public Date birthday;
            
            public void method1() {
            	...
            	...
            }
            
            public void method2() {
            	...
            	...
            }
            
            ...
        }
        
        class Article {
        	...
        }
        ```

    > 若某方法体内的代码量大且无规律，不建议所有代码粘在一起写，可以酌情添加空行将子步骤分离开，提高阅读体验

### 控制语句

- 在`if`/`else`/`for`/`while`/`do`语句中必须使用大括号，即使只有一行代码

    ```
    正例：if (condition) {
            statements;
         }
    反例：if (condition) statements;
    ```

- 逻辑上超过 3层的if-else代码可以使用卫语句，或者状态模式来实现。

- 定义对象、变量、获取数据库连接、不必要的try-catc操作尽量移至循环体外处理。

### 注释规约

- 类、类属性、类方法的注释必须使用Javadoc规范，使用`/* */`格式，不得使用`// `方式。

    ```
    正例：
    /**
     * MyClass
     * 描述
     *
     * @author xxx
     * @version xxx
     * @since xxx
     */
    class MyClass {
        ...
    
        /**
         * 描述
         *
         * @param arg
         * @return
         * @throws Exception
         */
         public void method(int arg) throws Exception {
            ...
         }
    }
    
    反例:
    // MyClass
    // 描述
    class MyClass {
        ...
    
        // 描述
        public void method(int arg) throws Exception {
            ...
        }
    }
    ```

- 方法内部单行注释，在被注释语句上方另起一行，使用`//`注释。方法内部多行注释使用`/* */`注释，注意与代码对齐。

    ```
    public void method() {
        // 单行注释
        int a = 1;
    
        /*
        多行
        注释
        */
        int b = 2;
    
        反例：
        int c = 3; // 单行注释
    
        // 多行
        // 注释
        int d = 4;
    }
    ```

- 若语句本身就能够很好的表达其功能，就不必添加多余的注释来解释其功能。

    ```
    反例：
    // 设置name的值为"Michael"
    setName("Michael");
    
    本例中方法名已经很清楚地说明这条语句的作用，不需要添加额外的解释性注释。
    ```

- 若是代码被注释掉，可以用`//`注释，且必须在被注释代码上方说明不使用这段代码的原因。

## 前端

- HTML  

    - 用两个空格代替tab进行缩进(防止不同环境下tab缩进不同导致展现不同)。
    - 嵌套元素应该缩进一次
    - 在自闭合的元素的尾部添加斜线
    - 不能省略可选的结束标签(closing tag)
    - 为html根元素指定lang属性
    - 明确声明字符编码，一般为UTF-8
    - 根据HTML5规范，在引入CSS和JavaScript文件时一般不需要指定type属性，因为text/css和text/javascript分别是它们的默认值。
    - HTML 属性应当按照以下给出的顺序依次排列，确保代码的易读性。     
        1. class
        2. id, name
        3. data-*
        4. src, for, type, href, value
        5. title, alt
        6. role, aria-*

- CSS  

    - 为选择器分组时，将单独的选择器放在一行。  
    - 为了获得更准确的错误报告，每条声明都应该独占一行  
    - 对于以逗号分隔的属性值，每个逗号后面都应该插入一个空格（例如 ，box-shadow）。  
    - 十六进制值应该全部小写，例如，#fff。在扫描文档时，小写字符易于分辨，因为他们的形式更易于区分。  
    - 尽量使用简写形式的十六进制值，例如，用 #fff 代替 #ffffff。  
    - 避免为 0 值指定单位，例如，用 margin: 0; 代替 margin: 0px;。  
    - 相关的属性声明应当归为一组，并按照下面的顺序排列：  
        1. Positioning  
        2. Box model  
        3. Typographic  
        4. Visual   

    1.  由于定位（positioning）可以从正常的文档流中移除元素，并且还能覆盖盒模型（box model）相关的样式，因此排在首位。  
    2.  盒模型排在第二位，因为它决定了组件的尺寸和位置。  
    3.  其他属性只是影响组件的内部（inside）或者是不影响前两组属性，因此排在后面。  

    - 在需要显示地设置所有值的情况下，应当尽量限制使用简写形式的属性声明。  

- Vue  

    - 采用ESLint中的优先级A规则，即`"extends": "plugin:vue/essential"`