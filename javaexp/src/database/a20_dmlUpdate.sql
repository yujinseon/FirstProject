/*
 # 데이터 수정
 1. update 명령문은 테이블에 저장된 데이터 수정을 위한 조작어이다
 2. 기본형식
 	update 테이블명
 		set 컬럼1 = 변경할데이터,
 		set 컬럼2 = 변경할데이터,
 		set 컬럼3 = 변경할데이터
 	where 조건문
 3. 주의사항
 	1)where 절을 생략하면 테이블의 모든 행이 수정된다
 	2) 조건문과 변경할 데이터부분을 subquery를 이용하여 처리할 수 있다.
 * */
--사원번호가 7369인 사원테이블의 이름을 홍길동으로 변경
UPDATE EMP100 
	SET ename ='홍길동'
WHERE empno =7369;

SELECT *FROM emp100;
UPDATE EMP100 
	SET ename ='김철수',
	job='대리',
	mgr=9999,
	HIREDATE =SYSDATE 
WHERE empno =7499;

UPDATE emp100 
	SET sal = 4000,
	deptno =20
WHERE job ='MANAGER';

UPDATE emp100 
	SET sal = sal*1.3,
	deptno =deptno+10
WHERE job ='MANAGER';

UPDATE EMP100 
	SET sal=sal*1.5,
		comm=100
WHERE deptno =10;

SELECT *FROM emp100;

/*
 #데이터 삭제
 1. 데이터는 조건에 의해서 행단위로 삭제된다.
 cf) 열단위로 null을 처리할려면 update를 처리한다.
 2. 형식
 	delete --행단위로 삭제되기 때문에 컬럼을 지정하지 않는다
 	from 테이블 
 	where 비교조건
 * */
DELETE 
FROM EMP100 
WHERE ename='홍길동';

DELETE 
FROM EMP100 
WHERE deptno =10 AND sal<1000;