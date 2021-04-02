package scheduler

trait CanSchedule[T] {
  type Task = T
  def forAllDue(f: Task => Unit): Unit
  def execute(t: Task): Unit
  def nextTime(t: Task): Long
  def delete(t: Task): Unit
}

class Scheduler {
  private var canSchedules = List[CanSchedule[_]]()

  def addTask[T](t: T)(implicit view: T => CanSchedule[T]): Unit = addTask(view(t))
  def addTask[T](implicit canSchedule: CanSchedule[T]): Unit = synchronized {
    canSchedules ::= canSchedule
  }

  def run() = canSchedules foreach { cs =>
    cs forAllDue { (t: cs.Task) =>
      cs execute t
      if (cs.nextTime(t) < System.currentTimeMillis) cs delete t
    }
  }
}
