/*
# 숫자 함수
1. 숫자 데이터를 처리하기 위한 함수
2. 종류
	1) round : 지정한 소숫점 자리로 반올리 처리
		round(데이터, 자릿수)
		자릿수가 +값은 소숫점 이하 자리수
		자릿수가 -값은 10단위 이상의 자릿수 처리
	2) trunc : 지정한 소숫점 자리까지 남기고 절삭 처리
		trunc(데이터, 자릿수)
	3) mod : 데이터베이스에서는 %없기 때문에, 함수로 나머지처리
		mod(데이터m,n) : 데이터를 m을 n으로 나눈 나머지
		ex) mod(10,3) ==>1
	4) ceil : 지정한 값보다 큰 수 중에서 가장 작은 정수
		소수점이하의 내용에 대하여 올리처리 정수
		ex) ceil(123.17) ==>124
	5) floor : 지정한 값보다 작은 수 중에서 가장 큰 정수
		ex) floor(123.9) ==> 123
*/
SELECT 
	round(2433.2434,1) "소숫점한자리",
	round(2433.2434,2) "소숫점두자리",
	round(2433.2434,-1) "십자리",
	round(2433.2434,-2) "백자리"
FROM dual;

-- sal와 nvl이 적용된 comm의 합산을 사원명, 급여1(소숫점1자리)
SELECT ename,round(sal+nvl(comm,0),1) "급여합산1", round(sal+nvl(comm,0),-2) "급여합산2"
FROM emp;

SELECT 
	trunc(2433.2434,1) "소숫점한자리",
	trunc(2433.2434,2) "소숫점두자리",
	trunc(2433.2434,-1) "십자리",
	trunc(2433.2434,-2) "백자리"
FROM dual;

SELECT mod(5,2) "2나머지", mod(11,3) "3나머지"
FROM dual;

-- 
SELECT empno "청팀",ename "이름"
FROM EMP e 
WHERE MOD(empno,2)=1;

SELECT empno "백팀",ename "이름"
FROM EMP e 
WHERE MOD(empno,2)=0;