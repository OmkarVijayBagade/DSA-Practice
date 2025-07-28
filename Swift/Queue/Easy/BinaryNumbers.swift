import Foundation 

func generateBinaryNumbers(_ n: Int){
    var q: [String] = []
    q.append("1")
    
    for _ in 1...n{
        let front = q.removeFirst()
        print(front)
        q.append(front + "0")
        q.append(front + "1")
        
    }
}
generateBinaryNumbers(5)