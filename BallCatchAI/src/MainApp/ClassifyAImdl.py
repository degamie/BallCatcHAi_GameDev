import sys,pandas as pd,joblib
 def classifyAIMdl(mdlSize,inpDataFile):
     inpDataFile=pd.read_csv(inpDataFile)
     loadMdl=joblib.load(mdlSize)
     prediction=loadMdl.predict(inpDataFile)
     accuracyScore=accuracyScore(y_test,prediction)*100
     precision=precision_score(y_test,prediction,average='weighted')*100
     recallScore=recall_score(y_test,prediction,average='weighted')*100
     f1Score=f1_score(y_test,prediction,average='weighted')*100
     print(prediction)

 loadMdl=sys.argv[1]
 inpDataFile=sys.argv[2]

classifyAIMdl(mdlSize,inpDataFile)