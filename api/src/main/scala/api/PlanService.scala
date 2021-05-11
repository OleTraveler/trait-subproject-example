package api

case class Model(ticker: String)
case class Plan(id: Int, name: String)

trait PlanService {
  def getPlan(id: Int): Option[Plan]
  def getModelsForPlan(planId: Int): List[Model]
}
