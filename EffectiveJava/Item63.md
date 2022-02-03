# 문자열 연결은 느리니 주의하라

문자열 연결을 +로 하는 것이 편리하지만 갯수가 많아지면 성능 저하를 가져온다. +로 문자열 n개를 잇는 시간은 n^2에 비례한다.

따라서 StringBuilder를 사용해야한다. 

## String, StringBuilder, StringBuffer

### String
불변의 속성을 갖는다. 다음과 같이 문자열을 변경했을 때 처음 할당된 메모리는 가비지로 처리되고 'Hello World!'는 새로운 메모리 영역에 할당된다. 
즉, 새로운 인스턴스가 생성된다. 그러니 문자열 변경이 잦으면 힙 메모리에 많은 가비지가 생성된다.

```
String s = "Hello";
s = s + " World!";
```

### StringBuilder
StringBuilder는 동기화를 지원하지 않아 멀티스레드 환경에서는 부적합하다. 단일스레드에서의 성능은 StringBuffer보다 뛰어나다.메

```
StringBuilder sb = new StringBuilder();
sb.append("ABC");
sb.append("DEF");
// sb.toString()
```

### StringBuffer
동기화가 가능해 멀티스레드 환경에서 안전하다.
