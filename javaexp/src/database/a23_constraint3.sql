/*
 # foreign key 설정
 # 외래키 설정 관계
 1. 연관관계에 있는 두 테이블에 대하여, 한쪽 테이블에 있는 데이터 기준으로 다른쪽
 테이블의 데이터를 입력할 수 있게 하는 것을 말한다.
 	기준이 되는 테이블에 데이터가 없으면, 연관관계 있는 테이블에 다른 데이터를 입력할 때,
 	에러가 발생한다
 	ex)emp테이블의 deptno입력은 반드시 dept 테이블에 deptno가 입력되어 있을 때,
 	가능하다.
 	
 2. 기본형식
 	컬럼명 데이터유형 constraint 테이블명_컬럼명_fk references 테이블명(컬럼명)
 * */
--교수테이블 생성
CREATE TABLE teacher01(
	tno NUMBER PRIMARY KEY
);
INSERT INTO teacher01 VALUES(10);
INSERT INTO teacher01 VALUES(11);
INSERT INTO teacher01 VALUES(12);
SELECT *FROM teacher01;

CREATE TABLE student20(
	name varchar2(50),
	tno NUMBER CONSTRAINT student20_tno_fk REFERENCES teacher01(tno)
);
INSERT INTO student20 VALUES('홍길동',10);
INSERT INTO student20 VALUES('신길동',11);
INSERT INTO student20 VALUES('마길동',13); --에러 tno에 13이 없기 때문에

--ex) 물건테이블(물건번호, 물건명, 가격, 재고량)
--	  구매테이블(구매번호, 구매수량, 물건번호 -외래키 설정)

CREATE TABLE product01(
	pno NUMBER PRIMARY key,
	pname varchar2(50),
	price NUMBER,
	rcnt number
);
CREATE TABLE buy01(
	bno NUMBER PRIMARY KEY,
	bcnt NUMBER,
	pno NUMBER CONSTRAINT product01_pno_fk REFERENCES product01(pno)
);
INSERT INTO product01 VALUES(01,'음료수',4500,3);
INSERT INTO buy01 VALUES(11,3,01);
SELECT*from buy01;

SELECT pname,price 판매가격,bcnt 구매갯수,
		price*bcnt "총계",rcnt-bcnt "현재남은수량"
FROM buy01 b, product01 p
WHERE b.pno = p.pno;
--연산관계로 기본테이블의 컬럼으로 저장되는 데이터는 따로 컬럼을 만들어 저장하지 않는다
