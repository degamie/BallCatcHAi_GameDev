import sys,pandas as pd,joblib
 def classifyAIMdl(mdlSize,inpDataFile):
     inpDataFile=pd.read_csv(inpDataFile)
     loadMdl=joblib.load(mdlSize)
     prediction=loadMdl.predict(inpDataFile)
     print(prediction)

 loadMdl=sys.argv[1]
 inpDataFile=sys.argv[2]

classifyAIMdl(mdlSize,inpDataFile)