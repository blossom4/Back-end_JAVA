-- Data dictionary

-- 현재 접속한 데이터 베이스내의 테이블을 조회한다.
select * from tab;

-- 원하는 테이블의 구조를 조회한다.
desc table_name;

-- DDL (Data Definition Language)
-- 테이블과 인덱스의 구조를 관리한다.
-- create, drop, alter ...

-- DML (Data Manipulation Language)
-- 테이블 등에 데이터를 저장, 수정, 삭제, 추출 등을 처리한다.
-- insert, update, delete, select ...

-- DCL (Data Control Language)
-- 사용자 권한, 작업의 취소 등을 처리할 수 있다.
-- grant, revoke, commit, rollback ...