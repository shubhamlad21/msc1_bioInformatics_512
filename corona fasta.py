file=open("corona fasta.txt","r")
r=file.read()
size=len(r)
score_A=0
score_C=0
score_T=0
score_G=0
for i in range(size):
     if (r[i]=='A'):
          score_A+=1
     elif (r[i]=='C'):
          score_C+=1
     elif (r[i]=='T'):
          score_T+=1
     elif (r[i]=='G'):
          score_G+=1
print("Score of A id",score_A)
print("Score of C id",score_C)
print("Score of T id",score_T)
print("Score of G id",score_G)
