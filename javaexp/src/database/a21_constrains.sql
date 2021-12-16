/*
 # 데이터 무결성 제약조건의 개념
 1. 데이터의 정확성과 일관성을 보장
 2. 데이터의 정확성을 유지하여 다양한 종류의 업무규칙을 고려함
 	1) student 테이블에서 학년 데이터는 1,2,3,4 중의 하나만 입력
 	2) 모든 학번은 유일하게 처리
 	3) student 테이블의 지도교수 번호는 professor 테이블의 교수 번호 중의 하나와 반드시 일치
 3. 데이터 무경성 제약조건의 장점
 	1) 테이블 생성시 무결성 제약조건을 정의 가능
 		-생성후 제약조건 설정도 가능 
 	2) 테이블에 대해 정의, 데이터 딕션너리에 저장되므로 
 		응용프로그램에서 입력된 모든 데이터에 대해 동일하게 적용
 	3) 제약조건을 활성화, 비활성할 수 있는 융통성이 있다.
 4. 무결성 제약조건의 종류
 	1) not null : 열이 null을 포함할수 없음
 	2) unique key : 테이블의 모든 행에서 고유한 값을 갖는 열 또한 열조합을 지정해야한다
 		ex) 학번, 주민번호, 사원번호를 중복되지 않아야 한다
 	3) primary key : 해당 컬럼 값은 반드시 존재해야 하며 유일해야 한다.
 		not null과 unique가 결합된 형태
 		주로 테이블에서 식별해야할 컬럼 즉 key를 설정할 떄, 사용된다
 		ex) emp테이블의 empno, dept테이블의 deptno
 	4) foreign key : 한 열과 참조된 테이블의 열간에 외래 키 관계를 설정하고 시행
 		ex) 사원의 테이블의 부서번호는 반드시 부서테이블에 있느 부서번호이어야 한다
 	5) check : 해당 컬럼에 저장 가능한 데이터 값의 범위나 조건을 지정처리.
 		ex) student 테이블의 학년을 1,2,3,4 만 데이터로 넣을 수 있다.
 * */
SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE table_name LIKE '%EMP%';
-- 내장된 테이블로 현재 오라클 서버에 있는 모든 제약 조건을 볼 수 있다.
-- not null
-- 컬럼명 데이터유형 constraint 테이블_컬럼명_nn not null
CREATE TABLE student01(
	name varchar2(30) CONSTRAINT student01_name_nn NOT null
);
CREATE TABLE student03(
	name varchar2(30) NOT NULL -- 자동으로 규칙에 의해서 CONSTRAINT 이름 지정
);
SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE table_name LIKE 'STUDENT%';
-- 테이블 명은 대문자로 저장되어 있음

INSERT INTO student01(name) values('himan');
SELECT *FROM student01;
INSERT INTO student01(name) values(null);
-- name 제약조건에 not null로 지정했기 때문에 에러가 발생한다

CREATE TABLE student05(
	name varchar2(30) CONSTRAINT student05_name_nn NOT NULL,
	kor number(3,0)
);

DROP TABLE STUDENT;

CREATE TABLE student06(
	name varchar2(30) NOT NULL,
	kor number(3,0)
);
SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE table_name LIKE 'STUDENT%';
INSERT INTO student05 VALUES ('홍길동',85);
INSERT INTO student05 VALUES (null,85); -- 에러
INSERT INTO student05(kor) VALUES (85); -- 에러
INSERT INTO student05(name) VALUES ('마길동');
SELECT * FROM student05;
