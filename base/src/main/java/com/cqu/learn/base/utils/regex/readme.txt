正则表达式：规则表达式，regular expression
目的是用来匹配字符串中是否含有规则所指定的子符串

匹配规则：
1，单纯的字符表示匹配自己对应的字符，比如 a 匹配 a，& 匹配 & 等。但是特殊字符应该用什么呢？转义字符？还是位置不同？
2，[] 中括号中间的字符，用于匹配多个字符。如：[abc] 匹配 a、b、c
3，- 字符如果不在 [] 字符中，就表示匹配自己，如果在 [] 中，就表示匹配一系列字符，就是用来省略一些字符。比如：
[a-z]，表示匹配 abcdef...xyz，这里的 - 就是用户来省略中间的字符
4，^ 字符，在 [] 之内外也有区别。在外面，^7 表示，以 7 开头的数字，也就是说，^后面紧跟着一个字符，表示匹配以该字符开头的字符串
如果在 [] 内部，就表示匹配除了该字符串之外的字符串。[^81h]，表示匹配除了 81h 之外的字符串
5，. 这个小点用于匹配任意字符
6，\d 匹配数字，本来 b 就是用于匹配 b，加上转移字符就表示匹配数字
7，\D 匹配非数字
8，\s
9，\S
10，\w 匹配大小字母，数字，和下划线 _
11，\W 匹配非大小字母、数字、和下划线
12，?: 表示出现 0 次或者 1 次
13，+ 表示出现 1 次或者多次
14，* 表示出现 0，1，多次
15，{n} 表示出现 n 次
16，{n~m} 表示出现 n~m 次
17，{n,} 表示出现 n 次或者 n 次以上
18，XY 表示 X后面跟着 Y，这里的 X 和 Y 表示正则表达式
19，X|Y 表示或者匹配，food|f 匹配 food 或者 foof，而 (food)|f 匹配 food 或者 f
20，(X) 表示一个整体，加了括号就表示一个整体了
21，如果想要匹配 / 字符串，首先需要在被匹配的字符串里面写上两个 \\ ，在正则对象里面写上四个 \\\\
22，正则表达式的匹配，是按照单个字符来进行匹配的

如何使用 regex？
在 java.util.regex 包下，有一些正则表达式的工具类，主要是 Matcher 和 Pattern