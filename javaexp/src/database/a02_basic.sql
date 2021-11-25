SELECT * FROM emp;
/*
# 데이터 조합하기
데이터는 select 구문을 이용하여 저장된 데이터를 호출(query) 할 수 있다
1. 기본형식
	select* 컬럼명, 컬렁명2
	from 테이블명
	where 조건
 * */
/*dept 데이블의 전체를 검색한 sql 작성하고 deptno, dname 선택하여 출력*/

SELECT deptno, dname 
FROM DEPT;

/*
2. 컬럼명 별칭 처리하기
select 컬럼명 as 별칭명, 컬럼명 별칭명 from 테이블
해당 테이블 구조 안에 있는 컬럼명이 as나 한칸 띄움으로 별칭으로 호출 할 수 있다
 * */
SELECT empno AS no, ename AS name, HIREDATE AS hd 
FROM emp;


SELECT * FROM emp;

SELECT empno "번호", ename "이 름",JOB "직 업", MGR "관리자 번호",HIREDATE AS "날 짜"
FROM emp;
/*
# 데이터 산술 연산 처리와 concatnate(문자열|컬럼의 연결)
1. 숫자형 컬럼을 사직 연산 처리가 가능하다 + - 
2. 문자열과 컬럼 간의 연결 처리는 '문자열' || 컬럼명

**/
SELECT empno, mgr, mgr+10, mgr-5,mgr*10,
		'직책은'||job "show"
FROM emp;
/*ename에 @@@님이라고 문자열 '님'을 추가, sal에 급여 10 더해서 출력*/
SELECT ename||'님' , sal+10
FROM emp;

/*
# 컬럼간의 연결
select 컬럼1 || 컬럼2|| '문자열'||컬럼3 "출력타이틀"
--- 부서번호 @@의 @@ 사원의 직책은 @@@이고 급여는 @@@입니다
**/
SELECT *
FROM emp;
SELECT '부서번호'|| deptno||'인 '|| ename||' 사원의 직책은 '||job||'이고, 급여는 '|| sal||'입니다.' show
FROM emp;
--ex) 급여가 @@@ 만원인 사원 @@@는 직책이 @@ 입니다
--			sal         ename      job
SELECT '급여가 '||sal||'만원인 사원 '||ename||'는 직책이 '||job||'입니다'
FROM emp;

--ex) @@@님의 보너스는 급여의 300%인 @@@만원이어서 이번달 총 급여는 sal + 보너스 입니다.
SELECT ename||'님의 보너스는 급여의 300%인 '||sal*3||'만원이어서 올해 총 급여는 '||(sal+(sal*3))||'만원이다' show
FROM emp;

