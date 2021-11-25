/*
# 여러가지 기능 조건문 처리
1. between
	1) 특정한 데이터를 범위에 설정하여 검색할 때, 사용된다
	2)형식
		컬럼명 between 시작범위 and 마지막 범위
		==> 컬럼명 => 시작범위 and 컬럼명 <= 마지막 범위
		

*/
-- 급여가 1000에서 2000사이의 데이터 출력
SELECT *
FROM emp 
WHERE sal BETWEEN 1000 AND 2000;

SELECT *
FROM EMP e 
WHERE empno BETWEEN 7600 AND 7900;

/*
# in 구문
1. 데이터는 논리연산자 or에 의해서, 여러가지 데이터의 합집합에 
대한 처리를 할 수 있다.
2. or 처리형식은 컬럼명 = 데이터1 or 컬럼명 = 데이터2로 컬럼명과 
데이터를 or로 계속 나열해야 한다
3. in 구문을 효과적으로 활용하면 보다 간편하게 or 데이터를 처리할 수 있다
4. 기본형식
	컬럼명 in (데이터1, 데이터2, ...)
*/
SELECT ename, deptno
FROM EMP e 
WHERE  deptno in(10,20);
-----
SELECT *
FROM EMP e 
WHERE  EMPNO IN(7499,7566,7369);

SELECT *
FROM EMP e 
WHERE job IN('SALESMAN','MANAGER');

/*
# in 구문을 활용한 SUBQUERY
1. 데이터는 특정한 query의 결과를 통해서, 다시 결과내용을 처리할 때가 있다
2. 이것을 subQuery라고 한다
3. 예를 들어 부서번호가 30인 사원번호를 먼저 추출한 후 , 이에 도출한
	사원번호를 다시 조회 조건 정보에 검색하게 처리할 수 있다
4. 이때 부서번호가 30인 사원번호는 main query인 사원정보를 조건으로 하는
	데이터 호출에 서브쿼리로 활용되는 것이다
5. 서브쿼리의 사용내용을 in 구문에 활용하여 데이터를 or로 처리할 수 있다

*/

SELECT empno
FROM EMP e
WHERE DEPTNO  = 30; -- 부서번호가 30번인사원번호를 추출
--- 도출된 사원번호를 or 검색을 효과적으로 처리하는 in 구문을 이용해서 검색 처리한다
SELECT *
FROM emp 
WHERE empno in(
	SELECT empno
	FROM EMP e
	WHERE DEPTNO  = 30

);
--- ex) 연봉 1000~3000 사이의 직책을 뽑아내어, 서브쿼리로 활용하여
-- 		이 직책에 해당하는 사원 정보를 출력하세요
SELECT job
FROM EMP e
WHERE sal BETWEEN 1000 AND 3000;


SELECT *
FROM emp 
WHERE EMPNO IN (
	SELECT EMPNO 
	FROM EMP e
	WHERE sal BETWEEN 1000 AND 3000
);

SELECT *
FROM emp 
WHERE job IN (
	SELECT job
	FROM EMP e
	WHERE sal BETWEEN 1000 AND 3000
);

