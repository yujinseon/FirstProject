/*
# 데이터 타입의 변환
1. 숫자나 날짜 타입을 문자와 함꼐 결합하거나 보고서
양식에 맞추기 위해 주로 사용한다.
2.묵시적 데이터 타입 변환
	-묵시적인 데이터 타입 변환은 정확한 연산을 위하여 
	오라클에서 데이터 타입을 내부적으로 변환하는 경우
 */
-- 아래와 같이 sql은 숫자형이지만 '800' 문자가 형변환이 일어나서
-- 해당 데이터를 확인 할 수 있다
SELECT *
FROM EMP e 
WHERE sla ='800';
SELECT *
FROM EMP e 
WHERE sla =TO_NUMBER('800'); --형변환 메서드를 이용해서 처리하여야 한다
/*
# 명시적인 데이터 타입 변환
1. 사용자가 데이터 타입 변환 함수를 이용하여 명시적으로 데이터 타입을 변환 처리하는 것을 말한다
2. 명시적 데이터 타입 변환 함수
	1) to_char : 문자/날짜 타입을 문자로 변환
	2) to_number : 문자열을 숫자 타입으로 변환
	3) to_date : 문자열을 날짜 타입으로 변환 
 
 **/
--to_char 함수
--1. 사용방법 : to_char(number|date, 'format')
SELECT  SYSDATE ,
	to_char(SYSDATE,'CC'), --세기 표현
	to_char(SYSDATE,'YYYY'), --연도 YYYY형식 표현
	to_char(SYSDATE,'YY') --연도 YY 표현
FROM dual;
--ex) 위 내용을 조건식에 넣어서 1980에 입사한 사람을 출력하세요
SELECT ename, HIREDATE 
FROM emp
WHERE to_char(HIREDATE,'YYYY')='1980';
/*
 2. 여러가지 출력형식
 	to_char(날짜,형식)
 	1) 'Q' : 분기 
 	2) 'MM' : 월 
 	3) MONTH' : 영문표기 
 	4) 'WW' : 연단위 주표기 @@년도의 @@째주 
 	5) 'W' : 월단위 주표기 @@월의 @@째주 
 	6) 'DD' : 일표기
 	7) 'DY'|'DAY' : 요일 표기 
 **/
SELECT ename, hiredate,
	to_char(hiredate,'YYYY') "년도",
	to_char(hiredate,'Q') "분기",
	to_char(hiredate,'MM') "월",
	to_char(hiredate,'MONTH') "월2",
	to_char(hiredate,'WW') "연단위주",
	to_char(hiredate,'W') "월단위주",
	to_char(hiredate,'DD') "일",
	to_char(hiredate,'DAY') "요일"
FROM EMP;

--EX) 1981 1/4분기에 입사한 사원의 이름과 입사년/월/분기를 표기하세요
SELECT ename,
	to_char(hiredate,'YYYY') "년도",
	to_char(hiredate,'MONTH') "월",
	to_char(hiredate,'Q') "분기"
FROM EMP
WHERE to_char(hiredate,'Q')='1' AND to_char(hiredate,'YYYY')='1981';

/*
4. date 타입의 시간 표시 형식
	1) AM/PM : 오전/오후/ 시간표시
	2) A.M/P.M : 오전/ 오후 시간표시
	3) HH/HH12: 시각(1~12) 표시
	4) HH24 : 24시간(0~23) 표시
	5) MI : 분
	6) SS : 초 
**/
SELECT TO_CHAR(SYSDATE,'AM HH:MI:SS') "시간" FROM DUAL;
--EX) EMP 테이블에서 사원명, 입사일 + 현재시간표현 YYYY년 @@월 @@일
-- 		24시간 표현 @@시 @@분 @@초 표현하여 출력하세요 5초
SELECT ename, TO_CHAR(HIREDATE,'YYYY"년 "MM"월 "DD"일"')||
	TO_CHAR(SYSDATE,'HH24"시 "MI"분 "SS"초"') "입사일 +현재시간"
FROM EMP;
/*
 5. 숫자형 데이터를 문자열 형식으로 변환 처리..
 	1) 기본형식 TO_CHAR(숫자형데이터,'형식')
 	2) 주요형식
 		해당자리수 이상의 데이터가 처리될 때는 ###으로 표기한다
 		9999: 기본 자리수에 맞게 처리
 		0000 : 해당 자리수 이하 일때 0으로 채워짐
 		$ : 앞에 $로표기 처리
 		. : 특정한 자리를 표기 소수점
 		, : X특정한 위치에 ,를 표기.(천단위표시)

 */
SELECT ename, sal
	to_char(sal,'99999') "형식1", --출력될 수 있는 크기를 지정(자릿수)
	to_char(sal,'00000') "형식2", --
	to_char(sal,'$9999') "형식3",
	to_char(sal,'9.999') "형식4",
	to_char(sal,'9,999.999') "형식5",
	to_char(sal*1000000,'9,999.999') "형식6"
FROM emp;
--ex) 사원명 급여 급여2(천단위 콤마 앞에 $표기, 소숫점 1자리표기)
SELECT ename "사원명", sal "급여", TO_CHAR(sal,'$9,999.9') "급여2"
FROM emp;

/*
# TO_NUMBER
1. 매개변수로 받은 숫자형 문자열을 숫자로 변환하여 연산이 가능하도록 처리한다
2. 기본형식 : TO_NUMBER(문자열)
CF) 주로 자동형 변환이 이러나서 사용되지 않는 경우도 많으나, 명시적인 처리로
해당 타입에 대한 구분을 할 때 사용된다
'문자열1'||'문자열2' :문자열을 이어주는 처리
ORCLE에서는 + 연자할 떄만, || 문자열을 이어줄 떄 구분하여 처리
'숫자형 문자열1'*'숫자열문자열'  : 자동형변환으로 연산처리된다

**/
SELECT '25'+25, TO_NUMBER('25'+25) --자동 형변환
FROM DUAL;
/*
 # 중첩함수
 1. 가장 내부에 있는 함수 F1의 결과갑을 다음 함수 F2에 인수로 적용하고
 	다시 F2의 결과값을 F3에 인수로 사용할 때 활용하는 함수형태를 말한다
 	F3(F2(F1(데이터,매개변수),매개변수,매개변수)
 	- 특정한 데이터에서 여러가지 함수의 기능을 처리하고자 할 때, 활용된다
 	
 	EX))현재 데이터의 입사년도를 올해연도로 변경하여 출력하려고 한다
 	합쳐서 날짜 데이터로 변경처리
 **/
SELECT ename, to_char(SYSDATE,'YYYY') "올해년도",
	TO_CHAR(HIREDATE,'MMDD') "사원의 입사월일",
	TO_CHAR(SYSDATE,'YYYY')||TO_CHAR(HIREDATE,'MMDD') "올해 입사년월",
	TO_DATE(TO_CHAR(SYSDATE,'YYYY')||
		TO_CHAR(HIREDATE,'MMDD'),'YYYYMMDD') "날짜형데이터"
FROM EMP;