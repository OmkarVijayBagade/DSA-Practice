//from N to 1

func fromNto1(_ n: Int){
    if n==0 { return}
        print(n)

    fromNto1(n - 1)
}
fromNto1(5)
print("\n")

func from1toN(_ n: Int){
    if n==0 {return}
    from1toN(n - 1)
    print(n)
}
from1toN(5)