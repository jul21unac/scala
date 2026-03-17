package com.HigherOrderFunctions

object Expenses {

  def taxes(incomings : List[Double]) : List[Double] =
    incomings.map(income=> income*3.19)

  def EnergyBill(incomings : List[Double]) : List[Double] =
    incomings.map(inco => inco-50)

  def MobilBill(incoming: List[Double]) : List[Double] =
    incoming.map(_ - 10 )

}
