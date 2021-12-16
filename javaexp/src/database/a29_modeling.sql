/*
 # 데이터베이스 모델링
 1. exerd 모델링 툴 설치 -- help - install new software
 http://exerd.com/update 
 
 2. ERD
 Entity Relation Diagram
 Entity(개체) : 설계의 물리적 모델링에서 테이블로 만들어질 개체를 말한다.
 relation : 엔터티와 엔터티의 연관관계를 설정하는 것을 말한다.
 
 # 관계설정
 1:1 관계 : 테이블간의 관계가 1:1로 설정되는 경우
 		ex) 결혼(남,여) /학생과 소속 학과의 입장에서 1:1
 1:다 관계
 	테이블간의 관계가 1:다로 설정되어 있는 경우
 	한쪽 테이블에는 데이터가 하나의 행(row)인데, 이를 참조하는 다른 테이블은 행이
 	여러개인 경우를 말한다.
 	ex) 회원이 여러 개의 물건을 사다. 하나의 물건을 여러 회원이 구입
 필수관계(mandatory)
 	해당 테이블 관계가 반드시 있어야 하는 경우
 	ex) 사원의 부서번호 / 학생의 소속학과
 선택관계(optional)
 	관계에 있어서 있을 수도 있고 없을 수도 있는 경우를 말한다.
 	ex) 회원의 구매물품 / 
 복합키 설정
 	학생	수강	강좌
 	이와 같이 학생 강좌 수강이라는 테이블에서 수강은 학생번호와 강좌번호
 	두개 다를 기준으로 복합된 primary key로 설정할 수 있다
 	두개 다 다를 때, 다른 데이터를 입력이 가능하게 키를 설정하는 것을 말한다
 	학생		강좌			수강
 	홍길동	컴퓨터공학		1	1
 	홍길동	컴퓨터공학		1	1 동일시 primary key 에러 발생
 	홀길동	데이터베이스	1	2 홍길동은 같지만 강좌가 다르기 때문에 입력 가능
 	
 식별과 비식별관계 설정
 	식별관계 : 참조하는 컬럼이 해당 테이블에 위 수강테이블과 같이
 			key로 사용할떄를 말한다
 			학생테이블의 학생번호가 수강테이블에 강좌테이블의 강좌변호와 함계 key로 사용되는데
 			이럴 때는 식별관계라고 한다. 한 라인의 선으로 표현
 			장점) 간단한 테이블간의 연관관계를 설정하고, 또 다시 해당 테이블과 연관관계가
 			일어나지 않는다면, 키를 위한 컬럼의 갯수를 줄이고, 데이터로 간편하게 처리할 수 있다
 			
 	비식별관계 : 참조하는 컬럼이 해당 테이블에 key가 아닌 컬럼으로 사용되는 것을 말한다.
 			비식별 관계는 점선으로 표현한다
 			ex) 사원테이블에 부서정보 테이블은 비식별관계에 있다
 			장점) 새로운 키를 만들었기 떄문에, 컬럼이 늘어난다는 단점은 있지만, 또 다른 테이블과
 			연관관계를 복잡하게 만들어야 할 때, 간편하게 하나의 컬럼으로 연관관계를 설정할 수 있다
 			
 	
 	
 * */

CREATE TABLE book(
	bookid NUMBER PRIMARY KEY,
	bookname varchar2(40),
	publisher varchar2(40),
	price number
);

CREATE TABLE customer(
	custid NUMBER PRIMARY KEY,
	name varchar2(40),
	address varchar2(40),
	phone varchar2(40)
);

CREATE TABLE orders (
 orderid NUMBER PRIMARY KEY,
 custid NUMBER REFERENCES customer(custid),
 bookid NUMBER REFERENCES book (bookid),
 orderdate DATE,
 saleprice NUMBER
);
DROP TABLE summer;
CREATE TABLE summer(
	sid number,
	class varchar2(30),
	price number
	
	
);

INSERT INTO summer VALUES(100,'fortran',20000);
INSERT INTO summer VALUES(150,'pascal',15000);
INSERT INTO summer VALUES(200,'c',20000);
INSERT INTO summer VALUES(250,'fortran',20000);

SELECT * FROM summer;

--ex) select sql 연습
-- 1. C강좌의 수강료
-- 2. 계절학기를 듣는 학생수와 평균 수강료
-- 3. 가장 싼 과목의 정보..

SELECT class, price
FROM summer
WHERE class='c';

SELECT count(*), avg(price)
FROM summer;

SELECT *
FROM summer
WHERE price = (SELECT min(price) FROM summer);

-- # 삽입이상 - 특정한 정보를 넣는데 필요 없는 컬럼은 null로 할당되어 사용이
--	필요없는 컬럼의 정보까지 넣어야 되는 현상
-- ex) 계절학기에 javascript를 30000에 할당
INSERT INTO summer(class,price) VALUES ('javascript',30000);
-- 수강인원의 문제 발생
SELECT count(*), count(sid)
FROM summer;


