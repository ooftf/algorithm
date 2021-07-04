package com.ooftf.algorithm.leetcode

/**
给定一个数组 prices ，其中 prices[i] 是一支给定股票第 i 天的价格。

设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class MaxProfitSolution2 {
    fun maxProfit(prices: IntArray): Int {
        var result = 0

        (prices.indices).forEach {
            if(it != 0){
                if ((prices[it] > prices[it-1])) {
                    result += (prices[it] -prices[it-1])
                }
            }
        }
        return result
    }
    fun maxProfit2(prices: IntArray): Int {
        var result = 0
        var pre = prices[0]
        prices.forEach { i ->
            if ((i > pre)) {
                result += (i-pre)
            }
            pre = i
        }
        return result
    }
}