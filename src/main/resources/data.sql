--INSERT INTO conseillers (id,nom_Conseiller,prenom_Conseiller,login,password) VALUES
--  ('1','Coty','Rene','Crene','monami'),
--  ('2','Faure','Felix','Ffelix','pompe'),
--  ('3','Auriol','Vincent','Avincent','random');


DROP TABLE IF EXISTS conseillers;

CREATE TABLE conseillers (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nom_Conseiller VARCHAR(250) NOT NULL,
	prenom_Conseiller VARCHAR(250) NOT NULL,
	login VARCHAR(250) NOT NULL,
	password  VARCHAR(250) NOT NULL
);


INSERT INTO conseillers (ID,nom_Conseiller,prenom_Conseiller,login,password) VALUES
  ('1','Coty','Rene','Crene','monami'),
  ('2','Faure','Felix','Ffelix','pompe'),
  ('3','Auriol','Vincent','Avincent','random');

--  INSERT INTO Client (ID,NOM,PRENOM,COURRIEL,ADRESSE,TELEPHONE,CONSEILLER_ID) VALUES
--  ('11','Parker','Peter','spidy@lol.com','1 rue de la toile','0101010101','1'),
--  ('22','Wayne','Bruce','batou@lol.com','2 rue de la cave','0202020202','1'),
--  ('33','Roux','Charly','jaazou@lol.com','3 rue des cheveux','0303030303','2'),
--  ('44','Choucroute','Helmout','saucisse@lol.com','4 rue de la ferme','0404040404','2');
