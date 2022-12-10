# Software-engineering-study-blog
> ### 부산대학교 3학년 2학기 채흥석 교수님의 『소프트웨어공학』 강의의 실습 내용을 정리한 저장소입니다.
## 블로그: [소프트웨어공학 Velog](https://velog.io/@diduya/series/%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4-%EA%B3%B5%ED%95%99)


## 📁 1. Recent accidents by software
### 📌 설명
- 논문.pdf 는 소프트웨어에 의해서 발생한 최근의 사고를 요약하고 있다. 
- 이 논문을 참고해서 2개의 사고를 선정하여 각 사고에 대해서 
    <pre>
    1) 사고 내용(일자, 장소, 피해 규모 등), 
    2) 사고 원인 분석, 
    3) 재발 방지 대책 
    </pre>
    등을 작성한다.

<br><br>

## 📁 2. Requirement Document
### 📌 설명
- 한국철도공사 코레일톡 앱에 대해 Requirement Document를 작성한다.

### 🎨 context model 구상도
   <img width ="500" src="2/구상도.jpg" >
   
<br><br>

## 📁 3. Use case diagram 
### 모델링 및 디자인 도구 : [Enterprise Architect](https://sparxsystems.com/)
### 📌 설명
- 한국철도공사 코레일톡 앱에 대해 Use case model를 작성한다.
- Enterprise Architect를 이용하여 아래 내용이 포함된 EA 파일 (.eap or .eapx)을 만든다.
    >  Use case diagram <br>
    > 각 Actor 및 Use case에 대한 개요: Actor 및 Use case의 Note에 기재
### 🎨 Use case model 구상도
  <img width ="500" src="3/구상도.png" >

<br><br>

# 📁 4. Class diagram
### 모델링 및 디자인 도구 : [Enterprise Architect](https://sparxsystems.com/)
### 📌 설명
- 문서에 기술된 원격 냉난방관리 시스템에 대한 problem statements를 바탕으로 UML class diagram을 만든다.

### 🎨 UML class diagram 구상도
<img width ="500" src="4/구상도.jpg" >

<br><br>

# 📁 5. Use Case Scenario, Class diagram, Sequence diagram
### 모델링 및 디자인 도구 : [Enterprise Architect](https://sparxsystems.com/)
### 📌 설명
-  한국철도공사 코레일톡 앱에 대해 Use case model을 작성한 것을 바탕으로 한가지 Use Case 에 대한 시나리오를 작성했다.
-  "할인/정기권 예매"에 대한 시나리오를 작성하고, 그에 대한 class diagram, sequence diagram을 만들었다.

### 시나리오

### 🎨 UML class diagram 구상도

### 🎨 UML sequence diagram 구상도

<br><br>

# 📁 6. Code Refactoring
### 사용 툴 : [IntelliJ IDEA for mac](https://www.jetbrains.com/ko-kr/idea/download/#section=mac)

### 📌 설명
- BeforeRefactoring 폴더 내의 SimpleStat 자바 파일을 AfterRefactoring 폴더 내에서 리팩토링을 수행한다.
- 덧셈, 곱셈하는 간단한 계산기로 보고 총 네 개의 class를 나누었고, 기능 별로 class 내 function으로 분류했다. 

<br><br>

# 📁 7. Template Method Pattern을 적용하여 Code Refactoring하기
### 사용 툴 : [IntelliJ IDEA for mac](https://www.jetbrains.com/ko-kr/idea/download/#section=mac)

### 📌 설명
- BeforeRefactoring 폴더 내의 Application 자바 파일을 AfterRefactoring 폴더 내에서 리팩토링을 수행한다.

### 🎨 UML class diagram
- 개선된 소스 코드를 대상으로 클래스 다이어그램을 작성했다.<br>
   <img width = "500" src="https://github.com/YeoJiSu/SoftwareEngineering-study-blog/blob/main/7/AfterRefactoring/classDiagram.png"/>
<br><br>

# 📁 8. Black Box Test
### ☞ 기능 명세를 바탕으로 Equivalence partitioning과 Pair-wise 테스팅을 수행한다.
### 사용 툴 : [Microsoft Installer 3.3](https://github.com/YeoJiSu/SoftwareEngineering-study-blog/blob/main/8/pict33.msi)

### 📌 설명
- black box 방법은 프로그램의 기능에 대한 명세를 바탕으로 테스트 케이스를 결정하는 방법이다.
- 아래와 같이 프로그램에 대한 기능이 정의될 때 black box 기법을 이용하여 테스트 케이스를 결정하도록 한다.

   |제목|내용|
   |------|---|
   |개요|프로그램 명: 기차 요금 계산 프로그램|
   |   |   → 기차 요금 계산 프로그램은 출발역명, 도착역명, 기차종류, 좌석유형, 좌석방향에 따라서 기차 요금을 결정한다.|
   |입력| 출발역 및 도착역명: 서울, 대전, 동대구, 부산|
   |   | 기차종류: KTX, 새마을이 가능하다.|
   |   | 좌석유형: 일반, 특실이 가능하고,  KTX인 경우에만 특실이 존재한다.|



<br><br>


# 📁 9. White Box Test
