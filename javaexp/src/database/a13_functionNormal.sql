/*

일반 기능 함수

1. nvl()
2. nvl2(데이터|컬럼명, null이 아닐 때 처리할 데이터, null일떄 처리할 데이터
comm이 null일 때는 100으로 null이 아닐때 10% 더 추가해서 결과값을 처리
**/
SELECT ename, sal, nvl2(comm, comm*1.1, 100) 보너스
FROM EMP e ;
--comm이 null일 때는 sal 15%으로 null이 아닐때 5% 추가
SELECT ename, sal, nvl2(comm, comm+sal*0.05, sal*0.15) 보너스
FROM EMP e;
/*
3.NULLIF(데이터1, 데이터2)
두개의 매개변수로 받는 데이터를 비교하여 동일하면 null로 반환하고, 동일하지 않으면
첫번째 데이터1을 반환처리하는 함수를 말한다.
- /
SELECT nullif('a','a') show1,
nullif('a','b') show2,
nvl(nullif('a','a'),'동일') show3,
nvl(nullif('a','b'),'동일') show4
FROM dual;
-- ex) dual 테이블을 이용하여 위 예제와 같이 처리하되 이번에는 숫자값을 비교하여
-- 1000, 1000
-- 1000, 2000 의 내용을 비교하여 nullif함수를 활용하여 결과값을 처리
SELECT nullif(1000,1000) show1,
nullif(1000,2000) show2,
nvl(nullif(1000,1000),0) show3, -- nvl은 첫번째 데이터 유형에 맞게 데이터를 처리하여야한다
nvl(nullif(1000,2000),0) show4
FROM dual;

/*

# decode 함수

1. 프로그래밍 언어의 if문이나 case문으로 표현되는 내용을 하나의 함수로
처리할 수 있게 해준다
2. 기본형식
decode(데이터,case1, case1에해당할떄처리, 그외처리);
decode(데이터,case1, case1에해당할떄처리,
case2, case2에해당할떄처리,
case3, case3에해당할떄처리,
위내용에 해당하지않을 때 처리할데이터)
- /
SELECT ename, deptno,
decode(deptno,10,'인사과',
20,'총무',
30,'회계',
'부서정하지않음') 부서명
FROM emp;
-- ex) 사원번호를 기준으로 짝수이면 홍팀, 홀수이면 청팀으로 처리하여 출력
SELECT ename,empno, decode(MOD(empno,2),1,'청팀',
0,'홍팀')
FROM emp;

/*

# 일반 기능 함수

1. nvl()
2. nvl2(데이터|컬럼명, null이 아닐 때 처리할 데이터, null일떄 처리할 데이터
comm이 null일 때는 100으로 null이 아닐때 10% 더 추가해서 결과값을 처리
**/
SELECT ename, sal, nvl2(comm, comm*1.1, 100) 보너스
FROM EMP e ;
--comm이 null일 때는 sal 15%으로 null이 아닐때 5% 추가
SELECT ename, sal, nvl2(comm, comm+sal*0.05, sal*0.15) 보너스
FROM EMP e;
/*
3.NULLIF(데이터1, 데이터2)
두개의 매개변수로 받는 데이터를 비교하여 동일하면 null로 반환하고, 동일하지 않으면
첫번째 데이터1을 반환처리하는 함수를 말한다.
- /
SELECT nullif('a','a') show1,
nullif('a','b') show2,
nvl(nullif('a','a'),'동일') show3,
nvl(nullif('a','b'),'동일') show4
FROM dual;
-- ex) dual 테이블을 이용하여 위 예제와 같이 처리하되 이번에는 숫자값을 비교하여
-- 1000, 1000
-- 1000, 2000 의 내용을 비교하여 nullif함수를 활용하여 결과값을 처리
SELECT nullif(1000,1000) show1,
nullif(1000,2000) show2,
nvl(nullif(1000,1000),0) show3, -- nvl은 첫번째 데이터 유형에 맞게 데이터를 처리하여야한다
nvl(nullif(1000,2000),0) show4
FROM dual;

/*

# decode 함수

1. 프로그래밍 언어의 if문이나 case문으로 표현되는 내용을 하나의 함수로
처리할 수 있게 해준다
2. 기본형식
decode(데이터,case1, case1에해당할떄처리, 그외처리);
decode(데이터,case1, case1에해당할떄처리,
case2, case2에해당할떄처리,
case3, case3에해당할떄처리,
위내용에 해당하지않을 때 처리할데이터)
- /
SELECT ename, deptno,
decode(deptno,10,'인사과',
20,'총무',
30,'회계',
'부서정하지않음') 부서명
FROM emp;
-- ex) 사원번호를 기준으로 짝수이면 홍팀, 홀수이면 청팀으로 처리하여 출력
SELECT ename,empno, decode(MOD(empno,2),1,'청팀',
0,'홍팀')
FROM emp;

SELECT ename,HIREDATE, to_char(hiredate,'Q') "분기"
FROM emp;

- - 입사일의 분기 기준으로 출장을 가기로 결정 1:부산 2:광주 3:제주 그외 출장없음
-- 사원명, 입사일, 분기, 출장지를 출력하세요
SELECT ename, HIREDATE, to_char(hiredate,'Q') "분기",
decode(to_char(HIREDATE,'Q'),'1','부산',
'2','광주',
'3','제주',
'출장없음') 출장지
FROM emp;

/*

# 일반함수 case

1. decode의 확장된 함수 형식을 표현식 또는 컬럼 값 '=' 비교를 통해
조건의 일치하는 경우에만 다른 값으로 대치하지만, case 함수에서는
산술 연산, 관계 연산, 논리 연산과 같은 다양한 비교가 가능하다
2. 기본 형식
    1. 조건문 형태 활용
    case when 논리|산술|관계 then 처리할 데이터
    when 논리|산술|관계 then 처리할 데이터
    else 기타처리할 데이터
    end
    
    ## 주의
    
    case when 은 앞에서 선언 조건식을 제외한 조건을 처리한다
    
    1. switch case 문형태
    case [컬럼명]
    when 데이터1 then 처리할데이터
    when 데이터2 then 처리할데이터
    else 그외데이터
    end
- */
-- 부서번호에 따라 처리하는 데이터를 다르게 할떄
SELECT ENAME , DEPTNO,
CASE WHEN DEPTNO =10 THEN sal*0.2
-- 여러가지 비교와 논리연산자 활용하여 결과값을 리턴할 수 있다.
WHEN DEPTNO =20 THEN sal*0.5
WHEN DEPTNO =30 THEN sal*0.7
ELSE sal*1.2
END show
FROM emp;
- -ex) case when 구문을 이용하여 5000이상 'A'등급
--	4000~5000미만 'B'
--	3000~4000미만 'C'
--	1000~2000미만 'D'
--	0~1000 'E'
--	그외 등급분류불가

SELECT ename 이름, sal 급여,
CASE WHEN sal>=5000 THEN 'A'
WHEN sal<5000 AND sal>=4000 THEN 'B'
WHEN sal<4000 AND sal>=3000 THEN 'C'
WHEN sal<3000 AND sal>=2000 THEN 'D'
WHEN sal<2000 AND sal>=1000 THEN 'E'
WHEN sal<1000 AND sal>=0 THEN 'F'
ELSE '등급분류 불가'
END "등급"
FROM emp;

/*

# 일반 기능 함수

1. nvl()
2. nvl2(데이터|컬럼명, null이 아닐 때 처리할 데이터, null일떄 처리할 데이터
comm이 null일 때는 100으로 null이 아닐때 10% 더 추가해서 결과값을 처리
**/
SELECT ename, sal, nvl2(comm, comm*1.1, 100) 보너스
FROM EMP e ;
--comm이 null일 때는 sal 15%으로 null이 아닐때 5% 추가
SELECT ename, sal, nvl2(comm, comm+sal*0.05, sal*0.15) 보너스
FROM EMP e;
/*
3.NULLIF(데이터1, 데이터2)
두개의 매개변수로 받는 데이터를 비교하여 동일하면 null로 반환하고, 동일하지 않으면
첫번째 데이터1을 반환처리하는 함수를 말한다.
*/
SELECT nullif('a','a') show1,
nullif('a','b') show2,
nvl(nullif('a','a'),'동일') show3,
nvl(nullif('a','b'),'동일') show4
FROM dual;
-- ex) dual 테이블을 이용하여 위 예제와 같이 처리하되 이번에는 숫자값을 비교하여
-- 1000, 1000
-- 1000, 2000 의 내용을 비교하여 nullif함수를 활용하여 결과값을 처리
SELECT nullif(1000,1000) show1,
nullif(1000,2000) show2,
nvl(nullif(1000,1000),0) show3, -- nvl은 첫번째 데이터 유형에 맞게 데이터를 처리하여야한다
nvl(nullif(1000,2000),0) show4
FROM dual;

/*

# decode 함수

1. 프로그래밍 언어의 if문이나 case문으로 표현되는 내용을 하나의 함수로
처리할 수 있게 해준다
2. 기본형식
decode(데이터,case1, case1에해당할떄처리, 그외처리);
decode(데이터,case1, case1에해당할떄처리,
case2, case2에해당할떄처리,
case3, case3에해당할떄처리,
위내용에 해당하지않을 때 처리할데이터)
*/
SELECT ename, deptno,
decode(deptno,10,'인사과',
20,'총무',
30,'회계',
'부서정하지않음') 부서명
FROM emp;
-- ex) 사원번호를 기준으로 짝수이면 홍팀, 홀수이면 청팀으로 처리하여 출력
-- # 중첩함수 : 함수에서 그결과를 가지고 다시 포함하는 함수의 매개변수로 전달해서 데이터를 처리
-- 1. 함수적용1 : 짝수 0, 홀수 1 - 이러한 0, 1의 결과값을 가지고 
-- 2. 함수적용2 : decode라는 함수를 통해서 0일때는 홍팀이 처리되게 하고,
-- 
SELECT ename,empno, decode(MOD(empno,2),1,'청팀',
0,'홍팀')
FROM emp;

SELECT ename,HIREDATE, to_char(hiredate,'Q') "분기"
FROM emp;

- - 입사일의 분기 기준으로 출장을 가기로 결정 1:부산 2:광주 3:제주 그외 출장없음
-- 사원명, 입사일, 분기, 출장지를 출력하세요
SELECT ename, HIREDATE, to_char(hiredate,'Q') "분기",
decode(to_char(HIREDATE,'Q'),'1','부산',
'2','광주',
'3','제주',
'출장없음') 출장지
FROM emp;

/*

# 일반함수 case

1. decode의 확장된 함수 형식을 표현식 또는 컬럼 값 '=' 비교를 통해
조건의 일치하는 경우에만 다른 값으로 대치하지만, case 함수에서는
산술 연산, 관계 연산, 논리 연산과 같은 다양한 비교가 가능하다
2. 기본 형식
    1. 조건문 형태 활용
    case when 논리|산술|관계 then 처리할 데이터
    when 논리|산술|관계 then 처리할 데이터
    else 기타처리할 데이터
    end
    
    ## 주의
    
    case when 은 앞에서 선언 조건식을 제외한 조건을 처리한다
    
    1. switch case 문형태
    case [컬럼명]
    when 데이터1 then 처리할데이터
    when 데이터2 then 처리할데이터
    else 그외데이터
    end
*/
-- 부서번호에 따라 처리하는 데이터를 다르게 할떄
SELECT ENAME , DEPTNO,
CASE WHEN DEPTNO =10 THEN sal*0.2
-- 여러가지 비교와 논리연산자 활용하여 결과값을 리턴할 수 있다.
WHEN DEPTNO =20 THEN sal*0.5
WHEN DEPTNO =30 THEN sal*0.7
ELSE sal*1.2
END show
FROM emp;
--ex) case when 구문을 이용하여 5000이상 'A'등급
--	4000~5000미만 'B'
--	3000~4000미만 'C'
--	1000~2000미만 'D'
--	0~1000 'E'
--	그외 등급분류불가

SELECT ename 이름, sal 급여,
CASE WHEN sal>=5000 THEN 'A'
WHEN sal>=4000 THEN 'B'
--case when은 앞에 있는 조건을 제외시킨다
--원래는 WHEN sal<5000 AND sal>=4000 THEN 'B'
WHEN sal>=3000 THEN 'C'
WHEN sal>=2000 THEN 'D'
WHEN sal>=1000 THEN 'E'
WHEN  sal>=0 THEN 'F'
ELSE '등급분류 불가'
END "등급"
FROM emp;

SELECT ENAME ,DEPTNO, sal,
	CASE DEPTNO  --특정한 컬럼 지정
		WHEN 10 THEN sal*0.2 -- 해당 deptno가 값을 나타낼때(부서별로 보너스지정)
		WHEN 20 THEN sal*0.5
		WHEN 30 THEN sal*0.7
		ELSE sal*1.2
	END 보너스
FROM emp;

--ex)입사 분기별로 sal 기준으로 보너스를 지정할려고 할때,
--	1/4 30%, 2/4 20% 3/4 10% 4/4 5% 처리 출력
SELECT ENAME, HIREDATE, to_char(hiredate,'Q') "분기",sal,
CASE to_char(hiredate,'Q')
	WHEN '1' THEN sal * 0.3
	WHEN '2' THEN sal * 0.2
	WHEN '3' THEN sal * 0.1
	else sal*0.05
END "보너스"
FROM emp;