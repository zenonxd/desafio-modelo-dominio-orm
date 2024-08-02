INSERT INTO tb_atividade(name, descricao, preco) VALUES ('Curso de HTML', 'Aprenda HTML de forma prática', 80.0);
INSERT INTO tb_atividade(name, descricao, preco) VALUES ('Oficina do Github', 'Controle versões de seus projetos', 50.0);

INSERT INTO tb_participante(name, email) VALUES ('José Silva', 'jose@gmail.com');
INSERT INTO tb_participante(name, email) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participante(name, email) VALUES ('Maria do Rosario', 'maria@gmail.com');
INSERT INTO tb_participante(name, email) VALUES ('Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_participante_atividade(participante_id, atividade_id) VALUES (1, 1);
INSERT INTO tb_participante_atividade(participante_id, atividade_id) VALUES (1, 2);

INSERT INTO tb_participante_atividade(participante_id, atividade_id) VALUES (2, 1);

INSERT INTO tb_participante_atividade(participante_id, atividade_id) VALUES (3, 1);
INSERT INTO tb_participante_atividade(participante_id, atividade_id) VALUES (3, 2);

INSERT INTO tb_participante_atividade(participante_id, atividade_id) VALUES (4, 2);