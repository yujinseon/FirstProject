/*
# group by와 having 
1. 집합 함수를 처리할 때, group by절을 활용한다.
	select 그룹할컬럼, 그룹함수(sum, avg, max, min)
	group by 그룹할 대상 컬럼
	having 그룹함수의 조건 

 * */
SELECT *FROM emp;

SELECT deptno, max(sal) "최대 급여"
FROM EMP
GROUP BY deptno -- 부서번호별 최대 급여
HAVING max(sal)>=3000;-- 최대 급여가 3000이상인 경우만 검색

/*
 # 정렬 처리
 1. 정렬은 데이터의 컬럼별로 정렬 기준을 설정하여, 해당 컬럼의 데이터를
 기준으로 내림차순, 오르차순으로 처리할 수 있다.
 
 2. 기본형식
 	order by 컬럼명 asc|desc; //오름차순 /내림차순 정렬
 **/
SELECT deptno, empno , ename
FROM EMP e
ORDER BY deptno ASC, empno asc;
-- 1차로 부서번호를 기준 정렬, 부서번호가 같으면 사원번호를 기준으로 오름차순
SELECT sal, ename, deptno
FROM EMP e
ORDER BY deptno DESC;

SELECT mgr, EMPNO, ename
FROM EMP e
ORDER BY mgr asc;

SELECT ename, comm 
FROM EMP 
WHERE comm IS NOT NULL;
-- 데이터 유형이 숫자인 경우, 데이터베이스에서는 0인 경우와 null인 경유가
-- 구분되지만, 이 내용을 객체로 처리된 경우에는 동일하게 처리된다
-- 참고로 문자열인 경우에는 프로그램이나 DB나 둘다 NULL일 경우와 ""인 경우를 구분

SELECT ename, sal, comm, sal+comm
FROM emp 
WHERE comm IS NOT NULL;

SELECT ename, job, mgr
FROM EMP e 
WHERE mgr IS NULL;

/*
# null인 데이터의 함수 처리..
1. 위의 예제와 같이 데이터가 null인 경우에 연산처리가 불가능해진다
2. 이를 경우, 특정한 null인 경우에 default 데이터를 설정함으로 효과적인
데이터 처리할 수 있는데
3. 이것이 함수를 통한 null의 기본값 설정이라고 한다
4. 위 내용을 지원하는 함수가 nvl(데이터, null일때 초기값)이다
5. 기본형식
	숫자형 nvl(comm, 0) : 기본 데이터를 숫자 0으로 설정
	문자열형 nvl (ename, '') : 기본데이터를 문자''로 설정
6. 위와 같이 nvl은 기본 데이터를 설정할 수 있는데, 주의할 점은
	반드시, 해당 데이터 유형을 default 데이터를 설정하여야 한다
	nvl(comm, 0) : comm이 숫자형이기에 default로 숫자형인 0이 설정가능하다
	nvl(ename, '') : ename이 문자형이기에 default로 문자열형인 ''이 설정가능하다
7. select뿐만 아니라 조건문에도 활용하여 효과적으로 프로그램을 처리할 수 있다	
*/
SELECT ename, sal, comm,nvl(comm,0) ,sal+nvl(comm,0) "합산"
FROM emp ;

SELECT ename, mgr, comm
FROM emp 
WHERE mgr IS NULL OR nvl(comm,0)=0;
--- nvl(comm,0)= 0 을 통해서 0이거나 null인 값을 검색가능
