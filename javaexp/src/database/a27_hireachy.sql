/*
 # 계층형 sql
 1. 계층형이란
 	구조가 상하위 관계로 상위구성요소에 의해 하위 구성요소가 만들어지는 것을 말한다.
 	회사의 조직구조, 행정부의 조직 구조, 알고리즘의 B트리인덱스, html의 태그 구조등이 있다
 	
 2. 데이터베이스 구조에서 계층형의 필요성
 	일반적으로 foreign key에 의해 다른 테이블과 연관관계로 설정되어, 처리되는 경우가 많은데
 	계층형은 하나의 테이블 내부에서 다시 다른 컬럼에 종속되어 처리되게 할 때, 사용한다.
 	 
 3. 계층형 sql의 데이터 구조
 	emp테이블의 mgr과 empno는 계층형 관계에 있다. 즉, 하나의 사원정보 row는
 	사원번호(empno)와 관리자(mgr)가 있는데 이 mgr은 사원번호를 다시 가지고 있다.
 	
 4. 계층형 sql의 주요 기능
 	1) sql 처리시, 상위에 있는 데이터를 하위에 바로 나올 수 있게 데이터를 처리할 수 있다.
 	2) 가장 밑에 node 부터 나오고 형제 레벨로 나오는 등, 계층적 데이터를 우선 순위로 나오게 할 수 있다
 	ex)		7839
 	7782	7698	7566
   7934   7844 7900  7902
   답변형 게시판에서 이런 계층 sql을 이용해서 처리하는 경우가 많다 
   			게시물1	게시물2	게시물3
   		  답글1 답글2	답글1	답글2 
   		 
  		게시물1
  			답글1
  			답글2
  		게시물2
  			답글1
  			답글2
   3) level을 통해서 계층의 레벨을 나타낼 수 있다
   4) 계층의 root 위치를 지정해서 해당 계층에서 부터 처리도 가능하게 한다
 5. 계층형 sql의 주요 키워드
 	1) select에서 쓰이는 키워드 : 
 		level: 각 컬럼에 해당하는 데이터의 계층 레벨을 표기한다.
 	2) start width 컬럼 = 조건 : 최상위 root 레벨을 지정하는 조건이다
 	3) connect by prior 컬럼1 =컬럼2 : 계층으로 나누어지는 컬럼의 관계를 설정하는 것이다
 		위 emp 같은 경우 mgr과 empno를 말한다
 		
 	select level
 	from 테이블명
 	start with mgr = null : 최상위 root 계층의 조건을 설정
 	connect by prior mgr =empno : 상/하위 계층을 연결하는 조건을 처리
 		
 6. 계층형 sqldml 구조 테이블 만들어 보기 및 활용하기
 * */
SELECT * FROM emp;
SELECT LEVEL,e.* -- 현재테이블의 컬럼 + 추가적인 내용을 처리할 때, 테이블의 alias를 이용한다
FROM emp e
START WITH job='PRESIDENT'
CONNECT BY PRIOR empno=mgr --상/하위 컬럼에 대한 내용을 조건으로 순위에 맞게 지정하여야한다. 하위컬럼 =상위컬럼
ORDER BY level;

/*
  	가족계층형 테이블 구성
  		할아버지(김덕만)
  	아버지 (김철수) 	작은아버지(김철민)
  나(김신화) 누나(김영애) 사촌(김민희)
 * */
--1. 테이블을 상하위 기준이 되는 컬럼을 설정해서 필요한 컬럼을 추가
--2. 최상위 root 노드의 기준 refno = 0
--3. 상 하위 연관관계 컬럼을 지정 no = refno

CREATE TABLE family(
	no number PRIMARY KEY, 
	refno NUMBER,
	name varchar2(30),
	role varchar2(50)
);
INSERT INTO family VALUES (1,0,'김덕만','할아버지');
INSERT INTO family VALUES (2,1,'김철수','아버지');
INSERT INTO family VALUES (3,1,'김철민','작은아버지');
INSERT INTO family VALUES (4,2,'김신화','나');
INSERT INTO family VALUES (5,2,'김영애','누나');
INSERT INTO family VALUES (6,3,'김민희','사촌동생');
SELECT *FROM family;

SELECT LEVEL, f.*
FROM family f 
START WITH refno=0
CONNECT BY PRIOR NO = refno ;
