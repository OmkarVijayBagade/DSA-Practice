import Foundation 

func displayQueue(){
    //original queue
    var q: [Int] = [1,2,3,4,5]

    //helper queue
    var helper: [Int] = []

    //removing elements from the q, print them and push into helper
    while !q.isEmpty {
        if let front = q.first{
            print(front, terminator: " ")
            helper.append(front)
        }
        q.removeFirst()
    }

    //adding elements back into helper to queue
    while !helper.isEmpty{
        q.append(helper.removeFirst())
    }

    print("\nQueue restored: \(q)")
}

displayQueue()