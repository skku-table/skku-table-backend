INSERT INTO user (id, name, email, password, created_at, updated_at)
VALUES (1, '김태환', 'taehwan@example.com', '1234', NOW(), NOW());

INSERT INTO festival (id, name, start_date, end_date, location, description, like_count, created_at, updated_at)
VALUES (1, '2025 대동제', '2025-05-20', '2025-05-22', '운동장', '재밌는 축제', 0, NOW(), NOW());

INSERT INTO booth (id, festival_id, name, host, location, description, start_date_time, end_date_time, like_count, created_at, updated_at)
VALUES (2, 1, '맥주왕부스', '김태환팀', '운동장 중앙', '시원한 맥주 부스', NOW(), NOW(), 0, NOW(), NOW());
