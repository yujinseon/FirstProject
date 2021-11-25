/*
# where 조건문
1. 질의에서 필요한 관계대수( =, < > )로 select된 컬럼의 데이터에
대햐여 row단위로 데이터를 filtering하는 작업을 수행하게 해준다
2. 관계대수를 논리식으로 연결하는 and, or, subquery를 추가적으로 
지원하고 있다

 * */
SELECT *
FROM emp 
WHERE sal>=2000;
/*
# 비교 연산자
1. != : 같지 않을 때, 조건문에서 검색해준다
2. not (조건문) : 해당 조건문이 아닐때 , 검색해준다
3. 컬럼명 is not null : null이 아닌 데잍를 검색해준다
	주의) 컬럼 = null(x) --> 컬렁명 is null 
 **/

SELECT *
FROM emp 
WHERE DEPTNO !=20;

SELECT *
FROM emp 
WHERE NOT (deptno =20);
---------------------------
SELECT *
FROM emp 
WHERE sal !=1600;

SELECT *
FROM emp 
WHERE NOT (sal=1600);
--------------------------
SELECT *
FROM emp 
WHERE DEPTNO =20 AND sal>=3000;
-- 위 경우에 그 반대 값
SELECT *
FROM emp 
WHERE NOT (DEPTNO =20 AND sal>=3000);
