package advisor

import api.{Model, Plan, PlanService}

class PlanImpl extends PlanService {

  val plans: Map[Int,Plan] = Map(1-> Plan(1,"TestPlan"), 2 -> Plan(2, "Other Plan"))
  val models: Map[Int, List[Model]] = Map(1 -> List(Model("GOOG"), Model("AAPL")), 2 -> List("TSLA"))

  override def getPlan(id: Int): Option[Plan] = plans.get(id)

  override def getModelsForPlan(planId: Int): List[Model] = models.getOrElse(planId, List.empty)
}
