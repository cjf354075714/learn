java 访问限定词：public、（default）、protected、private
default不存在，只是一个默认的写法
对于一个类，他有自己的所在的包和自己的子类
public 代表不管是不是自己所在包，是不是自己的子类都可以访问，但是主动访问的类还是不能访问该类的私有方法
protected 代表子类和所在包都可以访问该类，但是不同包下的非子类，无法访问
default 代表该包下的类可以访问到这个类，default 就是不在 class 前面加上访问限定词，但是子类无法访问
private 表示只能自己访问自己，而且不能在一个类文件里面出现全部都是 private 的情况
内部类的访问修饰符和不同的类相同

与访问权限相关的是内部类基础：
内部类有四种形式：成员内部类、局部内部类、匿名内部类、静态内部类

成员内部类：该类在自己的外部类里，就相当于一个字段属性，内部类可以无条件访问外部类的所有字段和属性，记住是所有的
如何想要在外部类外面访问内部类，当然可以将这个内部类作为一个字段来对待，直接new
Parent.Child child = new Parent.Child();
如果要在外部类内部访问内部类的字段，需要在外部类里面定义一个类实例作为引用

局部内部类：指的是一个方法或则一个作用域 {} 之内的类，该类就相当于一个字段，不能拥有修饰符
有效的区域就在该方法或者作用域里面

匿名内部类：就是典型的监听器或者 Runnable 这个接口，匿名内部类没有构造函数，系统自动取名
Outter$1.class，一般来说匿名内部类用于重写某些方法，然后当作参数传递给某些对象

静态内部类：这个类就很好理解了，就是一个加了 static 的成员变量，一般来说都可以直接访问
除非加了 private，静态内部类不能访问外部类的非 static 的方法或者变量

深入理解内部类：
1，为什么成员内部类可以无限访问外部类的变量或者方法？
在使用  javac 编译一个包含内部类的 java 文件时，会自动生成两个 class 文件，命名方式是：
Outter.class Outter$Inner.class。
在编译的时候，就会给内部类创建一个包含外部类对象引用的作为参数的构造函数，所以内部类会拿到一个外部类
的引用，所以在不创建外部类的情况下，是不能创建内部类的，那么内部类的使用也就是在外部类的构建函数
里面初始化内部类

2，
