#time complexity : O(n^2)
def max_profit(prices):
    max_profit = 0 
    n= len(prices)
    for i in range(n):
        for j in range(i+1,n):
            profit = prices[j] - prices[i]
            if profit> max_profit:
                max_profit=profit
    return max_profit

prices = [7, 1, 5, 3, 6, 4]
print(max_profit(prices))

#optimized solution 
#time complexity : O(n)
def max_profits_using_fixed_price(prices):
    min_price = float("inf")
    max_profit = 0
    for price in prices:
        if price < min_price :
            min_price = price
        elif (price - min_price)>max_profit:
            max_profit=price - min_price
    return max_profit

prices2 = [3,4,10,8,9]
print(max_profits_using_fixed_price(prices2))