func sumNaturals(_ num: Int) -> Int{
if num==0 {return 0}
return num + sumNaturals(num-1)
}

print(sumNaturals(4))