//def func(array):
//        res = []
//        for item in array:
//        i=0
//        if len(item)<3:
//        res.append(item)
//        continue
//        while i+3 < len(item):
//        if item[i]==item[i+1] and (item[i+1]==item[i+2] or item[i+3]==item[i+2]):
//        item = item[:i+2]+item[i+3:]
//        continue
//        else:
//        i+=1
//        if len(item)>2 and item[-1]==item[-2] and item[-2]==item[-3]:
//        item=item[:-1]
//        res.append(item)
//        return res
//
//        N=int(input())
//        array = []
//        for i in range(N):
//        str_in = input()
//        array.append(str_in)
//        res = func(array)
//        for i in res:
//        print(i)