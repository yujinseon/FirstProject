/*
 # non equi join
 1. 조인하는 두개의 데이블의 값이 동일하지 않고, 범위로 조인하는 경우를 말한다
 2. select
 	from 테이블1, 테이블2
 	where 대상컬럼 between 범위1 and 범위2
 	테이블2(범위지정) : 회원등급(포인트따른 등급), 사원직급테이블, 권한별 테이블
 **/
SELECT *
FROM SALGRADE s;

SELECT e.ename,e.sal,s.GRADE 
FROM EMP e ,SALGRADE s
WHERE e.sal BETWEEN s.LOSAL AND s.HISAL; 

SELECT s.GRADE, e.*
FROM EMP e ,SALGRADE s
WHERE e.sal BETWEEN s.LOSAL AND s.HISAL
AND s.GRADE =4;

SELECT s.GRADE, e.job, e.sal
FROM EMP e ,SALGRADE s
WHERE e.job ='SALESMAN' 
AND e.sal BETWEEN s.LOSAL AND s.HISAL;

/*
 # outer join
 1. EQUI JOIN의 조인 조건에서 양측 칼럼 값 중, 어느 하나라도 NULL 이면
 '=' 비교 결과가 거짓이 되어 NULL 값을 가진 행은 조인 결과로 출력 불가
 NULL 에 대해서 어떠한 연산을 적용하더라도 연산 결과는 NULL
 	일반적인 EQUI JOIN의 예:
 	학생 테이블의 학과번호 칼럼과 부서 테이블의 부서번호 칼럼에 대한
 	EQUI JOIN (student.deptno = department.deptno) 한 경우
 	학생 테이블의 deptno 칼럼이 NULL 인경우 해당 학생은 결과로 출력되지 못함
 2. EQUI JOIN에서 양측 칼럼 값중의 하나가 NULL 이지만 조인 결과로 
 	출력할 필요가 있는 경우 OUTER JOIN 사용
 	OUTER JOIN의 예:
 	학생 테이블과 교수 테이블을 EQUI JOIN하여 학생의 지도 교수 이름 출력
 	조건 : 지도 학생을 한 명도 배정받지 못한 교수 이름도 반드시 함계 출력
 3. (+) 기호를 사용한 OUTER JOIN
 where 절의 조인 조건에서 OUTER JOIN 연산자인 '(+)' 기호 사용
 조인 조건문에서 **NULL이 출력되는 테이블의 칼럼에 (+) 기호 추가
 4. 기본구문 
 select 	table.column, table2.column
 from	 	table1, table2
 where		table.column = table2.column(+)		
 **/

SELECT DISTINCT deptno
FROM emp;

SELECT *
FROM dept;

SELECT e.ename,e.DEPTNO ,d.DEPTNO ,d.DNAME 
FROM EMP e ,DEPT d 
WHERE e.DEPTNO(+) = d.DEPTNO;

SELECT d.DNAME ,nvl(e.ENAME,'할당인원없음') ,nvl(e.sal,0) sal
FROM EMP e ,DEPT d
WHERE e.DEPTNO(+)=d.DEPTNO;


--아웃조인을 활용하여 부서위치와 사원명을 출력하되, 부서가 할당되지않는 사원명은 없음

SELECT d.loc ,nvl(e.ENAME,'없음') "사원명" 
FROM EMP e ,DEPT d
WHERE e.DEPTNO(+)=d.DEPTNO;

