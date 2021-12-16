-- unique : 다른 데이터와 식별되게 입력하지 않으면 에러 발생..
CREATE TABLE student08(
	sno number(4) CONSTRAINT student08_sno_uq unique
);
DROP TABLE stuent08;
SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE table_name LIKE 'STUDENT08%';
INSERT INTO student08 VALUES(10); --같은데이터는 입력이 안됨
INSERT INTO student08 VALUES(null); -- UNIQUE는 NULL 중복을 허용

CREATE TABLE student09(
	sno number(4) CONSTRAINT student09_sno_uq UNIQUE,
	sname varchar2(50) CONSTRAINT student09_name_nn NOT NULL,
	kor number(3)
);

SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE table_name LIKE 'STUDENT09%';

INSERT INTO STUDENT09 VALUES (2021,'유진선',null);
SELECT *FROM STUDENT09;
--primary key : 데이터를 입력시 중복도 허용하지 않고, null도 허용되지 않는 
-- 제약조건을 설정할 때, 사용된다
CREATE TABLE STUDENT10(
	sno number(3) CONSTRAINT student10_sno_pk PRIMARY KEY
);
SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE table_name LIKE 'STUDENT10%';
INSERT INTO STUDENT10 VALUES(10);
INSERT INTO STUDENT10 VALUES(10); -- 에러 중복데이터
INSERT INTO STUDENT10 VALUES(null); -- 에러 null값 허용되지 않는다

CREATE TABLE STUDENT11(
	sno number(4) CONSTRAINT student11_sno_pk PRIMARY KEY,
	sname varchar2(50) CONSTRAINT student11_sname_nn NOT NULL,
	kor number(3),
	eng number(3),
	mat number(3)
);

SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE table_name ='STUDENT11';
INSERT INTO STUDENT11 VALUES(2022,'유진선',100,100,null);

/*
#check
1. 특정한 데이터를 조건이나 범위를 지정해서, 해당범위에 데이터만 입력되도록 처리하는 것을 말한다.
2. 형식
	컬럼명 데이터 유형 constraint 제약명 check(조건문 - where에 들어가는 sql문장)
	컬럼명 데이터 유형 check(조건문 - where에 들어가는 sql문장)
 */
 CREATE TABLE STUDENT12(
	gender varchar2(1) check( gender IN('F','M'))
);
DROP TABLE STUDENT12;
INSERT INTO STUDENT12 VALUES('F');
INSERT INTO STUDENT12 VALUES('M');
INSERT INTO STUDENT12 VALUES('K');

CREATE TABLE STUDENT13(
	kor number(3) check(kor BETWEEN 0 AND 100)
);
INSERT INTO STUDENT13 VALUES(100);
INSERT INTO STUDENT13 VALUES(0);
--studnet14 학번,학년(1~4), 이름(not null)

CREATE TABLE STUDENT14(
	sno number PRIMARY KEY,
	sgrade NUMBER(1) check(sgrade BETWEEN 1 AND 4),
	sname varchar2(50) NOT NULL,
	kor number(3) check(kor BETWEEN 0 AND 100),
	eng number(3) check(eng BETWEEN 0 AND 100),
	math number(3) check(math BETWEEN 0 AND 100)
);
DROP TABLE STUDENT14;
INSERT INTO STUDENT14 VALUES(201511460,4,'유진선',100,100,100);
SELECT *FROM STUDENT14;