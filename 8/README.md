# 8. Black Box Test
> 기능 명세를 바탕으로 Equivalence partitioning과 Pair-wise 테스팅을 수행한다.

### 🦋 1. 기능 명세
다음과 같이 프로그램에 대한 기능이 정의될 때 black box 기법을 이용하여 테스트 케이스를 결정하도록 한다.
(편의상 invalid case는 고려하지 않도록 한다. 즉 역명, 기차종류, 좌석 종류는 앞서 정의된 값이 정확하게 입력되는 것을 가정한다.)

<img width="500" alt="스크린샷 2022-12-12 오전 12 04 00" src="https://user-images.githubusercontent.com/76769044/206911310-1754f692-7238-4108-b109-4ec9743f1bdb.png">

### 🦋 2. Equivalence partitioning

출발역 4가지, 도착역 3가지, 기차종류와 좌석종류 3가지로 총 4X3X3 = 36가지 경우가 있다.

<img width="300" alt="스크린샷 2022-12-12 오전 12 06 59" src="https://user-images.githubusercontent.com/76769044/206911483-9db99013-4b9a-451e-bdc7-9d5b5ee90944.png"> <img width="300" alt="스크린샷 2022-12-12 오전 12 07 32" src="https://user-images.githubusercontent.com/76769044/206911503-ab3660ee-9efe-49c3-94ea-e5da4859c107.png">

### 🦋 3. Pair-wise Testing

1) PICT 설치

   Pairwise 테스팅 기법을 지원하는 도구로서 PICT를 활용한다.

   Window 에서 [pict33.msi](https://github.com/YeoJiSu/SoftwareEngineering-study-blog/blob/main/8/pict33.msi)을 실행하면, pict 설치 화면이 뜬다. 
   
   PICT를 설치하면 도움말파일(PICTHelp.htm)이 PICT 설치 디렉토리 (C:\Program Files\PICT)에 설치되므로 이 도움말 파일을 참조한다.

   <img width="500" src = "https://user-images.githubusercontent.com/76769044/206911686-4d1bbb25-ab66-4873-bae5-8387bec1a002.PNG"/>


2) txt 파일 작성

    train.txt에 아래와 같이 적는다. 
    ```
    출발역: 		서울, 대전, 동대구, 부산
    도착역: 		서울, 대전, 동대구, 부산
    기차종류: 	KTX, 새마을
    좌석유형: 	일반, 특실
      
    # KTX인 경우에만 특실이 존재한다. -> 새마을은 특실이 없다.
    IF [기차종류] = "새마을" THEN [좌석유형] <> "특실";
    # 출발역과 도착역은 다르다. 
    IF [출발역] = "서울" THEN [도착역] <> "서울";
    IF [출발역] = "대전" THEN [도착역] <> "대전";
    IF [출발역] = "동대구" THEN [도착역] <> "동대구";
    IF [출발역] = "부산" THEN [도착역] <> "부산"; 
    ```
3) 터미널에서 PICT로 해당 파일 실행

    pict로 train.txt를 실행한 내용을 Output.txt에 저장한다.
    
    ```bash
    $ pict train.txt > Output.txt
    ```

4) Output.txt 을 바탕으로 테스트 케이스 작성

    <img height="300" alt="스크린샷 2022-12-12 오전 12 16 38" src="https://user-images.githubusercontent.com/76769044/206912003-ee0488e3-ebe5-40f0-a1d2-2bec634b92b5.png"> <img height="300" alt="스크린샷 2022-12-12 오전 12 17 38" src="https://user-images.githubusercontent.com/76769044/206912055-daf9823f-5370-4eee-b096-7f88c9e280b2.png">


