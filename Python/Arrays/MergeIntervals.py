def merge_intervals(intervals):
    if not intervals: 
        return []
    
    #sorting intervals by start time 
    intervals.sort()

    merged = [] 

    for interval in intervals:
        if len(merged) == 0 or merged[-1][1] < interval[0]:
            merged.append(interval)
        else:
            merged[-1][1] =  max(merged[-1][1], interval[1])
    
    return merged

intervals = [[1, 3], [2, 6], [8, 10], [15, 18]]
print(merge_intervals(intervals))