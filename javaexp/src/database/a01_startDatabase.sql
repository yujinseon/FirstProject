/*
 # database 서버 설치
 
 1. admin 비밀번호 1111
 2. 설치완료 후,
 3. cmd 창에서
 	sqlplus
 	명령을 치면 DB가 설치된지 여부가 나온다.
 	
 #database client 설치
 1. help - eclipse market place
 2. dbeaver 21.2.5 install
 3. install anyway
 
 #jdbc 드라이버 설정
 C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
 파일을 아래 경로에 복사
 
 webapp\WEB-INF\lib\ojdbc6.jar
 
 ojdbc6.jar를 통해 eclipse의 deaver 클라이언트로 oracle서버에 연결 처리하기 위해 필요하다
 
 # 기본 계정 만들기
 C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql
 계정 폴드에 복사.
 C:\Users\jangh -> cmd 키면 계정 경로 나옴
 scott.sql
 
 cmd 창 켜고
 1.sqlplus
 2.id:system
 3.pw:1111
 4.@scott.sql // scott.sql 파일 불러오기
 5.conn scott/tiger; // 연결
 6.select * from emp; // 확인
 
 



 */