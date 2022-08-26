seq1=list(input("Enter the first sequence: "))
seq2=list(input("Enter the second sequence: "))
score=[]
def pairwise(a,b):
    gap(a,b)
    print(a)
    print(b)
    value=1
    length=len(a)
    for i in range(0,length):
        if a[i]==b[i]:
            score.append('1')
            value+=0
        else:
            score.append('0')
    print("Score ",score)
    print("Value ",value)

def gap(a,b):
    if (len(a)==len(b)):
        print()
    else:
        k=int(input("Enter the position to insert the gap: "))
        if (len(a)<len(b)):
            a.insert(k,'-')
        else:
            b.insert(k,'-')
        return (a,b)
pairwise(seq1,seq2)
