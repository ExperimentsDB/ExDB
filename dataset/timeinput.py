import pandas as pd
import math

def get_data(fileindex):
	filename=  r'csvfiles' + fileindex+'times.csv'
	times = pd.read_csv(filename)
	return times

def isNaN(num):
    return num == num

def main():
	fList=[r'\il8', r'\il12', r'\nphil',r'\tnfavivo']
	f=open('jsonin.sql','w')
	for file in fList:
		
		times=get_data(file)
		print(file)
		
		
		
		for paper in times.index.tolist():
			f.write('UPDATE %s SET times = ' %(file[1:]))
			f.write(r"'{")
			finds = 1
			for col in times.columns.tolist():
					if isNaN(times[col][paper]):
						if finds==1:
							f.write("%s:%s"%(col,str(times[col][paper])))
							finds = 2
						else:
							f.write(",%s:%s"%(col,str(times[col][paper])))
			f.write(r"}' WHERE id=%d; " %(paper+1))
			f.write('\n')
	f.close()
	
	
	
if __name__ == '__main__':
    main()
