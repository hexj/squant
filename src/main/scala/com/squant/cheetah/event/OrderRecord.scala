package com.squant.cheetah.event

import java.time.LocalDateTime

import com.squant.cheetah.domain.Direction

/**
  * 记录股票交易状态，持仓情况，以及风险分析指标
  */
case class OrderRecord(code: String,
                       direction: Direction,
                       amount: Int,
                       price: Double, //价格
                       volume: Double, //当日买入卖出额
                       cost: Double, //交易费用
                       ts: LocalDateTime
                 ) {
  override def toString: String = {
    f"$ts $code $direction $amount,$price%2.2f,$volume%2.2f,$cost%2.2f"
  }
}
