/*

# 날짜함수
1. 날짜형 데이터 타입에 사용하는 함수
	1970/1/1
	1/1000초 ==> 1초 ==> (60)1분 ==> (60) 1시간
	==> (24)1일(*) ==> calendar 규칙에 의해 ..28/30/31
	1(월) ==>(12)1년..

2. 기본 연산
	기본 +1은 1일을 기준으로 처리 된다
	1) 날짜 +/- 숫자 : 해당 일자의 일수를 가산(감산)하여 처리
	2) 날짜 +/- 1/24 : 시간단위 연산 처리
	1일이 24시간이기 때문에 5시간 이후인 경우, 날짜 5/24를 처리한다
	cf) sysdate는 현재날짜 시간을 나타낸다
	 
*/
SELECT sysdate "현재날싸/시간",
	sysdate +1 "내일 24시간 이후",
	sysdate -1 "전날 24이전 날짜",
	sysdate +(8/24) "현재로부터 8시간이후",
	sysdate +(30/60/24) "현재부터 30분 이후"
FROM dual;
/*
1일 -1시간
24/24 1일
8/24 8시간을 계산해서 처리
10/60/24 10분을 처리
1시간 30분 sysdate (1/24)+(30/60/24) // +(90/60/24)  
*/
--
SELECT SYSDATE +3 "3일후",
	SYSDATE +100 "100일후",
	SYSDATE -(5/24) "5시간전",
	SYSDATE -(3/24) "3시간전",
	SYSDATE +(50/60/24) "50분후",
	SYSDATE +(90/60/24) "1시간 30분후"
FROM dual;	

SELECT ename, hiredate, hiredate+1 "1일 이후",
	hiredate -100 "입사 100일전"
FROM emp;
--
SELECT ename, hiredate, hiredate+120 "인턴기간", 
	hiredate -(8/24) "입사 8시간전", 
	floor(SYSDATE - hiredate) "근무일수"
FROM emp;
/*
# 날짜함수
1.SYSDATE : 오라클에서 서버시스템의 현재 날짜와 시간
2. months_between(날짜1,날짜2) :
	날짜 사이의 개월을 월단위로 계싼
	기준 단위가 1 ==> 1월
	1개월 => 1, 15일 =>0.5 1월을 기준, 일/시/분/초 단위 등으로
		소숫점으로 계산이 된다
3. 소숫점이하에 대한 처리는 trunc, floor를 이용해서 절삭 처리를 해준다.
	1.5 개월을 개월차로 ceil, 개월수는 trunc, floor
4. add_months(날짜형데이터, 추가할개월수) : 
	해당 날짜에 개월을 더한 날짜 계산 
5. next_day(날짜,'요일'):대상 날짜로부터 다가오는 첫번째 요일에
	해당하는 날짜
6. last_day(날짜) : 대상날짜의 월의 마지막날짜	
*/
SELECT ename, hiredate, sysdate 
	--MONTHS_BETWEEN((SYSDATE, HIREDATE) "근무개월수1" , 
	--floor(MONTHS_BETWEEN(SYSDATE, HIREDATE)) "근무개월수2", 
	--floor(MONTHS_BETWEEN(SYSDATE, HIREDATE)/12) "근무연한"
FROM emp;
-- 오늘로 부터 100일후의 개월수 / 1000일후 
SELECT FLOOR(MONTHS_BETWEEN(SYSDATE+100,SYSDATE)),
	mod(FLOOR(MONTHS_BETWEEN(SYSDATE+1000,SYSDATE)),12) "개월"
FROM dual;
--15개월인 경우 trunc(15/12) 1년이 처리되고
--mod(15/12) 12로 나눈 나머지값을 가져와서 3개월을 뽑아낼수 있다
--
SELECT 
	trunc(MONTHS_BETWEEN(sysdate + 1000, sysdate)) "1000일후 개월수",
	trunc(MONTHS_BETWEEN(sysdate + 1000, sysdate)/12) "1000일후 연한",
	mod(trunc(MONTHS_BETWEEN(SYSDATE+1000,SYSDATE)),12) "1000일후 개월수",
	trunc(MONTHS_BETWEEN(sysdate + 1000, sysdate)),12) "개월 나머지",
	
FROM dual;

SELECT 
	trunc(MONTHS_BETWEEN(sysdate + 1000, sysdate)/12) "년",
	mod(trunc(MONTHS_BETWEEN(SYSDATE+1000,SYSDATE)),12) "개월"
FROM dual;

--add_months
SELECT add_months(SYSDATE,4) "오늘로부터 4개월 후",
	add_months(SYSDATE,-3) "오늘로부터 3개월 전"
FROM dual;

SELECT ENAME , HIREDATE 
FROM emp;
SELECT ENAME , HIREDATE ,add_months(HIREDATE,18) "입사후 1년 6개월후" 
FROM emp;

SELECT ENAME ,DEPTNO,months_between(add_months(HIREDATE,1) ,HIREDATE) "인턴 기간", HIREDATE, add_months(HIREDATE,1)  
FROM emp
WHERE DEPTNO =10;

SELECT ENAME ,DEPTNO,months_between(add_months(HIREDATE,2) ,HIREDATE) "인턴 기간", HIREDATE, add_months(HIREDATE,2)  
FROM emp
WHERE DEPTNO =20;

SELECT ENAME ,DEPTNO,months_between(add_months(HIREDATE,3) ,HIREDATE) "인턴 기간", HIREDATE, add_months(HIREDATE,3)  
FROM emp
WHERE DEPTNO =30;
/*
next_day last_day

 * */



