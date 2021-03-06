# JAVA-DAY8
자바배우기 8일차 

클래스의 파생과 다형성

클래스의 파생으로 기존 클래스의 자신을 **상속**한 클래스를 만들 수 있다 extends 이용

파생되는 곳의 클래스를 **상위,부모 클래스** 파생에 의해 만들어진 클래스를 **하위,자식 클래스**라고 한다.

클래스의 파생에서 **생성자는 상속되지 않는다**

생성자의 앞 부분에서는 **super(...)**를 이용해서 상위 클래스의 생성자를 호출할 수가 있다.

생성자를 1개도 정의하지 않은 클래스에는 **super()**만을 실행하는 **디폴트 생성자**가 컴파일러에 의해 동적으로 정의된다.

상위 클래스의 비공개가 아닌 멤버는 **super.멤버명**에 의해 액세스 할 수 있다.

클래스 B가 클래스 A의 하위 클래스일 경우 클래스 B는 A의 일종이다. **is-A** 관계

상위 클래스형의 변수가 하위 클래스형의 인스턴스를 참조할 수 있는 점을 이용하면 **다형성**을 구현할 수 있다. 다형성을 포함한 메소드 호출에서는 호출해야 할 메소드가 프로그램 실행 시에 결정되는 **동적 결합**이 이루어진다.

하위 클래스형의 변수는 **캐스트** (type) 하지 않는 한 , 상위 클래스형의 인스턴스를 참조할 수 없다.

하위 클래스형에서 상위 클래스형으로 하는 변환은 **참조형의 확대변화(업캐스트)**, 그 반대 변환은 **참조형의 축소변환(다운 캐스트)**이다.

메소드에는 상위 클래스 것과 동등한 또는 느슨한 액세스 제한을 갖는 수식자를 할당 해야 한다. 그렇지 않으면 컴파일 에러 발생

상위 클래스의 메소드를 **오버라이드(상위 클래스와는 다른 정의를 할당해서 오버라이드)**하는 메소드에는 **@Override 애노테이션**을 선언한다.
(단, 부모클래스의 메소드가 private가 아니여야함)

@Override는 일종의 주석인데 컴파일러도 읽을 수 있는 주석이다.

================================================================================

추상클래스 , javadoc 기술

**abstract 선언**된 메소드는 **추상 메소드**이다. 추상 메소드는 메소드 본체를 갖지 않는다

1개라도 추상 메소드를 갖는 클래스는 **추상 메소드**로 정의해야 한다. 

추상 클래스의 **인스턴스**를 생성할 수 없다. ex) abstract class Test { ....} Test a=new Test() // 불가능

추상 클래스의 클래스형 변수는 이 클래스의 하위 클래스의 인스턴스를 참조할 수 있기 때문에 **다형성을 활용할 수 있다.**

상위 클래스의 **추상 메소드**를 **오버라이드**해서 본체를 정의하는 것을 **메소드를 구현한다** 라고 한다.

메소드 내에서는 동일한 클래스에 속하는 본체를 갖지 않는 추상 메소드를 호출할 수 있다. 호출되는 메소드는 프로그램 실행 시에 동적 결합에 의해 결정된다.

상위 클래스의 **비추상 메소드를** 하위 클래스에서**추상 메소드로 오버라이드 할 수 있다.**

Object 클래스의 비추상 메소드 public String toString()을 **추상 메소드로 오버라이드하면** 이 클래스에서 하위 클래스에 대한 **toString 메소드의 구현을 강요한다.**
문서화 주석의 형식 : "/** .....*/ "

문서화 주석의 대상은 클래스, 인터페이스, 생성자, 메소드, 필드이다.

문서화 주석에는 HTML 태그를 삽입할 수 있다.
