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

DROP TABLE IF EXISTS clients;

CREATE TABLE clients (
	id INT AUTO_INCREMENT PRIMARY KEY,
	raison_Sociale VARCHAR(250) NOT NULL,
	libelle_Client VARCHAR(250) NOT NULL,
	numero_Tel VARCHAR(250) NOT NULL,
	mail VARCHAR(250) NOT NULL,
	adresse VARCHAR(250) NOT NULL,
	id_Conseiller INT NOT NULL
);


INSERT INTO conseillers (id,nom_Conseiller,prenom_Conseiller,login,password) VALUES
  ('1','Coty','Rene','Crene','monami'),
  ('2','Faure','Felix','Ffelix','pompe'),
  ('3','Auriol','Vincent','Avincent','random');

  INSERT INTO clients (id,raison_Sociale,libelle_Client,numero_Tel,mail,adresse,id_Conseiller) VALUES
  ('1','Parker','Peter','spidy@lol.com','1 rue de la toile','0101010101','1'),
  ('2','Wayne','Bruce','batou@lol.com','2 rue de la cave','0202020202','1'),
  ('3','Roux','Charly','jaazou@lol.com','3 rue des cheveux','0303030303','2'),
  ('4','Choucroute','Helmout','saucisse@lol.com','4 rue de la ferme','0404040404','2');
