/*
# 테이블 이름 변경
rename 기존테이블명 to 변경할 테이블명;
# 컬럼명 변경
alter table 테이블명
rename column 기존컬럼명 to 변경할컬럼명;
 * */
RENAME emp10 TO emp10_new;
SELECT *FROM emp10_newl
ALTER TABLE emp10_new
RENAME COLUMN empno TO NO;
/*
 # 테이블 삭제
 1. drop table 테이블명;
 # 컬럼 삭제
 1. alter table 테이블명 drop column 컬럼명;
 **/
DROP TABLE emp10_new;
SELECT * FROM emp9;
ALTER TABLE emp9 DROP COLUMN deptno;

--ex) emp11_new 테이블을 복사테이블로 만들고,
-- 	컬럼명 deptno ==> deptnumber
-- emp11 로 테이블명 변경후 컬럼 hiredate 삭제,테이블도 삭제
CREATE TABLE emp11_new
AS
SELECT *FROM EMP; 

RENAME emp11_new TO emp11;
ALTER TABLE EMP11
RENAME COLUMN deptno TO deptnumber;
ALTER TABLE EMP11
drop COLUMN hiredate;
DROP TABLE emp11;

/*
 # 제약조건(constraint)의 추가와 삭제
 1. primary key
 	1) 키의 추가
 	alter table 테이블명 add primary key (컬럼명)
 	2) 키의 삭제
 	alter table 테이블명 drop primary key;
 2. 그 외의 제약 조건..
 	alter table 테이블명 add unique (컬럼명)
 	alter table 테이블명 add constraint 제약조건명 unique (컬럼명)
 	alter table 테이블명 add foreign key (컬럼명) reference 참조테이블 (컬럼명)
 	alter table 테이블명 add constraint 제약조건명 
 		foreign key (컬럼명) reference 참조테이블 (컬럼명)
 	# 참조키 관련 내용..
 		reference 참조테이블명(참조컬럼명)
 	#데이터가 삭제 수정되었을 때, 처리내용
 		on delete 옵션
 		on update 옵션
 	# 옵션 내용(oracle은 on delete에서만 적용)
 		no action : 참조 테이블이 변화(삭제) 있어도 기본 테이블에 영향 없음
 		cascade : 참조테이블의 변화(삭제)에 따라 기본 테이블도 수정/삭제
 		set null : 참조테이블의 변화로 기본테이블 데이터 null
 		set default : 참조테이블의 변화로 기본테이블의 데이터 기본값을 설정
  3. 제약조건 이름으로 삭제
  	alter table 테이블명 drop constraint 제약조건명;
 * */
SELECT *FROM emp9;
ALTER TABLE emp9 ADD PRIMARY key(empno);
ALTER TABLE emp9 DROP prinmary KEY;

-- 이름 정한 primary key 할당
CREATE TABLE dept11
AS
SELECT *FROM dept;
--복사할때는 constraint(제약조건)는 복사가 되지않는다
ALTER TABLE dept11
ADD CONSTRAINT dept11_deptno_pk PRIMARY key(deptno);
--foreign key
--	on delete cascade 설정 참조되는 부모 테이블 삭제시 지식 테이블의 값 삭제
CREATE TABLE emp11
AS 
SELECT*FROM emp;

ALTER TABLE EMP11
ADD CONSTRAINT emp11_deptno_fk foreign key(deptno)
REFERENCES dept11(deptno) ON DELETE CASCADE;
SELECT *FROM emp11;
SELECT *FROM dept11;
DELETE FROM dept11
WHERE deptno=10;

--ex) emp12, dept12 dept12에 primary key 생성
-- 	 on delete 옵션을 null로 처리하여 수행결과를 확인
CREATE TABLE emp12
AS 
SELECT*FROM emp;
CREATE TABLE dept12
AS 
SELECT*FROM dept;
ALTER TABLE dept12
ADD CONSTRAINT dept12_deptno_pk PRIMARY key(deptno);
ALTER TABLE EMP12
ADD CONSTRAINT emp12_deptno_fk foreign key(deptno)
REFERENCES dept12(deptno) on delete set null;
SELECT *FROM emp12;
SELECT *FROM dept12;
DELETE FROM dept12
WHERE deptno=20;
--ex) emp13, dept13 dept13에 primary key 생성
-- 	 on update 옵션을 set null로 처리하여 수행결과를 확인
CREATE TABLE emp13
AS 
SELECT*FROM emp;
CREATE TABLE dept13
AS 
SELECT*FROM dept;
ALTER TABLE dept13
ADD CONSTRAINT dept13_deptno_pk PRIMARY key(deptno);
ALTER TABLE EMP13
ADD CONSTRAINT emp13_deptno_fk foreign key(deptno)
REFERENCES dept13(deptno) ON delete set null;
SELECT *FROM emp13;
SELECT *FROM dept13;
DELETE FROM dept13
WHERE deptno=10;
-- on delete : oracle 적용
-- on update : mysql에서 적용 , oracle on update 옵션 지원하지 않음