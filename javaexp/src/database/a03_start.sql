/*
#기본적인 sql 질의어 구조
select 출력할 컬럼명 - 열단위 선택
from 테이블 - 대상 테이블
where 컬럼 =데이터 - 행단위 filetering 처리(비교,논리연산자)
group by having
order by
 * */
--ex) 열단위 empno ename job sal 선택
SELECT empno, ename, job, sal 
FROM EMP 
WHERE sal<3000;

--group by라는 함수를 쓰면 해당 그룹별로 나누어서 처리한다
-- sum avg max min
SELECT deptno, sum(sal) "그룹별 총계"
FROM EMP 
GROUP BY DEPTNO ;

SELECT * FROM emp;