DROP TABLE il8;
DROP TABLE il12;
DROP TABLE nphil;
DROP TABLE tnfavivo;




create table il8 (
    id SERIAL PRIMARY KEY,
    link varchar(256) NOT NULL,
    figure varchar(8),
    author varchar(64) NOT NULL,
    morphotype varchar(32) NOT NULL,
    liveORfixed varchar(8),
    fixationmethod varchar(32),
    initialAFinoculum varchar(32),
    Afumigatusstrain varchar(32),
    infectionmodel varchar(32),
    strain varchar(32),
    age varchar(32),
    treatment varchar(128),
    infectionroute varchar(32),
    sample varchar(16),
    sampleVolume varchar(256),
    sampleSize varchar(32),
    tUnits varchar(64),
	times varchar(256)
);
\COPY il8(link,figure,author,morphotype,liveORfixed,fixationmethod,initialAFinoculum,Afumigatusstrain,infectionmodel,strain,age,treatment,infectionroute,sample,sampleVolume,sampleSize,tUnits) FROM 'C:/Users/Andreas/Desktop/Year3/prg3/ExDB/dataset/csvfiles/il8data.csv' DELIMITER ',' CSV Header
		
		
		
create table il12 (
    id SERIAL PRIMARY KEY,
    link varchar(256) NOT NULL,
    figure varchar(8),
    author varchar(64) NOT NULL,
    morphotype varchar(32) NOT NULL,
    liveORfixed varchar(8),
    fixationmethod varchar(32),
    initialAFinoculum varchar(32),
    Afumigatusstrain varchar(32),
    infectionmodel varchar(32),
    strain varchar(32),
    age varchar(32),
    treatment varchar(128),
	cellconcentration varchar(32),
    infectionroute varchar(32),
    sample varchar(16),
    sampleVolume varchar(256),
    sampleSize varchar(32),
	analysis varchar(32),
    tUnits varchar(64),
	times varchar(256)
);
\COPY il12(link,author,morphotype,liveORfixed,fixationmethod,initialAFinoculum,Afumigatusstrain,infectionmodel,strain,age,treatment,cellconcentration,infectionroute,sample,sampleVolume,sampleSize,analysis,tUnits) FROM 'C:/Users/Andreas/Desktop/Year3/prg3/ExDB/dataset/csvfiles/il12data.csv' DELIMITER ',' CSV Header
		
		
		
create table nphil (
    id SERIAL PRIMARY KEY,
    link varchar(256) NOT NULL,
    figure varchar(8),
    author varchar(64) NOT NULL,
    morphotype varchar(32) NOT NULL,
    liveORfixed varchar(8),
    fixationmethod varchar(32),
    initialAFinoculum varchar(32),
    Afumigatusstrain varchar(32),
    infectionmodel varchar(32),
    strain varchar(32),
    age varchar(32),
    treatment varchar(128),
	cellconcentration varchar(32),
    infectionroute varchar(32),
    sample varchar(16),
    sampleVolume varchar(256),
    sampleSize varchar(32),
	analysis varchar(32),
    tUnits varchar(64),
	times varchar(256)
);
\COPY nphil(link,figure,author,morphotype,liveORfixed,fixationmethod,initialAFinoculum,Afumigatusstrain,infectionmodel,strain,age,treatment,cellconcentration,infectionroute,sample,sampleVolume,sampleSize,analysis,tUnits) FROM 'C:/Users/Andreas/Desktop/Year3/prg3/ExDB/dataset/csvfiles/nphildata.csv' DELIMITER ',' CSV Header
		
		
		
create table tnfavivo (
    id SERIAL PRIMARY KEY,
    link varchar(256) NOT NULL,
    figure varchar(8),
    author varchar(64) NOT NULL,
    morphotype varchar(32) NOT NULL,
    liveORfixed varchar(8),
    fixationmethod varchar(32),
    initialAFinoculum varchar(32),
    Afumigatusstrain varchar(32),
    infectionmodel varchar(32),
    strain varchar(32),
    age varchar(32),
    treatment varchar(128),
    infectionroute varchar(32),
    sample varchar(16),
    sampleVolume varchar(256),
    sampleSize varchar(32),
    tUnits varchar(64),
	times varchar(256)
);
\COPY tnfavivo(link,figure,author,morphotype,liveORfixed,fixationmethod,initialAFinoculum,Afumigatusstrain,infectionmodel,strain,age,treatment,infectionroute,sample,sampleVolume,sampleSize,tUnits) FROM 'C:/Users/Andreas/Desktop/Year3/prg3/ExDB/dataset/csvfiles/tnfavivodata.csv' DELIMITER ',' CSV Header
		
		
		
		