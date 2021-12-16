/*
 # subquery
 1. 개요
 하나의 sql 명령문의 결과를 다른 sql 명령문에 전달하기 위해 두 개 이상의
 sql명령문을 하나의 sql명령문으로 연결하여 처리하는 방법
 서브쿼리의 필요성
 예 : 교수 테이블에서 '전은지' 교수와 직급이 동일한 모든 교수의 이름 검색
 2. 처리방식
 	1. 교수 테이블에서 '전은지' 교수의 직급 검색 sql 명령문 실행
 	2. 교수 테이블의 직급 칼럼에서 1에서 얻은 결과 값과 동일한 직급을 가진 교수
 		검색 명령문 실행
 		1,2 sql 명령문 처리과정을 통합하여 하나의 sql 명령문으로 처리
 3. 실행순서
 	1) main query에 최하단에 있는 부분부터 실행해서 
 		결과를 가지고 상위에 있는 query로 전달한다.
 * */
-- 사원테이블에서 최고 급여자의 정보를 출력
SELECT *
FROM EMP e 
WHERE sal = (
	SELECT max(sal)
	FROM emp
);

SELECT *
FROM emp;

-- 입사 분기별로 최고급여자
SELECT to_char(HIREDATE,'Q'),e.*
FROM EMP e 
WHERE (to_char(HIREDATE,'Q'),sal) IN (
	SELECT to_char(HIREDATE,'Q'),max(sal)
	FROM EMP
	GROUP BY to_char(HIREDATE,'Q')
)
ORDER BY to_char(HIREDATE,'Q') asc;

-- ex) 직책별로 최고 급여자의 emp 전체 정보를 처리하세요
-- 1)직책별 최고 급여 
-- 2)다중열 처리 조건으로 사원정보 출력

SELECT *
FROM EMP e 
WHERE (job,sal) IN (
	SELECT job, max(sal)
	FROM emp
	GROUP BY job 
);

SELECT *
FROM EMP e 
WHERE (job,sal) IN (
	SELECT job,SAL 	
	FROM EMP e2 
	WHERE sal >=3000
);
--WHERE (job,sal) = 단일 데이터 서브쿼리
--WHERE (job,sal) IN (한개이상 데이터 서브쿼리) 
--직책별 최고급여를 사원정보 전체를 검색하여 처리하기 위한 쿼리

/*
#inline 뷰 처리(subqurey)
1. 조인한 테이블을 ()로 만들어 데이터를 일단, 먼저 처리한 후에 그 이후에
	다른 테이블과 조인 관계를 처리할 때 사용된다.
**/
-- 부서별 최고 급여자의 정보를 출력
SELECT *
from(
	SELECT DEPTNO, max(sal) msal
	FROM EMP e 
	GROUP BY DEPTNO 
) a,
emp e 
WHERE a.deptno = e.DEPTNO 
AND a.msal = e.sal;

-- inline view라고 사용자 정의 query를 가상의 테이블(뷰)로 만들어 
-- 연관관계 있는 테이블과 조인해서 데이터를 처리하는 것을 말한다.
-- ex) inline view로 부서번호가 10인 사원정보를 만들고 ()a 
-- emp b 두개의 테이블에서 sal가 같은 사원 정보를 출력하세요

SELECT *
FROM(
	SELECT *
	FROM EMP e 
	WHERE DEPTNO =10
) a, emp b 
WHERE a.sal = b.sal;

/*
1. inline 들어갈 쿼리를 만들고 () a 소괄호로 묶어서 alias명을 지정한다
2. join 테이블 alias명을 지정한다
3. 두테이블의 join 조건을 where 조건으로 처리한다.
 * */

--ex) 부서별 최근 입사자의 사원정보를 출력하세요
-- 부서별 최근 입사일 - 

SELECT *
from(
	SELECT deptno,max(HIREDATE) HIREDATE
	FROM EMP
	GROUP BY DEPTNO
) a, emp b
WHERE a.DEPTNO = b.DEPTNO
AND a.HIREDATE = b.HIREDATE;

