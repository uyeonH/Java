# 객체는 인터페이스를 사용해 참조하라

적합한 인터페이스만 있다면 매개변수뿐 아니라 반환값, 변수, 필드를 전부 인터페이스 타입으로 선언하라.

(예시)
```
// 좋은 예
Set<Son> sonSet = new LinkedHashSet<>();

// 나쁜 예: 클래스를 타입으로 사용
LinkedHashSet<Son> sonSet = new LinkedHashSet<>();
```

인터페이스를 사용하면 프로그램이 유연해진다. 나중에 구현 클래스를 교체하고자 할 때 새 클래스의 생성자를 호출하기만 하면 된다.

```
Set<Son> sonSet = new HashSet<>();
```

기존 사용하던 구체 클래스가 인터페이스 일반 규약 이외의 특별한 기능을 제공한다면 교체할 구체 클래스도 이 기능을 제공해야한다. 
LinkedHashSet이 따르는 순서 정책을 가정하고 동작하는 상황에서 HashSet으로 바꾸면 문제가 발생할 수 있다. 
구현 타입을 바꾸는 이유는 기존 것보다 성능이 좋거나 신기능을 제공하기 때문일 것이다.

적합한 인터페이스가 없다면 클래스로 참조한다. 
1. String, BigInteger 같은 값 클래스
  - final인 경우가 많고 상응하는 인터페이스가 별도로 존재하는 것은 드물다 
2. 클래스 기반으로 작성된 프레임워크가 제공하는 객체들
  - 특정 구현 클래스보다는 기반 클래스를 참조하는 것이 좋다. 
3. 인터페이스에 없는 특별한 메서드를 제공하는 클래스들 

적합한 인터페이스가 없다면 클래스 계층구조 중 필요 기능을 만족하는 가장 덜 구체적인 클래스(상위 )를 타입으로 사용하자