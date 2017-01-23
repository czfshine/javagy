ToJson Design Document
=============================


>This document presents issues that we faced while designing this project. It is meant for advanced users or developers working on this project. If you are interested in learning how to use this project, see its user guide.


关于最大深度
-------------------

在将java对象序列化成json字符串时，遇到成员，递归调用`tojson`，为防止函数堆栈溢出，或者环状引用，要给深度一个上限，超过这个上限时抛出`JsonLoop`异常，交由调用者处理。

同时提供了`trackPath` 函数，用来追踪序列化的路径。

关于成员类型
------------------------

除基本类型外，支持标准容器的序列化，对于其他对象，检查是否实现了`Jsonable`接口，也支持自定义序列化函数.

关于数组
-----------------------
对于內建数组，没有一个基本的类型用来重载以支持泛型，只能利用反射机制来模拟。

独立的写入器
-----------------------
设计独立的写入器是为了方便以后的扩展，除了最基本的`JsonWriter`（将java 对象序列化成json字符串），还可以扩展成`LuaWriter`（将java 对象序列化成`Lua table`），`PythonWriter`（序列化成`Python dict`）等。





