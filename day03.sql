
SELECT  EMPLOYEE_ID, FIRST_NAME, SALARY FROM EMPLOYEES
WHERE DEPARTMENT_ID IN(10,30) AND SALARY > 1500;
SELECT DEPARTMENT_ID FROM EMPLOYEES;
--MANAGER_ID 관리자가 없는 몯느 사원에 이름 및 직종을 출력하세요

SELECT JOB_ID, FIRST_NAME FROM EMPLOYEES 
WHERE MANAGER_ID IS NULL;

--직업이 IT_PROG 또는 SA_AMAN 이면서 급여가 1000,3000,5000이 아닌 사원들의 이름 직종 및 급여를 조회
SELECT JOB_ID, FIRST_NAME, SALARY FROM EMPLOYEES
WHERE JOB_ID IN('IT_PROG','SA_MAN') AND SALARY NOT IN (1000,3000,5000);

--TBL_STUDENT
--학번 이름 전공 성별 생일
--BAN_CAHR CHECK제약조건을 위배
--INSERT INTO TBL_STUDENT (ID,NAME,MAJOR,GENDER,BIRTH)
--VALUES (0,'홍길동','컴퓨터공학과','A','1980-01-02');

INSERT INTO TBL_STUDENT (ID,NAME,MAJOR,GENDER,BIRTH)
VALUES (1,'박디비','컴퓨터공학과','W','1990-02-06');

SELECT *FROM TBL_STUDENT;

--DEFAULT 값 사용해보기 
INSERT INTO TBL_STUDENT (ID,NAME,MAJOR,BIRTH)
VALUES (2,'홍길동','컴퓨터공학과','1994-08-26');

--INSERT할때 컬럼명을 생략하면 디폴트값을 넣을 수 없다.
INSERT INTO TBL_STUDENT
VALUES (3,'이자바','컴퓨터공학과','M','1994-08-26');

--FLOWER테이블에 데이터 넣기
--꽃이름,색깔,가격
--장미꽃 빨간색 3000
INSERT INTO FLOWER (F_NAME,F_COLOR,F_PRICE)
VALUES ('장미꽃','빨간색',3000);

INSERT INTO FLOWER (F_NAME,F_COLOR,F_PRICE)
VALUES ('해바라기','노란색',2000);

INSERT INTO FLOWER VALUES ('튤립','흰색',4000);

SELECT *FROM FLOWER;

--POT 테이블에 데이터 추가하기
--화분번호 화분색깔 화분모양 꽃이름
--화분테이블에 데이터를 추가할 때 꽃테이블에 있는 꽃만 추가할 수 있다.
INSERT INTO POT (P_NUM,P_COLOR,P_FORM,F_NAME)
VALUES (202408260001,'검은색','사각형','장미꽃');

CREATE TABLE FLOWER2(
	F_NAME2 VARCHAR2(200) PRIMARY KEY,
	F_COLOR2 VARCHAR2(100),
	F_PRICE2 NUMBER
);

--다른 테이블에 있는 데이터를 조회해서 추가하는것이 가능하다.
INSERT INTO FLOWER2(F_NAME2,F_COLOR2,F_PRICE2)
SELECT F_NAME,F_COLOR,F_PRICE
FROM FLOWER;

SELECT * FROM FLOWER;

--여러 테이블에 한번에 추가하는것도 가능하다
INSERT ALL
	INTO FLOWER VALUES('개나리','보라색',5000)
	INTO FLOWER2 VALUES('계란꽃','흰색',7000)
SELECT*FROM  DUAL;

SELECT *FROM FLOWER;
SELECT *FROM FLOWER2;

--삭제
SELECT * FROM POT ; 

DELETE FROM POT WHERE F_NAME = '장미꽃';
--PK와 FK로 연결된 테이블에서 외래키로 참조되고있는 데이터는 부모테이블에서 삭제가 불가능하다.

SELECT * FROM POT;

--STUDENT 테이블에서 이름이 홍길동인 사람 삭제하기
DELETE FROM TBL_STUDENT WHERE NAME = '홍길동';

SELECT * FROM TBL_STUDENT;

--학생테이블에서 학번이 1번인 학생의 이름을 홍길동으로 성별을 남자로 수정하기

UPDATE TBL_STUDENT 
SET
NAME ='홍길동',
GENDER ='M'
WHERE ID=1;

SELECT * FROM TBL_STUDENT;

--회원과 관련괸 기능
--로그인 -> SELECT
--회원가입 -> INSERT
--회원정보수정 -> UPDATE
--회원탈퇴 -> DELETE

-- 상품과 관련되 기능
-- 검색 -> SELECT
-- 상품추가 -> INSERT
-- 재고수정 -> UPDATE
-- 상품삭제 -> DELETE

-- CRUD [ CREAT(INSERT) READ(SELECT) UPDATE DELETE ] 

--사원테이블에서 급여를 많이 받는 순으로 사번 이름 급여 입사일 순으로 출력하되
--급여가 같은 경우 입사일이 빠른순으로 정렬
SELECT EMPLOYEE_ID,FIRST_NAME,SALARY,HIRE_DATE
FROM EMPLOYEES
ORDER BY SALARY DESC, HIRE_DATE ASC;
--컬럼의 순서를 알고 있다면 번호로 정렬할 수 있다.
--ORDER BY '8' DESC, '6' ASC;

SELECT * FROM EMPLOYEES

--사원테이블에서 부서번호가 빠른순 부서번호가 같다면 직종이 빠른 순, 직종도 같다면 급여를 많이 받는순으로 정렬해서
--사번 이름 부서번호 직종 급여순으로 출력
SELECT EMPLOYEE_ID,FIRST_NAME,DEPARTMENT_ID,JOB_ID,SALARY FROM EMPLOYEES
ORDER BY DEPARTMENT_ID ,JOB_ID , SALARY DESC ;

--문자와 관련된 함수
--ASCII()
--지정된 문자의 ASCII값을 반환한다
SELECT  ASCII('A') FROM DUAL; 

--CHR()
--지정된 숫자의 아스키 문자를 반환
SELECT CHR(65) FROM DUAL;

--RPAD(데이터,고정길이,문자)
--데이터를 왼쪽으로 몰아서 정렬 시킨 후 빈 공백에 특정 문자를 채워 반환
SELECT RPAD(DEPARTMENT_NAME,10,'*') FROM DEPARTMENTS; 

--LPAD(데이터,고정길이,문자)
-- 데이터를 오른쪽으로 몰아서 정렬 후 생긴 빈 공백에 특정 문자를 채워 반환
SELECT LPAD(DEPARTMENT_NAME,10,'*') FROM DEPARTMENTS; 

--TRIM()
-- 문자열의 공백문자들을 삭제한다
SELECT TRIM('           TRIM           ') FROM DUAL;
--RTRIM() 오른쪽공백제거
--LTRIM() 완쪽공백제거

--INSTR()
--특정문자의 위치를 반환
SELECT INSTR('HELLOW','O')FROM DUAL; 

--INSTR(데이터,찾을문자,검색위치,몇번째위치)
SELECT INSTR('HELLOW','L',1,2) FROM DUAL; 

--찾는 문자열이 없으면 0을 반환
SELECT INSTR('HELLOW','Z')FROM DUAL;

--IMITCAP()
--첫문자를 대문자로 변환하는 함수
SELECT INITCAP('good morning') FROM DUAL;
SELECT INITCAP('good/morning') FROM DUAL;

--LENGTH()
--주어진 문자열의 길이를 반환
SELECT LENGTH ('JHON') FROM DUAL;

--CONCAT()
--주어진 두 문자열을 연결
SELECT CONCAT('HELLOW','WORLD') FROM DUAL;

--SUBSTR()
--문자열을 시작위치에서 길이만큼 자른 후 반환
--길이는 생략 가능하며, 생략 시 문자열의 끝까지 반환한다,
SELECT SUBSTR('HELLOW ORACLE',2),SUBSTR('HELLOW ORACLE',7,5) FROM DUAL;

--REPLACE(데이터,원래글자,바꿀글자)
SELECT REPLACE('GOOD MORNING', 'MORNING', 'EVENIMG')  FROM DUAL;

--UPPER()
--주어진 문자열을 전부 대문자 바꾼다
SELECT UPPER('good morning')  FROM DUAL;
--LOWER()
--주어진 문자열을 전부 소문자로 바꾼다
SELECT LOWER('GOOD MORNING')  FROM DUAL;


-- 부서번호가 50번인 사원들의 이름을 출력하되 이름이 el 을 모두 **로 대체하여 출력하세요
SELECT REPLACE(FIRST_NAME,'el','**') FROM EMPLOYEES WHERE DEPARTMENT_ID = 50;

-- 이름이 6글자 이상인 사원의 사번과 이름 , 급여를 출력
SELECT EMPLOYEE_ID,FIRST_NAME,SALARY  FROM EMPLOYEES WHERE length(first_name)>=6;
-- 'H E L L O W ' 의 공백을 모두 제거하여 출력하세요
SELECT REPLACE('H E L L O W ',' ','')  FROM DUAL;


CREATE TABLE PRODUCT2 (
"NO" NUMBER PRIMARY KEY,
NAME VARCHAR2(100) NOT NULL,
PRICE NUMBER,
P_DATE DATE
);

INSERT INTO PRODUCT2 VALUES (1000,'컴퓨터',100,SYSDATE);
INSERT INTO PRODUCT2 VALUES (1002,'냉장고',200,SYSDATE);
INSERT INTO PRODUCT2 VALUES (1003,'에어컨',300,SYSDATE);
INSERT INTO PRODUCT2 VALUES (1004,'오디오',20,SYSDATE);
INSERT INTO PRODUCT2 VALUES (1001,'세탁기',60,SYSDATE);

SELECT * FROM PRODUCT2;

--NO가 1000인 데이터에 PRICE 를 20 증가시키세요
UPDATE PRODUCT2 SET 
--PRICE = 120
PRICE = PRICE +20
WHERE "NO" = 1000;

--NAME이 세탁기인 데이터를 모두 삭제하세요 
DELETE FROM PRODUCT2 WHERE NAME ='세탁기'; 

SELECT * FROM PRODUCT2 ORDER BY PRICE DESC ;

/*
1. 정규화의 필요성으로 거리가 먼 것은?  2

1. 데이터 구조의 안정성 최대화
2 중복 데이터의 활성화
3 데이터 수정, 삭제 시 이상현상의 최소화
4 테이블 불일치 위험의 최소화

2. 관계 데이터베이스의 정규화에 대한 설명으로 옳지 않은 것은? 2

1. 정규화를 거치지 않으면 여러 가지 다른 종류의 정보가 하나의 릴레이션에 표현되기 때문에 릴레이션을 조작할 때 이상현상이 발생할 수 있다.
2. 정규화의 목적은 각 릴레이션에 분산된 종속성을 하나의 릴레이션에 통합하는 것이다.
3. 이상현상은 속성 간에 존재하는 함수 종속성이 원인이다.
4. 정규화가 잘못되면 데이터의 불필요한 중복을 야기하여 릴레이션을 조작할 때 문제가 된다.

3. 제2정규형에서 제3정규형이 되기 위한 조건은? 1

1. 이행적 함수 종속을 제거해야 한다.
2. 부분 함수 종속을 제거해야 한다.
3. 다치종속을 제거해야 한다.
4. 결정자가 후보키가 아닌 함수적 종속을 제거해야 한다.                                 
          
 도메인 원자값
 부분종속해소
 이행종속해소                          
     
                                                          
 
 스키마에 대해 아는대로 쓰시오
 데이터베이스의 제약 조건에 대해 전반적인 명세를 기술한 것
 
 개념 - 전체적인뷰
 내부 - 데이터를 어디에 저장을 할것인가
 외부 - 사용자의 입장에서 어떻게 사용할 것인가

 
 



                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
 */






































