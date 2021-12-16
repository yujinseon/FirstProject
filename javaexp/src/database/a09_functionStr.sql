/*
# 기타 문자열 조작함수
1. concat (문자열1, 문자열2) : 두 문자열을 결합처리한다
	문자열1 || 문자열2 동일..
	concat(concat(문자열1, 문자열2),문자열3)
		문자열1||문자열2||문자열3
	ex) concat('sql','plus') ==>sqlplus
2. substr(문자열데이터, 시작위치, 시작위치에서 갯수) :
	문자열 데이터를 시작위치와 마지막위치를 기준으로 절삭처리하여
	사용하는 것을 말한다
	index : 0부터시작하는 경우/1부터 시작하는 경우
	ex) substr('sql*plus',5,4)==>plus
		sql*plus
		12345 	p부터 추출
			plus
			1234 4개추출
		5번째 부터 시작해서 4개의 문자를 추출하여 데이터를 표현한다.
	ex) 코드성 데이터 - 사번, 주민번호, 학번에는 각각의 위치별로 의미하는 
	바가 있기 떄문에 추출하여 데이터 활용한다.
	주민번호의 경우 생년월일을 위치에 따라 추출할 수 있다.

*/
SELECT CONCAT('홍','길동') show FROM dual;
SELECT '홍'||'길동' show FROM dual;
SELECT ename, job, ename||' - '||job show1,
	CONCAT( CONCAT(ename,' - '),job) show2
FROM emp;
SELECT substr('hello',2,3) FROM dual;
SELECT ename, substr(ename,3,2) 
FROM emp;

SELECT '851210-1952718' civilCode, 
	substr('851210-1952718',1,2) YEARs, 
	substr('851210-1952718',3,2) Months, 
	substr('851210-1952718',5,2) dates 
FROM dual;
/*
3. instr : 특정 문자가 출현하는 첫번째 위치를 반환 처리
	instr('sql*plus','*')==>4
	
**/
SELECT instr('sql*plus','*') FROM dual;
-- 해당 문자가 없을 때는 0, 있을 때는 1부터 시작하여 해당 위치를 반환한다.
SELECT ename,instr(ename, 'A') "A의 첫번째 위치"
FROM emp;

--ex 직책에서 문자 'S'를 검색해서 그 문자의 위치를 추출하세요
SELECT job ,instr(job, 'S') "S의 위치"
FROM emp;
/*
4. lpad/rpad : 오른쪽/횐쪽 정렬후 왼쪽/오른쪽으로 해당 크기보다 못한 데이터일 때는
	지정한 문자열 추가
	###4427
	423@@@
	
	lpad : left padding
	rpad : right padding 
	
*/
SELECT  LENGTH (ename) FROM emp;
SELECT max(LENGTH(ename)) FROM emp;

SELECT lpad(ename,6,'#') FROM emp;

SELECT max(LENGTH(job)) FROM emp;
SELECT lpad(ename,6,'#') ename,rpad(job,9,'$') job FROM emp;

SELECT rpad(ename,10,'$') "사원 이름",lpad(job,10,'&')AS 직책
FROM emp;

-- ps 추후 데이터 유형을 char()고정형데이터, varchar2()가변형 데이터를
-- 문자열형으로 설정할 떄, 가변형 데이터를 고정형 데이터를 할당할 때, 사용된다
/*
5. ltrim/rtrim : 왼쪽/오른쪽 지정 문자를 삭제할 때, 사용된다
	1) 문자열에 왼쪽으로 부터 특정 문자열을 삭제하거나
		오른쪽에 있는 문자열을 삭제할 때 활용된다
	2) 공백데이터나 필요없는 데이터가 양 옆에 붙어있는 경우 삭제해 버리고 사용할 때 쓴다
*/
SELECT ltrim('****sql****','*') FROM dual;
SELECT rtrim('****sql****','*') FROM dual;

SELECT ltrim(ename,'A'), RTRIM(job,'N')  
FROM emp;

select *
from emp
where ltrim(ename,' ') ='HIMAN';
'	HIMAN','HIMAN' ==> 검색을 해서 처리 해준다
where ename = ltrim('	HIMAN', ' ');
