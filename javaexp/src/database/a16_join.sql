/*
 # 조인 
 1. 하나의 sql 명령문에 의해 여러 테이블에 저장된 데이터를 한번에 조회할 수 있는
 	기능을 말한다.
 2. 관계형 데이터베이스 분야의 표준으로 자리 잡고 있다.
 3. 두개 이상의 테이블을 결합한다는 의미이다.
 
 ---------------
 1.조인이 필요하지 않는 경우
 	사원 정보테이블에서 해당 관련 부서 정보를 가져와서
 	부서번호 정보를 통해서 부서정보를 출력할 때,
 	ex) 연봉이 3000이상인 사원이 있는 부서번호를 가져오자
 	
 **/
SELECT DEPTNO 
FROM EMP e 
WHERE sal >=3000;
-- ex) 위에서 확인된 부서번호를 통해서 부서테이블의 상세 정보를 확인
SELECT *
FROM DEPT d 
WHERE deptno IN (10,30);
-- 2. 조인이 필요한 경우
--	 연봉이 3000이상인 사원의 정보와 부서정보를 한꺼번에 확인할 떄,
SELECT  empno, ENAME, sal, e.DEPTNO ,dname,loc
FROM emp e, DEPT d 
WHERE e.DEPTNO  = d.DEPTNO 
AND sal>=3000;
--SELECT 선택 컬럼 : 중복된 컬럼만 alias이름을 지정해도 된다. e.DEPTNO
--from 테이블명 별칭, 테이블명 별칭 : 조인할 테이블을 별칭과 함께 나열한다.
--where 별칭.컬럼명 = 벌칭.컬럼 : 두개 테이블에서 공통으로 연결한 컬럼명을
--	 별칭과 함께 join 해준다. inner join이라고 한다
-- and 기타조건 : 그 외 조인한 내용의 데이터를 기준으로 조회 조건을 처리한다.

-- 1. 개별 테이블 확인
-- 연봉이 4000이상인 사원의 부서번호를 확인, 해당 부서 정보 출력
SELECT *
FROM EMP e 
WHERE sal>=4000;

SELECT *
FROM DEPT d ;

SELECT e.*,d.* -- 사원, 부서테이블의 모든 정보
FROM EMP e ,DEPT d  -- 두 테이블 별칭 지정 
WHERE d.DEPTNO = e.DEPTNO -- 연관관계 있는 컬럼 조인 처리
AND sal>=4000; -- 조건 설정

/*
 위 내용과 같이 단계별로 처리하세요
 직책이 manager인 사원정보를 조회하고, 이 사원정보의 부서번호를 확인하여,
 부서정보를 출력
 두개의 테이블 조인, 사원 정보와 부서정보를 출력
 **/
SELECT e.*,d.* 
FROM EMP e ,DEPT d 
WHERE d.DEPTNO = e.DEPTNO 
AND job LIKE 'MANAGER%';


-- 출력할 컬럼을 지정하되 연관관계가 없는 경우는 그대로 컬럼명을 설정하고
-- 공통된 컬럼이 있을 떄는 테이블명의 별칭으로 지정하여 처리한다
SELECT ename, job, dname, loc 
FROM EMP e ,DEPT d 
WHERE d.DEPTNO = e.DEPTNO 
AND job LIKE 'MANAGER%';
-- 출력할 컬럼을 지정하되 연관관계가 없는 경우는 그대로 컬럼명을 설정하고
-- 공통된 컬럼이 있을 때는 테이블명을 별칭으로 지정하여 처리한다
SELECT * 
FROM DEPT d ;
-- ex) 급여가 1000~3000사이의 부서명, 사원명, 급여를 출력하세요(JOIN 구문활용)
SELECT ename, dname, sal
FROM emp e, dept d
WHERE d.DEPTNO = e.DEPTNO 
AND sal BETWEEN 1000 AND 3000;
--부서위치 별로 평균 급여
SELECT loc, floor(avg(sal))
FROM emp e, DEPT d
where e.DEPTNO = d.DEPTNO
GROUP BY loc;

-- 부서명별 최고급여와 최저급여
SELECT dname, max(sal) 최고급여, min(sal) 최저급여
FROM emp e, DEPT d
where e.DEPTNO = d.DEPTNO
GROUP BY dname;

SELECT dname, max(hiredate), min(hiredate)
FROM emp e, DEPT d 
WHERE e.DEPTNO = d.DEPTNO
GROUP BY dname; -- 부서별로 신입, 가장 오래된 사원 입사 날짜를 출력
--1982-01-23 max
--1980-12-17 min
--날짜형 데이터의 함수 max는 최근 데이터, 최근에 날짜로 등록한 데이터, 최근에 입사한 날짜
-- 				min은 가장 오래된 데이터,최초로 등록한 날짜, 가장 먼저 입사한 날짜

SELECT loc, min(hiredate)
FROM EMP e ,DEPT d 
WHERE e.DEPTNO = d.DEPTNO
GROUP BY loc;

SELECT to_char(HIREDATE,'Q') "분기",dname,ename,loc
FROM EMP e ,DEPT d 
WHERE e.DEPTNO = d.DEPTNO
AND to_char(HIREDATE,'Q')='1';

SELECT dname, ename
FROM EMP e ,DEPT d 
WHERE e.DEPTNO = d.DEPTNO
AND dname ='SALES';

SELECT DECODE(to_char(HIREDATE,'Q'),'1','상반기','2','상반기','하반기') "상/하분기",
dname,loc
FROM EMP e ,DEPT d 
WHERE e.DEPTNO = d.DEPTNO
AND to_char(HIREDATE,'Q')='3'OR to_char(HIREDATE,'Q')='4';
-- to_number(to_Char(hiredate,'Q')>= 3 3분기 이상 --> 하반기
SELECT ename,
	CASE WHEN to_number(to_Char(hiredate,'Q'))<3 THEN '상반기'
		 ELSE '하반기'
	END "상/하분기 구분",
	dname,loc
FROM EMP e ,DEPT d 
WHERE e.DEPTNO = d.DEPTNO
AND to_number(to_Char(hiredate,'Q'))>=3;