Java Test Mockito Any Object Demo
=====================

当我们给mockito设置行为时，可以使用`any`告诉我们在某种条件下，不关心具体传入的对象。

这种情况比设置一个`null`要更加表意

注意：`any`是一个`matcher`，是用来验证的。传参数时应该使用`mock`

```
mvn test
```