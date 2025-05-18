-- 1. 예약 먼저 삭제
DELETE FROM reservation WHERE user_id = 1;

-- 2. 사용자 삭제
DELETE FROM user WHERE id = 1;

-- 3. 사용자 삽입
INSERT INTO user (id, name, email, password, created_at, updated_at)
VALUES (1, '김태환', 'taehwan@example.com', '1234', NOW(), NOW());
