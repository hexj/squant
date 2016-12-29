package com.squant.cheetah.engine

import com.squant.cheetah.trade.Portfolio
import com.squant.cheetah.domain._

//策略的上下文环境
class Context(c: Clock, startingCash: Double = 100000) {

  var name: String = "cheetah"

  val clock: Clock = c

  val portfolio: Portfolio = new Portfolio(startingCash)

  def broker: Broker = new Broker(portfolio)

  var benchmark: String = "000001"
  //设置滑点
  var slippage: Slippage = PriceRelatedSlippage()
  //扣费类型，默认为股票
  var costType: CostType = STOCK
  //设置佣金/印花税
  var cost: OrderCost = OrderCost(slippage = slippage, costType = costType)


}
