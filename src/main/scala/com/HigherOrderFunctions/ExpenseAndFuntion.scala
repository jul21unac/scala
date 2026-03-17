package com.HigherOrderFunctions

object ExpenseAndFuntion {

  private def ApplyExpen(incomings: List[Double] , ApplyFuntion: Double => Double ) : List[Double] =
    incomings.map(ApplyFuntion)

  def taxes(incomings : List[Double]) : List[Double] = {
    ApplyExpen(incomings ,income=> income*3.19 )
  }

  def EnergyBill(incomings : List[Double]) : List[Double] =
    ApplyExpen(incomings ,inco => inco-50 )

  def MobilBill(incoming: List[Double]) : List[Double] =
    ApplyExpen(incoming ,_ - 10  )
}
