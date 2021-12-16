/*
# keyword 검색을 처리하는 like
1. 저장된 데이터가 비슷한 키워드를 포함할 때, 검색되게 하는 것을 keyword검색이라고 한다.
2. 기본 형식
	where 컬럼명 like '%검색할문자열%';
	- 해당 컬럼안에 있는 데이터가 검색할 문자열을 포함하고 있으면 검색되게 처리하는 것을
		말한다.
3. keyword 검색 옵션
	1) 문자열의 위치에 상관없이 검색 : 컬럼명 LIKE '%문자열%'
	2) 문자열이 시작위치에 있을 때  : 컬럼명 LIKE '문자열%'
	3) 문자열이 마지막 위치에 있을때 : 컬럼명 LIKE '%문자열'	
 * */
SELECT empno, ename
FROM emp
WHERE LIKE '%A%'; -- 문자 'A'가 포함되어 있으면 검색되게 처리
--- 직책에 MAN 이라는 글자가 포함되어 있으면
SELECT empno, ename, job
FROM EMP e 
WHERE job LIKE '%MAN%';
------ 직책이 ER로 끝나는 문자열
SELECT ENAME , job
FROM EMP e
WHERE job LIKE '%ER';
--- 사원명이 S로 시작하는 문자열
SELECT ENAME , DEPTNO 
FROM EMP e
WHERE ENAME LIKE 'S%';

SELECT *
FROM EMP e
where ename like '%'||'WAR'||'%';

