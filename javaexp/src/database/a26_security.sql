/*
 # 데이터베이스 보안을 위한 권한 설정
 1. 데이터 베이스 관리자(DBA)는 사용자가 데이터베이스
 객체(테이블,view,sequence..)에 대한 특정 권한을 
 가질수 있게 하여, 다수의 사용자가 데이터베이스에
저장된 정보를 공유하면서도 정보에 대한 보안이 이루어지도록 한다.
2. DB 서버에 접근시 필요한 사용자 계정/암호를 통해 로그인 인증을 받는다
3.권한의 역할의 종류
	1)create user : 사용자를 새롭게 생성하는 권한
	2)drop user : 사용자를 삭제하는 권한
	3)drop any table : 테이블을 삭제하는 권한
	4)query rewrite: 함수 기반 인덱스 생성권한
	5)backup any table : 테이블 백업 권한
	6)create session : 데이터베이스에 접속할 수 있는 권한
	7)create table/view/sequence/procedure
		데이터베이스의 객체들을 생성하는 권한 

# 사용자 생성하기
사전에 scott계정에 dba 권한부여
관리자 계정으로 접근
sqlplus
conn system/wlstjs123;
grant dba to scott;	
conn scott/tiger;

1. create user 사용자명 identified by 비밀번호
ex) create user orauser01 identified by user01;
2. 접속 권한을 할당. 처리
	grant 권한명 to 계정명;
	CREATE SESSION to orauser01; -->CREATE SESSION 접속할 수 있는 권한 부여
ex) grant CREATE SESSION to orauser01;
create user orauser01 identified by user01;
CREATE SESSION to orauser01;
conn orauser01/user01;
show user;
			
ex) himan/7777 계정을 만들고, 접속권한을 부여한 후 접속확인
sqlplus 
Enter user-name: system
Enter password: wlstjs123
grant dba to scott; --권한부여
conn scott/tiger; -- scott 계정으로 연경 
create user himan identified by 7777;
grant CREATE SESSION to himan;					
conn himan/7777;
show user;									
										
*/
/*
 # 사용자계정별로 자원에 대한 접근 권한 설정.
 1. 테이블 생성 권한 부여
 	grant create table to 계정명;
 	ex) grant create table to orauser01;
 2. 전체 자원에 대한 권한 부여
 	grant resource to 계정명;
 * */
GRANT CREATE TABLE TO orauser01;
SELECT *
FROM DBA_USERS 
WHERE username='ORAUSER01';

/*
# 사용자 암호변경
1. 기본 형식
alter user 사용자명 identified by 패스워드;

 * */
SELECT * 
FROM DBA_USERS;
ALTER USER user01 IDENTIFIED BY 5555;

ALTER USER user02 IDENTIFIED BY 5555;

/*
계정이 lock 걸린 경우
1. 계정 정책에 의해 @@회 이상 암호를 잘못 입력한 경우
2. 계정 정책에 의해 계정만료기간 도래시
3. 처리할 sql
	alter user 사용자 계정 identified by 패스워드 account unlock;
	
 * */
CREATE USER himan IDENTIFIED BY 1111;
alter user himan identified by 7777 account unlock;
--ex) system계정에서 higirl 계정을 만들고, 비밀번호 변경과 계정 unlock 처리를 하세요
create user higirl identified by 1111;
alter user higirl identified by 7777 account unlock;
SELECT * 
FROM DBA_USERS;